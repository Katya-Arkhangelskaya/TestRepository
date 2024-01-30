package lesson10.tech.skelar.TestRepository.homework1;

import com.codeborne.selenide.Configuration;

public class BaseTest {

    public BaseTest() {
        Configuration.baseUrl = "http://surl.li";
    }
}
