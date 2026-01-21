package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.constants;
import ge.tbc.testautomation.pages.checkOutPage;

public class checkOutSteps {

    checkOutPage checkoutPage =  new checkOutPage();


    public checkOutSteps checkingCheckoutPage()
    {

        checkoutPage.checkoutLink.shouldHave(Condition.text(constants.CHECKOUT_LABEL));

        return this;

    }

    public checkOutSteps fillInInformation(String firstname, String lastName, String zipCode)
    {

        checkoutPage.nameField.sendKeys(firstname);
        checkoutPage.lastNameField.sendKeys(lastName);
        checkoutPage.zipField.sendKeys(zipCode);

        return this;

    }

    public checkOutSteps continueButton()
    {

        checkoutPage.continueButton.click();
        return this;

    }

}
