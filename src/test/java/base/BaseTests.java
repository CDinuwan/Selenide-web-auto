package base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.*;

public class BaseTests {

    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        open("https://the-internet.herokuapp.com/");

        homePage = new HomePage();
    }
    @AfterClass
    public void tearDown(){
        closeWebDriver();
    }
}
