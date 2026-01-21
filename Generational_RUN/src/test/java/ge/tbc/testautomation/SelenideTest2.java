package ge.tbc.testautomation;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest2 {

    @BeforeTest
    public void setUp()
    {

        Configuration.browser = "edge";
     //   Configuration.timeout = 8000;
     //   Configuration.holdBrowserOpen = true;
     //   Configuration.downloadsFolder = System.getProperty("user.dir") + "/otherDownloadFolder";

    }

    @Test
    public void testFileUpload()
    {
        open(constants.URL);
        SelenideElement fileUploadButton = $(byId("file-upload"));
        File cookieImage = new File(System.getProperty("user.dir") + "/src/main/resources/Cookie.png");

        ClassLoader classLoader = getClass().getClassLoader();
     //   File file = new File(Objects.requireNonNull(classLoader.getResource("Cookie.png").getFile()));
        fileUploadButton.uploadFile(cookieImage);

        SelenideElement uploadButton = $(byId("file-submit"));
        uploadButton.click();

    }

    @Test
    public void fileDownload()
    {
        open(constants.URL1);
        SelenideElement fileDownloadButton = $x("//a[@href = 'download/spectrum-logo.png']");
        File downloadFile = fileDownloadButton.download();

    }

}
