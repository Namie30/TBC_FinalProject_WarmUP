package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class overviewPage {

    public SelenideElement checkoutButton = $("span.title");
    public SelenideElement finishButton = $(byId("finish"));
    public SelenideElement successMessage = $x("//h2[@data-test =  'complete-header' and text() = 'Thank you for your order!']");

}
