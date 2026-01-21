package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.constants;
import ge.tbc.testautomation.pages.overviewPage;

public class OverviewSteps {

    overviewPage overviewPage = new overviewPage();

    public OverviewSteps overviewCheckout()
    {

     overviewPage.checkoutButton.shouldHave(Condition.text(constants.CHECKOUT_OVERVIEW_LABEL));
     return this;

    }

    public OverviewSteps finishButtonClick()
    {

        overviewPage.finishButton.click();
        return this;
    }

    public OverviewSteps successMessageCheck()
    {
        overviewPage.successMessage.shouldHave(Condition.text(constants.ORDER_SUCCESS_MESSAGE));
        return this;
    }

}
