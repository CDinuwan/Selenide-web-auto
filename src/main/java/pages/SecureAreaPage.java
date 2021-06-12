package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SecureAreaPage {

    private By statusAlert= By.id("flash");


    public String getAlertText(){
        String alertText=$(statusAlert).getText();
        System.out.println(alertText);
        return alertText;
    }
}
