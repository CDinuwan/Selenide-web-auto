package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropDownPageTest extends BaseTests {

    @Test
    public void selectDropdownItem(){

        String option="Option 1";
        DropdownPage dropdownPage=homePage.clickDropdown();
        dropdownPage.selectFromDropDown(option);
        String optionText= dropdownPage.returnOptionText();
        Assert.assertEquals(optionText,option,"Your dropdown selection test is not equal.");
    }
}
