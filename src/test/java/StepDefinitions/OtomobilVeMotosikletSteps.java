package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;
import java.util.Set;

public class OtomobilVeMotosikletSteps {
    DialogContent dc=new DialogContent();
    @And("Go to the element")
    public void goToTheElement(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndActionMove(listElement.get(i));

    }
    String homePage;
    @And("Clicking function control on the AliExpress")
    public void clickingFunctionControlOnTheAliExpress(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));
        homePage= GWD.getDriver().getWindowHandle();
    }
    @And("Switch between the pages")
    public void switchBetweenThePages() {
        Set<String> pages= GWD.getDriver().getWindowHandles();
        for (String w:pages) {
            if (!homePage.equals(w)) {
                GWD.getDriver().switchTo().window(w);
            }
        }
    }
    @And("Verification function checking in the AliExpress")
    public void verificationFunctionCheckingInTheAliExpress(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Clicking function control with actions")
    public void clickingFunctionControlWithActions(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndActionClick(listElement.get(i));
    }


}
