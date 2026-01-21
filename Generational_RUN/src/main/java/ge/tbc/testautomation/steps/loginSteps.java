package ge.tbc.testautomation.steps;


import ge.tbc.testautomation.constants;
import ge.tbc.testautomation.pages.loginPage;

public class loginSteps {

    loginPage loginPage =  new loginPage();

   public loginSteps fillUserNameInput()
   {

       loginPage.login.sendKeys(constants.login_User);
       return this;

   }

   public loginSteps fillPasswordInput()
   {
       loginPage.password.sendKeys(constants.login_Pass);
       return this;

   }

   public loginSteps clickLoginButton()
   {

       loginPage.loginButton.click();
       return this;

   }


}
