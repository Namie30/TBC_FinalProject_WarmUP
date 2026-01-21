package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class checkOutPage {

    public SelenideElement checkoutLink = $("span.title");
    public SelenideElement nameField = $(byId("first-name"));
    public SelenideElement lastNameField = $(byId("last-name"));
    public SelenideElement zipField = $(byId("postal-code"));
    public SelenideElement continueButton = $(byId("continue"));

}
