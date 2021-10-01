import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "user_session_email")
    WebElement emailField;

    @FindBy(id = "user_session_password")
    WebElement passwordField;

    @FindBy(id = "sign-in")
    WebElement signIn;

    @FindBy(id = "sso-sign-in")
    WebElement ssoSignIn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Perform login")
    public void login(String username, String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        signIn.click();
    }

}