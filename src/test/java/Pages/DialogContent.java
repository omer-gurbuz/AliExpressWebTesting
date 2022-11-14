package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='İzin verme']")
    private WebElement cookClose1;
    @FindBy(xpath = "//div/div[1]/img[2]")
    private WebElement cookClose2;
    @FindBy(xpath = "//div[@class='site-logo']/a/span[text()='AliExpress']")
    private WebElement verifyHomePage;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "searchInput":
        //        myElement = searchInput;
                break;




        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {


        switch (strElement) {

            case "cookClose1":
                myElement = cookClose1;
                break;
                case "cookClose2":
                myElement = cookClose2;
                break;



        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "verifyHomePage":
                myElement = verifyHomePage;
                break;


        }

        verifyContainsText(myElement, text);
    }

}
