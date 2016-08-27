package cucumbertest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {


    WebDriver driver= null;

    @Given("^: I'm on wikipedia site$")
    public void _I_m_on_wikipedia_site() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        this.driver= new ChromeDriver();
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");

    }

    @When("^:  I look  for \"([^\"]*)\"$")
    public void _I_look_for(String arg1) throws Throwable {

        WebElement element = this.driver.findElement(By.id("searchInput"));
        element.sendKeys(arg1+"\n");
        //element.submit();
        //this.driver.findElement(By.id("searchButton")).click();

    }

    @Then("^: I check the heading which is \"([^\"]*)\"$")
    public void _I_check_the_heading_which_is(String arg1) throws Throwable {

        WebElement object=this.driver.findElement(By.id("firstHeading"));
        System.out.println("---"+object.getText());
        Assert.assertEquals(object.getText(),arg1);
    }

    @Then("^: I close the browser$")
    public void _I_close_the_browser() throws Throwable {

        driver.close();

    }



}
