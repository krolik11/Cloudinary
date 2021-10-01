import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopToolbar {
    private WebDriver driver;


    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement dashboard;

    @FindBy(xpath = "//span[contains(text(),'Media Library')]")
    WebElement mediaLibrary;


    @FindBy(xpath = "//span[contains(text(),'Transformations')]")
    WebElement transformations;

    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    WebElement reports;


    public TopToolbar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}