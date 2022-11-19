package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EvEvcilHayvanVeGereclerTestSteps {
    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @When("Select Numaraya göre boyama under El Sanatları from Ev, Evcil Hayvan ve Gereçler from Category")
    public void selectNumarayaGöreBoyamaUnderElSanatlarıFromEvEvcilHayvanVeGereçlerFromCategory() {
        Actions aksiyonlar=new Actions(GWD.getDriver());

        Action aksiyon=aksiyonlar.moveToElement(dc.getMyElement("EEHveG")).build();
        aksiyon.perform();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("dl[class='cl-item cl-item-garden']")));

        aksiyon=aksiyonlar.moveToElement(dc.getMyElement("numarayaGoreBoyama")).build();
        aksiyon.perform();

        aksiyon=aksiyonlar.click().build();
        aksiyon.perform();
    }

    @Then("Verify that you have selected Numaraya göre boyama")
    public void verifyThatYouHaveSelectedNumarayaGöreBoyama() {
        String url=GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("paint-by-number"));
    }

    @And("Choose a shopping filter")
    public void chooseAShoppingFilter() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("cerceveEvet"));
        dc.getMyElement("cerceveEvet").click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='next-overlay-wrapper']")));

        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("tekParca"));
        dc.getMyElement("tekParca").click();
    }

    @And("Select the first product")
    public void selectTheFirstProduct() {
        dc.findAndClick("ilkUrun");
    }

    @And("Take action on the product and add it to the cart")
    public void takeActionOnTheProductAndAddItToTheCart() {
        String url=GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("item"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("ul[class='sku-property-list'] li")));
        List<WebElement> urunRenkSecenekleri=GWD.getDriver().findElements(By.cssSelector("ul[class='sku-property-list'] li"));
        int random1=(int)(Math.random() * urunRenkSecenekleri.size());
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul[class='sku-property-list'] li")));
        urunRenkSecenekleri.get(random1).click();
        dc.findAndClick("sepeteEkle");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[ae_button_type='View_shopping_cart']")));
        dc.findAndClick("viewShoppingCartButton");
    }

    @Then("Uninstall and verify the product")
    public void uninstallAndVerifyTheProduct() {
        dc.findAndClick("checkboxButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("kaldirButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sepete henüz ürün eklenmedi']")));
        dc.findAndContainsText("cartVerify","Sepete henüz ürün eklenmedi");
    }
}
