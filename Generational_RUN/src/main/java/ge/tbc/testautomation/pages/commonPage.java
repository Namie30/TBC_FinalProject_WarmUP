package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class commonPage {

    public SelenideElement cartButton = $("a.shopping_cart_link");
    public ElementsCollection cartItems = $$("span.shopping_cart_badge");

}
