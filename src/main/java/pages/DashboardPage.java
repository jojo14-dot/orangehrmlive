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
    By recordcount = By.className( "oxd-text oxd-text--span");
    By ADDbtn = By.className( "oxd-button oxd-button--medium oxd-button--secondary");
    
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAdminTab() {
        wait.until(ExpectedConditions.presenceOfElementLocated(adminTabBtn));
        driver.findElement(adminTabBtn).click();
    }
    public int getnumberrecord() {
       String recordcounts= driver.findElement(recordcount).getAttribute("value");
       String[] parts = recordcounts.split(" ");
       String OS = parts[0];
       int a=Integer.parseInt(OS);
       System.out.println(a);

    }
    public void clickAddbtn() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ADDbtn));
        driver.findElement(ADDbtn).click();
    }
    
}
