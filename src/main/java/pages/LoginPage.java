package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private WebDriver driver;
    private By usernameField=By.id("username");
    private By passwordField=By.id("password");
    private By loginButton=By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String username){
        $("usernameField").setValue("tomsmith");
    }

    public void setPassword(String password){
        $("passwordField").setValue("SuperSecretPassword!");
    }

    public SecureAreaPage clickLoginButton(){
        $("loginButton").click();
        return new SecureAreaPage(driver);
    }
}
