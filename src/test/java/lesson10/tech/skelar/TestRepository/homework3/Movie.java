package lesson10.tech.skelar.TestRepository.homework3;

public class Movie {

    private String name;
    private String year;
    private String rating;
    private String path;

    public Movie(String name, String year, String rating, String path) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
