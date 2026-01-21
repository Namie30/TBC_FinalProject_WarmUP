package ge.tbc.testautomation;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class BaseTest {

    private static boolean dbConnected = false;

    @BeforeSuite
    public void beforeSuite() {
        dbConnected = true;
        System.out.println("[BeforeSuite] Dummy DB connected = " + dbConnected);
    }

    @AfterSuite
    public void afterSuite() {
        dbConnected = false;
        System.out.println("[AfterSuite] Dummy DB connected = " + dbConnected);
    }

    @BeforeTest
    @Parameters({"browser"})
    public void beforeTest(@Optional("edge") String browser) {
        Configuration.browser = browser;
        Configuration.baseUrl = "https://www.saucedemo.com";
        //  Configuration.headless = false;

        System.out.println("[BeforeTest] Launch browser (simulated): " + browser);
    }

    @AfterTest
    public void afterTest() {
        //Selenide.closeWebDriver();
        // System.out.println("[AfterTest] Close browser (simulated)");

        System.out.println("Test tag execution finished on " + LocalDateTime.now());

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("[BeforeClass] Login (simulated)");
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println(
                "[BeforeMethod] Starting test: " + method.getName()
        );
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println(
                "[AfterMethod] Finished test: " + method.getName()
        );
    }

    @AfterClass
    public void afterClass() {
        System.out.println("[AfterClass] Logout (simulated)");
    }


}
