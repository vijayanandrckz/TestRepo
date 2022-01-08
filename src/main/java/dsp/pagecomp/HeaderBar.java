package dsp.pagecomp;

import dsp.abstractcomp.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderBar extends AbstractComponent {
    WebDriver driver;

    By links = By.cssSelector("a");
    By flights = By.cssSelector("[title='Flights']");


    public String selectFlight(){
       return findElement(flights).getAttribute("class");
    }
    public HeaderBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }
    public int getLinks(){
       return findElements(links).size();
    }
}
