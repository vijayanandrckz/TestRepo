package dspdemo;

import com.crm.qa.utilities.TestUtils;
import dsp.pageobjects.Thomepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T1 {


    //test commit for dsp
    @Test
    public void FlightTest(){

        System.setProperty("webdriver.chrome.driver", TestUtils.WORKSAPCE_PATH + "//drivers//chromedriver.exe");
     //   chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver();
        Thomepage thomepage = new Thomepage(driver);

        thomepage.goTo();

        thomepage.getFooterBar().selectFlight();
        thomepage.getFooterBar().getLinks();
        thomepage.getHeaderBar().selectFlight();
        thomepage.getHeaderBar().getLinks();
    }
}
