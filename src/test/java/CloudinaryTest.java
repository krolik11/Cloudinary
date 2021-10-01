import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Slf4j
public class CloudinaryTest extends base {

    LoginPage loginPage;
    MediaLibraryPage mediaLibraryPage;
    TopToolbar topToolbar;
    Actions actions;

    @BeforeClass
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        initPages();
    }

    private void initPages() {
        loginPage = new LoginPage(driver);
        mediaLibraryPage = new MediaLibraryPage(driver);
        topToolbar = new TopToolbar(driver);
        actions = new Actions(driver);
    }

    @Description("Validate the Artifact headline")
    @Test(dataProvider = "DataContainer", description = "Validate the Artifact headline")
    public void Test1(String username, String password, String imageText) {
        driver.get(URL);
        loginPage.login(username, password);
        topToolbar.mediaLibrary.click();
        WebElement imageLocator = mediaLibraryPage.getAssetElementByText(imageText);
        actions.contextClick(imageLocator).perform();
        mediaLibraryPage.manage.click();
        boolean elementExists = mediaLibraryPage.getInputElementByValue(imageText).size() != 0;
        Assert.assertTrue(elementExists, "Element headline " + imageText + " exist");
    }

    @BeforeTest
    public void beforeTest() {
        log.info("Before test");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
        log.info("Finished test");
    }

    @DataProvider(name = "DataContainer")
    public Object[] myDataProvider() {
        Object data[][] = new Object[1][3];
        // First details
        data[0][0] = "qa_automation_team+testAccount@cloudinary.com";
        data[0][1] = "8Qfr%W6RqlPN";
        data[0][2] = "home assignment";
        return data;
    }
}