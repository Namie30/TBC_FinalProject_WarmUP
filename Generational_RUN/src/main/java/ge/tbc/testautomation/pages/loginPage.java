package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

//lombok (We can later check this library for private classes)
public class loginPage {

    public SelenideElement login = $(byId("user-name"));
    public SelenideElement password = $(byId("password"));
    public SelenideElement loginButton = $(byId("login-button"));

}
