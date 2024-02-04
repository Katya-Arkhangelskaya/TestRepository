package lesson13.tech.skelar.TestRepository.test;

import com.codeborne.selenide.SelenideElement;

public class Product {

    private String productName;
    private String productDescription;
    private String price;
    private SelenideElement addToCartButton;

    public Product(SelenideElement element) {
        this.productName = element.$x(".//div[@class='inventory_item_name']").text();
        this.productDescription = element.$x(".//div[@class='inventory_item_desc']").text();
        this.price = element.$x(".//div[@class='inventory_item_price']").text();
        this.addToCartButton = element.$x(".//button[contains(@class, 'btn_inventory')]");
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getPrice() {
        return price;
    }

    public SelenideElement getAddToCartButton() {
        return addToCartButton;
    }
}
