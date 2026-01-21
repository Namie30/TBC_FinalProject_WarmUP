package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class dashboardPage {

    public SelenideElement addToCartButton = $x("//button[@class = 'btn btn_primary btn_small btn_inventory '][@data-test = 'add-to-cart-sauce-labs-backpack']");
    public SelenideElement removeCartButton = $x("//button[@class = 'btn btn_secondary btn_small btn_inventory '][@data-test = 'remove-sauce-labs-backpack']");


}
