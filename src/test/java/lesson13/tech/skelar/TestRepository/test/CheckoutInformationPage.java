package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutInformationPage {
  protected By firstNameField = By.id("first-name");

  protected By lastNameField = By.id("last-name");

  protected By zipCodeField = By.id("postal-code");

  protected By cancelButton = By.cssSelector("a.cart_cancel_link");

  protected By finishButton = By.xpath("//input[@value='CONTINUE']");

  public SelenideElement getFirstNameField() {
    return $(firstNameField);
  }

  public SelenideElement getLastNameField() {
    return $(lastNameField);
  }

  public SelenideElement getZipCodeField() {
    return $(zipCodeField);
  }

  public SelenideElement getCancelButton() {
    return $(cancelButton);
  }

  public SelenideElement getContinueButton() {
    return $(finishButton);
  }
}
