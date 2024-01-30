package lesson10.tech.skelar.TestRepository.homework1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Homework1 extends BaseTest {
    @Test
    public void GoogleTranslate() {
        var translation = $(By.xpath("//*[@id=\"yDmH0d\"]"));

        Stream.of("/pnaec", "/pnaek", "/pnaew", "/pnaff", "/pnadl", "/pnaga", "/pnahc",
                "/pnahl", "/pnbjh", "/pnbjn", "/pnbjx", "/ptarh", "/ptarp", "/ptase", "/ptasm",
                "/ptasw", "/ptatb", "/ptatf", "/ptatj", "/ptatt").forEach(url -> {
            open(url);
            translation.shouldBe(visible);
        });
    }
}
