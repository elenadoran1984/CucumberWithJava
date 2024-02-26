package ivet.steps;

import ivet.base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class Steps extends BaseUtil {

    private BaseUtil baseUtil;

    public Steps(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
    }

    private WebDriver driver;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("I am in the login page of the Ivet Application1")
    public void i_am_in_the_login_page_of_the_ivet_application1() {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ivet.ro/ro/login.html");
    }

    @When("I enter valid credentials1")
    public void i_enter_valid_credentials1() {
        driver.findElement(By.id("Email")).sendKeys("email");
        driver.findElement(By.id("Password")).sendKeys("password");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("I should be taken to the Overview Page1")
    public void i_should_be_taken_to_the_overview_page1() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fsm\"]/div")).isDisplayed();
        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(4) > a")).click();
    }

    @Given("I am in the login page2")
    @Given("I am in the login page of the Ivet Application2")
    public void i_am_in_the_login_page_of_the_ivet_application2() {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ivet.ro/ro/login.html");
    }

    @When("I enter valid credentials2")
    public void i_enter_valid_credentials2() {
        driver.findElement(By.id("Email")).sendKeys("email");
        driver.findElement(By.id("Password")).sendKeys("password");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("I should be taken to the Overview Page2")
    public void i_should_be_taken_to_the_overview_page2() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fsm\"]/div")).isDisplayed();
        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(4) > a")).click();
    }

    @Given("I am in the login page of the Ivet Application3")
    public void i_am_in_the_login_page_of_the_ivet_application3() {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ivet.ro/ro/login.html");
    }

    @When("I enter valid3 {string} and {string}" )
    public void i_enter_valid3_credentials(String username, String password) throws InterruptedException{
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("I should be taken to the Overview Page3")
    public void i_should_be_taken_to_the_overview_page3() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fsm\"]/div")).isDisplayed();
        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(4) > a")).click();
    }

    @Given("I am in the login page of the Ivet Application4")
    public void i_am_in_the_login_page_of_the_ivet_application4() {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ivet.ro/ro/login.html");
    }

    @When("I enter valid credentials4")
    public void i_enter_valid_credentials4(DataTable table) throws InterruptedException{
        Thread.sleep(2000);

        List<List<String>> loginForm = table.asLists(String.class);

        String username = loginForm.get(0).get(0);
        String password = loginForm.get(0).get(1);

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
	}

    @Then("I should be taken to the Overview Page4")
    public void i_should_be_taken_to_the_overview_page4() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fsm\"]/div")).isDisplayed();
        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(4) > a")).click();

    }

    @Given("I am in the login page of the Ivet Application5")
    public void i_am_in_the_login_page_of_the_ivet_application5() {
        driver.get("https://www.ivet.ro/ro/login.html");
    }

    @When("I enter valid5 {string} and {string}" )
    public void i_enter_valid5_credentials(String username, String password) throws InterruptedException{
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("I should be taken to the Overview Page5")
    public void i_should_be_taken_to_the_overview_page5() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fsm\"]/div")).isDisplayed();
        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(4) > a")).click();
    }

    @Given("I am in the login page of the Ivet Application6")
    public void i_am_in_the_login_page_of_the_ivet_application6() {
        driver.get("https://www.ivet.ro/ro/login.html");
    }

    @When("I enter valid6 {string} and {string} with {string}" )
    public void i_enter_valid6_credentials(String username, String password, String userFullName1) throws InterruptedException{
        Thread.sleep(2000);

        baseUtil.userFullName = userFullName1;

        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("I should be taken to the Overview Page6")
    public void i_should_be_taken_to_the_overview_page6() throws InterruptedException {
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"fsm\"]/div")).isDisplayed();
        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(1) > a")).click();

        String actualUserFullName = driver.findElement(By.cssSelector("#profile_form > div.item.profile-address-block.profile-address-block-billing > a > div:nth-child(1) > span.address-first-name")).getText();
        System.out.println(baseUtil.userFullName);
        assertTrue(actualUserFullName, actualUserFullName.contains(baseUtil.userFullName));

        driver.findElement(By.cssSelector("#header-login-wrapper>label")).click();
        driver.findElement(By.cssSelector("#header-login-wrapper > label > ul > li:nth-child(4) > a")).click();
    }

    @After()
    public void quitBrowser() {
        driver.quit();
    }
}