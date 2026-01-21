package ge.tbc.testautomation.util;

import com.codeborne.selenide.CheckResult;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.WebElementCondition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomConfition {
   /* public static WebElementCondition textOfLength(int expectedLength)
    {

        return new WebElementCondition() {
            @Override
            public CheckResult check(Driver driver, WebElement webElement) {
                String text  = webElement.getText();
                return new CheckResult(text.length() == expectedLength, String.format("Expected %d characters but found %d", expectedLength, text.length()));

            }
        };

    }*/

}
