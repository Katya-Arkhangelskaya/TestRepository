package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FinishPage {
  protected By orderCompleteHeaderText = By.cssSelector("h2.complete-header");

  protected By orderCompleteText = By.cssSelector("div.complete-text");

  public SelenideElement getOrderCompleteHeaderText() {
    return $(orderCompleteHeaderText);
  }

  public SelenideElement getOrderCompleteText() {
    return $(orderCompleteText);
  }
}
