package ge.tbc.testautomation;

import com.codeborne.selenide.*;
import com.codeborne.selenide.commands.ShouldBe;
import ge.tbc.testautomation.pages.checkOutPage;
import ge.tbc.testautomation.pages.dashboardPage;
import ge.tbc.testautomation.steps.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

@Test(groups = {"Something IDK"})
public class SuccessfulPurchaseScenarioTest {
  commonSteps commonSteps;
  loginSteps loginSteps;
  dashboardSteps dashboardSteps;
  cartSteps cartSteps;
  checkOutSteps checkOutSteps;
  OverviewSteps overviewSteps;

    @BeforeClass
    @Parameters("browserType")
    public void setUp(String browserType)
    {
        commonSteps = new commonSteps();
        loginSteps = new loginSteps();
        dashboardSteps = new dashboardSteps();
        cartSteps = new cartSteps();
        checkOutSteps = new checkOutSteps();
        overviewSteps = new OverviewSteps();

        if(browserType.equalsIgnoreCase("edge"))
    {
        Configuration.browser = "edge";
    }
        else if(browserType.equalsIgnoreCase("chrome"))
    {
        Configuration.browser = "chrome";
    }

        open(constants.Base_URL);
      //  Configuration.holdBrowserOpen = true;

//        Configuration.screenshots = true;
//        Configuration.savePageSource = true;
//        Configuration.reportsFolder = "build/reports/tests";

    }

    @Test(description = "login-Testing", priority = 1)
    public void loginAsStandartUser()
    {

        loginSteps
                .fillUserNameInput()
                .fillPasswordInput()
                .clickLoginButton();

    }

    @Test(description = "Add to cart button click", priority = 2)
    public void addToCart()
    {

       dashboardSteps
               .addToCartButtonClick()
               .addToCheckoutButtonClick();

    }

    @Test(description = "Check out the cart", priority = 3)
    public void checkOutCart()
    {

       commonSteps
               .addToCartIconClick();

        cartSteps
                .cartListCheck(1);

    }

    @Test(description = "Go to checkout page", priority = 4)
    public void checkoutPage()
    {

        cartSteps
                .clickingCheckoutPageButton();

        checkOutSteps
                .checkingCheckoutPage();

    }

    @Test(description = "Filling out the information", priority = 4)
    public void checkoutPageInfo()
    {

        checkOutSteps
                .fillInInformation("John", "Cena", "100100");


    }

    @Test(description = "Checkout Overview", priority = 5)
    public void checkoutOverviewInfo()
    {

        checkOutSteps.continueButton();

        overviewSteps
                .overviewCheckout();

    }

    @Test(description = "Finish the order", priority = 6)
    public void finishOrder()
    {

        overviewSteps
                .finishButtonClick()
                .successMessageCheck();

    }


}
