package ge.tbc.testautomation.steps;

import com.codeborne.selenide.CollectionCondition;
import ge.tbc.testautomation.pages.cartPage;
import ge.tbc.testautomation.pages.commonPage;

public class cartSteps extends commonPage {
    
    cartPage cartPage = new cartPage();
    
    public cartSteps cartListCheck(int expectedSize)
    {
        
        cartPage.cartItems.shouldHave(CollectionCondition.size(expectedSize));
        return this;
        
    }
    
    public cartSteps clickingCheckoutPageButton()
    {
        
        cartPage.checkoutButton.click();
        return this;
        
    }
    
}
