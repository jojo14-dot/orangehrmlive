package pages;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setUsername(String strUsername) {
        
        wait.until(ExpectedConditions.presenceOfElementLocated(username));
        driver.findElement(username).sendKeys(strUsername);
    }

    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}