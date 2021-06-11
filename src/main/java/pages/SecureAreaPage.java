package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert= By.className("icon-lock");

    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }

    public String getAlertText(){
        String alertText=$("statusAlert").getText();
        return alertText;
    }
}
