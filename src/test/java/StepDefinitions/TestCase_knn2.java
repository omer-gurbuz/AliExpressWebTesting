package StepDefinitions;

import Pages.FormContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestCase_knn2 {
    Actions actions = new Actions(GWD.getDriver());
    FormContent form = new FormContent();



    @And("find jewelry and watch")
    public void findJewelryAndWatch() {
     actions.moveToElement(form.javerly).build().perform();
    }

    @And("click on women's sports watch")
    public void clickOnWomenSSportsWatch() {
    //GWD.Bekle(1);
   // actions.moveToElement(form.womanSpwatch).click().build().perform();
    form.womanSpwatch.click();
    }

    @Then("verify the list of products in the list")
    public void verifyTheListOfProductsInTheList() {
        List<WebElement>myList=form.waitVisibleListAllElement(form.spList);
        for(WebElement e:myList)
            System.out.println(e.getText());
    }
}
