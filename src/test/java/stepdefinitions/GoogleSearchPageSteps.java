package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageSteps {

    WebDriver driver;

    @Given("I launch Chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open Google Search Page")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://www.google.com");
    }

    @Then("I verify that the logo is presence on Search Page")
    public void i_verify_that_the_logo_is_presence_on_homepage() {
        boolean GoogleLogo = driver.findElement(By.id("hplogo")).isDisplayed();
        Assert.assertEquals(true, GoogleLogo);
    }

    @Then("Close Chrome browser")
    public void close_chrome_browser() {
        driver.quit();
    }
}
