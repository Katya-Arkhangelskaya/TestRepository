package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage {

  protected By tax = By.cssSelector("div.summary_tax_label");
  protected By cancelButton = By.cssSelector("a.cart_cancel_link");

  protected By finishButton = By.xpath("//a[text()='FINISH']");

  public SelenideElement getCancelButton() {
    return $(cancelButton);
  }

  public SelenideElement getFinishButton() {
    return $(finishButton);
  }

  public String getTax() {
    return $(tax).val();
  }
}
