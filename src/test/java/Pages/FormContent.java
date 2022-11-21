package Pages;

import Utilities.GWD;
import io.cucumber.java.zh_tw.假定;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FormContent extends Parent{


    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "svg[class='icon-svg addcart-icon']")
    private WebElement yesilTik;

    @FindBy(xpath = "//*[text()='Erkek Giyim']")
    public WebElement mFashion;

    @FindBy(css = "[class*='cl-item']")//13
    private List<WebElement>elementss;

    @FindBy(css = "div[class='header-categories']")
    public WebElement habIkon;

    @FindBy(xpath = "//*[text()='Parkalar']")
    public WebElement parka;


    @FindBy(css = "a[class*='_31q']")
    public List<WebElement> listem;

    @FindBy(css = "[placeholder='min']")
    private WebElement min;//value


    @FindBy(css = "[placeholder='max']")
    private WebElement max;//value

    @FindBy(css = "[class*='narrow-go']")
    private WebElement Ok;//click

    @FindBy(xpath = "//*[text()='Takı']")
    public  WebElement javerly;//action

   @FindBy(xpath = "//*[contains(text(),'Üzgünüz')]")
    private WebElement textVerify;

   @FindBy(xpath = "(//*[text()='Spor Saat'])[2]")
    public WebElement womanSpwatch;

   @FindBy(xpath = "div[class='_1CCSZ']")//sportWatchList
   public List<WebElement> spList;

   @FindBy(xpath = "//*[contains(text(),'saat')]")//gettext
   public List<WebElement> lst;

    WebElement myElement;
    public void findAndSend(String strElement,String value)
    {
        switch (strElement)
        {
            case "min":myElement=min;break;
            case "max":myElement=max;break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
           // case "fashions":myElement=mFashion;break;
            case "Ok":myElement=Ok;break;
           // case "parkalar":myElement=parka;break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement,String text)
    {
        switch (strElement)
        {
            case "Sorry":myElement=textVerify;break;
        }
        verifyContainsText(myElement,text);
    }




    public void SearchAndDelete(String searchText)
    {
//        findAndSend("searchInput",searchText);
//        findAndClick("searchButton");
//        waitUntilLoading();
//        findAndClick("deleteButton");
//        findAndClick("deleteDialogBtn");

    }

}
