package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {
  protected By menuButton = By.cssSelector(".bm-burger-button > button");

  protected By products = By.cssSelector(".inventory_item");

  protected By appLogo = By.cssSelector(".app_logo");

  protected By cartButton = By.cssSelector("#shopping_cart_container > a");

  public SelenideElement getMenuButton() {
    return $(menuButton);
  }

  public List<Product> getProducts() {
    List<Product> productList = new ArrayList<>();
    for (SelenideElement element : $$(products)) {
      productList.add(new Product(element));
    }
    return productList;
  }

  public SelenideElement getAppLogo() {
    return $(appLogo);
  }

  public SelenideElement getCartButton() {
    return $(cartButton);
  }
}
