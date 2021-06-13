package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class DropdownPage {

    private By dropdownField=By.id("dropdown");

    public void selectFromDropDown(String option) {
        $(dropdownField).selectOption(option);
    }
    public String returnOptionText(){
        String dropdownText=$(dropdownField).getText();
        return dropdownText;
    }
}
