package cucumbertest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFeature1 {

    @Given("^: I navigated to google$")
    public void _I_navigated_to_google() throws Throwable {
        System.out.println("aa1");
    }

    @When("^: I typed  hello$")
    public void _I_typed_hello() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("aa2");
    }

    @When("^: Pressed Google Search$")
    public void _Pressed_Google_Search() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("aa3");
    }

    @Then("^: I see a list of web pages$")
    public void _I_see_a_list_of_web_pages() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("aa4");
    }

}
