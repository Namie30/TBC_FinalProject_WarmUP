package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.commonPage;
import ge.tbc.testautomation.pages.dashboardPage;

public class dashboardSteps extends commonSteps {

    dashboardPage dashboardPage = new dashboardPage();

    public dashboardSteps addToCartButtonClick ()
    {

        dashboardPage.addToCartButton.click();
        return this;

    }

    public dashboardSteps addToCheckoutButtonClick ()
    {

        dashboardPage.removeCartButton.shouldBe(Condition.visible);
        return this;

    }

}
