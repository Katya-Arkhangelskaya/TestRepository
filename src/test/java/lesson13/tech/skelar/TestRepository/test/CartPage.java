package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {
  protected By continueShoppingButton = By.cssSelector("a.btn_secondary");

  protected By checkoutButton = By.cssSelector("a.checkout_button");

  protected By products = By.cssSelector("div.cart_item");

  public SelenideElement getContinueShoppingButton() {
    return $(continueShoppingButton);
  }

  public SelenideElement getCheckoutButton() {
    return $(checkoutButton);
  }

  public List<Product> getProducts() {
    List<Product> productList = new ArrayList<>();
    for (SelenideElement element : $$(products)) {
      productList.add(new Product(element));
    }
    return productList;
  }
}
