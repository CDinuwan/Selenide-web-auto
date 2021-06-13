package pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private By formAuthenticationLink=By.linkText("Form Authentication");
    private By dropdownLink=By.linkText("Dropdown");


    public LoginPage clickFormAuthentication(){
        $(formAuthenticationLink).click();
        return new LoginPage();
    }

    public DropdownPage clickDropdown(){
        $(dropdownLink).click();
        return new DropdownPage();
    }
}
