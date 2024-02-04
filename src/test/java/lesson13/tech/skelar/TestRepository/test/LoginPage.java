package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
  protected By usernameField = By.id("user-name");

  protected By passwordField = By.id("password");

  protected By submitButton = By.id("login-button");

  public SelenideElement getUsernameField() {
    return $(usernameField);
  }

  public SelenideElement getPasswordField() {
    return $(passwordField);
  }

  public SelenideElement getSubmitButton() {
    return $(submitButton);
  }
}
