package lesson13.tech.skelar.TestRepository.main;
import lesson13.tech.skelar.TestRepository.test.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class Main {

    private final String username = "standard_user";
    private final String password = "secret_sauce";

    @Test
    public void saucedemoE2Etest() {
        open("https://www.saucedemo.com/v1/");
        LoginPage loginPage = new LoginPage();
        loginPage.getUsernameField().val(username);
        loginPage.getPasswordField().val(password);
        loginPage.getSubmitButton().click();
        ProductsPage productsPage = new ProductsPage();
        List<Product> products = productsPage.getProducts();
        Product product1 = products.stream().filter(p -> p.getPrice().equals("$7.99")).findAny().get();
        product1.getAddToCartButton().click();
        Product product2 = products.stream().filter(p -> p.getPrice().equals("$9.99")).findAny().get();
        product2.getAddToCartButton().click();
        productsPage.getCartButton().click();
        CartPage cartPage = new CartPage();
        Product productInCart1 = cartPage.getProducts().get(0);
        Product productInCart2 = cartPage.getProducts().get(1);
        Assert.assertEquals(productInCart1.getProductName(), product1.getProductName());
        Assert.assertEquals(productInCart1.getProductDescription(), product1.getProductDescription());
        Assert.assertEquals(productInCart1.getPrice(), product1.getPrice().replace("$", ""));
        Assert.assertEquals(productInCart2.getProductName(), product2.getProductName());
        Assert.assertEquals(productInCart2.getProductDescription(), product2.getProductDescription());
        Assert.assertEquals(productInCart2.getPrice(), product2.getPrice().replace("$", ""));
        cartPage.getCheckoutButton().click();
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
        checkoutInformationPage.getFirstNameField().val("Kateryna");
        checkoutInformationPage.getLastNameField().val("Arkhangelska");
        checkoutInformationPage.getZipCodeField().val("02097");
        checkoutInformationPage.getContinueButton().click();
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
        System.out.println(checkoutOverviewPage.getTax());
        checkoutOverviewPage.getFinishButton().click();
        FinishPage finishPage = new FinishPage();
        Assert.assertEquals(finishPage.getOrderCompleteHeaderText().getText(), "THANK YOU FOR YOUR ORDER");
    }
}