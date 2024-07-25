package stepDefinitions;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.LoginPage;

public class stepDefinition {
    WebDriver driver;
    LoginPage login;
    DashboardPage dashboardObj;


    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        login = new LoginPage(driver);
        dashboardObj = new DashboardPage(driver);
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        login.setUsername("Admin");
        login.setPassword("admin123");
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() {
        login.clickLogin();
    }

    @Then("Admin page is displayed")
    public void admin_page_is_displayed() {
        String currentUrl = driver.getCurrentUrl();
        String expectedSubstring = "/dashboard";
        assertTrue(currentUrl.contains(expectedSubstring));
    }
    @When("User clicks on Admin tab")
    public void user_clicks_on_admin_tab() {
        dashboardObj.clickAdminTab();
        
    }
}