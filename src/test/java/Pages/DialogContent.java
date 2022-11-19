package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='İzin verme']")
    private WebElement cookClose1;
    @FindBy(xpath = "//div/div[1]/img[2]")
    private WebElement cookClose2;
    @FindBy(id = "header-categories")
    private WebElement menuButton;
    @FindBy(xpath = "//div[@class='site-logo']/a/span[text()='AliExpress']")
    private WebElement verifyHomePage;
    @FindBy(xpath = "//a[text()='Otomobil ve Motosiklet']")
    private WebElement carAndMotoTite;
    @FindBy(xpath = "//a[text()='Kask ve Koruyucu Donanım']")
    private WebElement KaskVeKorumaTite;
    @FindBy(xpath = "//span[text()='Koruyucu Donanım']")
    private WebElement koruyucuDonanimVerify;
    @FindBy(css = "span[class='next-select-arrow']>i[class$='next-medium']")
    private WebElement gelenGemiSelect;
    @FindBy(css = "li[title='Turkey']")
    private WebElement turkeySelect;
    @FindBy(xpath = "//h1[text()='Sx.100r Fullblack Mat Siyah Kask']")
    private WebElement siyahKaskProduct;
    private By kask=(By.xpath("//h1[text()='Sx.100r Fullblack Mat Siyah Kask']"));
    @FindBy(xpath = "//div[@class='sku-property-text']/span[text()='XL']")
    private WebElement sizeXL;
    @FindBy(css = "span+span>button[ae_button_type='addtocart_click']")
    private WebElement addToCartButton;
    @FindBy(css = "button[ae_button_type='View_shopping_cart']")
    private WebElement viewShoppingCartButton;
    @FindBy(css = "span[class='comet-checkbox-circle']")
    private WebElement checkboxButton;
    @FindBy(css = "span[class$='comet-icon-delete ']")
    private WebElement deleteButton;
    @FindBy(css = "button[class$='comet-btn-primary']")
    private WebElement kaldirButton;

    @FindBy(xpath = "b//div[text()='Sepete henüz ürün eklenmedi']")
    private WebElement cartVerify;

    @FindBy(xpath = "//a[text()='Ev']")
    private WebElement EEHveG;

    @FindBy(xpath = "//a[text()='Numaraya Göre Boyama']")
    private WebElement numarayaGoreBoyama;

    @FindBy(css = "span[class='next-breadcrumb-text activated'] span")
    private WebElement verifyNumaraliResim;

    @FindBy(xpath = "(//span[@class='next-checkbox']/input)[1]")
    private WebElement cerceveEvet;

    @FindBy(xpath = "(//span[@class='next-checkbox']/input)[3]")
    private WebElement tekParca;

    @FindBy(xpath = "(//div[@class='JIIxO']/a)[1]")
    private WebElement ilkUrun;

    @FindBy(xpath = "//button[text()='Sepete Ekle']")
    private WebElement sepeteEkle;

    WebElement myElement;
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(10));

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

            case "cookClose1": myElement = cookClose1;break;
            case "cookClose2": myElement = cookClose2;break;
            case "gelenGemiSelect":wait.until(ExpectedConditions.elementToBeClickable(gelenGemiSelect));
            myElement=gelenGemiSelect;break;
            case "turkeySelect": wait.until(ExpectedConditions.elementToBeClickable(turkeySelect));
            myElement=turkeySelect;break;
            case "siyahKaskProduct":wait.until(ExpectedConditions.visibilityOfElementLocated(kask));
            myElement = siyahKaskProduct;break;
            case "sizeXL": myElement=sizeXL;break;
            case "addToCartButton": myElement=addToCartButton;break;
            case "viewShoppingCartButton":wait.until(ExpectedConditions.elementToBeClickable(viewShoppingCartButton));
            myElement=viewShoppingCartButton;break;
            case "checkboxButton":wait.until(ExpectedConditions.elementToBeClickable(checkboxButton));
            myElement=checkboxButton;break;
            case "deleteButton": GWD.Bekle(1);myElement=deleteButton;break;
            case "kaldirButton": GWD.Bekle(1);myElement=kaldirButton;break;
            case "ilkUrun": myElement = ilkUrun;break;
            case "sepeteEkle": myElement = sepeteEkle;break;





        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "verifyHomePage": myElement = verifyHomePage;break;
            case "koruyucuDonanimVerify": myElement = koruyucuDonanimVerify;break;
            case "cartVerify":GWD.Bekle(1); myElement = cartVerify;break;
            case "verifyNumaraliResim": myElement = verifyNumaraliResim;break;

        }

        verifyContainsText(myElement, text);
    }
    public void findAndActionMove(String strElement){
        switch (strElement){
            case "menuButton":if (!carAndMotoTite.isDisplayed()){myElement=menuButton;}break;
            case "carAndMotoTite":myElement=carAndMotoTite;break;
            case "KaskVeKorumaTite":GWD.Bekle(2);myElement=KaskVeKorumaTite;break;
        }
        actionBuildPerform(myElement);
    }
    public void findAndActionClick(String strElement){
        switch (strElement){
            case "KaskVeKorumaTite": GWD.Bekle(1);myElement = KaskVeKorumaTite;break;
        }
        actionFunction(myElement);
    }

    public WebElement getMyElement(String strElement) {
        switch (strElement){
            case "EEHveG":myElement=EEHveG;break;
            case "numarayaGoreBoyama":myElement=numarayaGoreBoyama;break;
            case "cerceveEvet":myElement=cerceveEvet;break;
            case "tekParca":myElement=tekParca;break;

        }
        return myElement;
    }
}
