package cucumbertest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ScenarioOutline {

    WebDriver driver= null;

    @Given("^: I'm on http://parsleyjs.org/doc/examples/simple.html  to test the form$")
    public void _I_m_on_http_parsleyjs_org_doc_examples_simple_html() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        this.driver= new ChromeDriver();
        driver.navigate().to("http://parsleyjs.org/doc/examples/simple.html");

    }

    @When("^: I  fill out all the fields  correctly with  this information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void _I_fill_out_all_the_fields_correctly_with_this_information_(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {

        this.driver.findElement(By.name("fullname")).sendKeys(arg1);

        this.driver.findElement(By.name("email")).sendKeys(arg2);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        if(arg3.equals("M")){
            //WebElement elementP= this.driver.findElement(By.xpath("//*[@id=\"demo-form\"]/p[1]"));
            jse.executeScript("document.getElementById(\"genderM\").click()");
        }else{
            jse.executeScript("document.getElementById(\"genderF\").click()");
        }
        this.checkHobbies(arg4);

        new Select(driver.findElement(By.id("heard"))).selectByVisibleText(arg5);

        this.driver.findElement(By.name("message")).sendKeys(arg6);

    }

    @When("^:  I press the button  Validate to get the message$")
    public void _I_press_the_button_Validate() throws Throwable {

        this.driver.findElement(By.className("btn-default")).click();

    }

    @Then("^:  I see an ok message  that say \"([^\"]*)\" in each case$")
    public void _I_see_an_ok_message_that_say(String arg1) throws Throwable {

        WebElement element=this.driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p"));
        Assert.assertEquals(element.getText(),arg1);

    }

    @Then("^:   I close the page finally$")
    public void _I_close_the_page() throws Throwable {

        this.driver.close();

    }

    private void checkHobbies(String hobbiesString) throws InterruptedException {

        String[] hobbies = hobbiesString.split(",");
        String hobby;
        for(int cont=0;cont<hobbies.length;cont++){

            hobby=hobbies[cont];
            System.out.println("----"+hobby+"---");
            switch(hobby){

                case "Skiing":
                    this.driver.findElement(By.id("hobby1")).click();
                    break;
                case "Running":
                    this.driver.findElement(By.id("hobby2")).click();
                    break;
                case "Eating":
                    this.driver.findElement(By.id("hobby3")).click();
                    break;
                case "Sleeping":
                    this.driver.findElement(By.id("hobby4")).click();
                    break;
                case "Reading":
                    this.driver.findElement(By.id("hobby5")).click();
                    break;
                case "Coding":
                    this.driver.findElement(By.id("hobby6")).click();
                    break;
            }
            Thread.sleep(500);
        }

    }


}
