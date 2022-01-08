package dsp.pageobjects;

import dsp.pagecomp.FooterBar;
import dsp.pagecomp.HeaderBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Thomepage {

    WebDriver driver;
    By sectionElement = By.id("traveller-home");
    By HeaderElement = By.xpath("//div[@id='buttons']");

    public Thomepage(WebDriver driver) {
    this.driver = driver;
    }

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public HeaderBar getHeaderBar(){

        return new HeaderBar(driver,HeaderElement);
    }

    public FooterBar getFooterBar(){
        return new FooterBar(driver,sectionElement);
    }
}
