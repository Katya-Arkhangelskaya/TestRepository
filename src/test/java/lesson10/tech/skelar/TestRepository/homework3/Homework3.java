package lesson10.tech.skelar.TestRepository.homework3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Homework3 {

    private List<Movie> top100Movies;

    @DataProvider(name = "top100MoviesProvider")
    public Object[] top100MoviesProvider() {
        return top100Movies.toArray();
    }

    @Test
    public void getTop100Movies() {
        open("https://www.imdb.com/chart/top/");
        $("h1.ipc-title__text").shouldHave(text("IMDb Top 250 Movies"));
        top100Movies = $$x("//ul[@class='ipc-metadata-list--dividers-between']/li").asDynamicIterable().stream()
                .limit(1).map(elem -> {
                    String name = elem.$x(".//h3").text().split("^(\\d+)\\.\\s")[1];
                    String year = elem.$x(".//div/span[contains(@class, 'cli-title-metadata-item')][1]").text();
                    String rating = elem.$x(".//span[@data-testid='ratingGroup--imdb-rating']").text().split("\n")[0];
                    String path = elem.$x(".//h3/..").attr("href");
                    return new Movie(name, year, rating, path);
                }).toList();
    }

    @Test(dataProvider = "top100MoviesProvider", dependsOnMethods = "getTop100Movies")
    public void checkTop100Movies(Object movieObj) {
        Movie movie = (Movie) movieObj;
        open(movie.getPath());
        $x("//span[@data-testid='hero__primary-text']").shouldHave(text(movie.getName()));
        $x("//span[@data-testid='hero__primary-text']/../../ul/li[1]/a").shouldHave(text(movie.getYear()));
        $x("(//div[@data-testid='hero-rating-bar__aggregate-rating__score']/span)[1]").shouldHave(text(movie.getRating()));
    }
}
