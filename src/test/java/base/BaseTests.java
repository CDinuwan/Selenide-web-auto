package base;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTests {

    public WebDriver driver=getWebDriver();
    protected HomePage homePage;

    @Test
    public void setUp(){
        open("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);

        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        String alertText=secureAreaPage.getAlertText();
        System.out.println(alertText);
        $(By.className("icon-lock")).shouldHave(Condition.exactText(alertText));
}
}
