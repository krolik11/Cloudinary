import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MediaLibraryPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'Manage')]")
    WebElement manage;

    public MediaLibraryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getAssetElementByText(String text) {
        return driver.findElement(By.xpath("//div[contains(text(),'"+text+"')]"));
    }

    public List<WebElement> getInputElementByValue(String value) {
        return driver.findElements(By.xpath("//input[@value='"+value+"']"));
    }

}