package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private By loginButton=By.cssSelector("#login button");
    private By usernameField=By.id("username");
    private By passwordField=By.id("password");

    public void setUsername(String username){
        $(usernameField).setValue("tomsmith");
    }

    public void setPassword(String password){
        $(passwordField).setValue("SuperSecretPassword!");
    }

    public SecureAreaPage clickLoginButton(){
        $(loginButton).click();
        return new SecureAreaPage();
    }
}
