package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;

public class NavigateToSteps {
    DialogContent dc= new DialogContent();
    @Given("Navigate to AliExpress")
    public void navigateToAliExpress() {
        GWD.getDriver().get("https://tr.aliexpress.com/");
        GWD.getDriver().manage().window().maximize();
        dc.findAndClick("cookClose1");
        dc.findAndClick("cookClose2");
        dc.findAndContainsText("verifyHomePage","AliExpress");
    }

}
