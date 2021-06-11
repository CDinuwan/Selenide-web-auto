package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private WebDriver driver;

    private By formAuthenticationLink=By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFormAuthentication(){
        $(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
