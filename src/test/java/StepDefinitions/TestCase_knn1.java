package StepDefinitions;

import Pages.FormContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestCase_knn1 {

    Actions actions = new Actions(GWD.getDriver());
    FormContent form = new FormContent();


    @Given("go to men's fashion from the hamburger icon on the left")
    public void goToMenSFashionFromTheHamburgerIconOnTheLeft() {
        actions.moveToElement(form.habIkon).build().perform();

    }

    @And("go Men's Fashion act")
    public void goMenSFashionAct() {
        GWD.Bekle(1);
        actions.moveToElement(form.mFashion).build().perform();
    }

    @And("click parkas")
    public void clickParkas() {
        GWD.Bekle(1);
        actions.moveToElement(form.parka).click().build().perform();
    }

    @When("find the most expensive products")
    public void findTheMostExpensiveProducts(DataTable elements) {
        List<List<String>> listelements = elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {
            form.findAndSend(listelements.get(i).get(0), listelements.get(i).get(1));
        }
    }

    @And("search")
    public void search(DataTable element) {
        List<String> listelement = element.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            form.findAndClick(listelement.get(i));
        }
    }

    @Then("verify no product")
    public void verifyNoProduct() {
        form.findAndContainsText("Sorry","Üzgünüz");
    }
}
