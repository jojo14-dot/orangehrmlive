package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;
    
    By adminTabBtn = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAdminTab() {
        wait.until(ExpectedConditions.presenceOfElementLocated(adminTabBtn));
        driver.findElement(adminTabBtn).click();
    }
    
}
