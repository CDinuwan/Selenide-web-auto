package login;

import base.BaseTests;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import pages.LoginPage;
import pages.SecureAreaPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BaseTests {

    public void testSuccessfullLogin(){
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        String alertText=secureAreaPage.getAlertText();
        $(By.className("icon-lock")).shouldHave(Condition.attribute(alertText));
    }
}
