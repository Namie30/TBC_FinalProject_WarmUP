package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.commonPage;

public class commonSteps {

    commonPage commonPage = new commonPage();

    public commonSteps addToCartIconClick()
    {

        commonPage.cartButton.click();
        return this;

    }



}
