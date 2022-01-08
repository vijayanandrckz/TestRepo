package dsp.pagecomp;

import dsp.abstractcomp.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//test commit for dsp
public class FooterBar extends AbstractComponent {
    WebDriver driver;

    By links = By.cssSelector("a");
    By flights = By.cssSelector("[title='Flights']");

    public FooterBar(WebDriver driver, By sectionElement) {

        super(driver,sectionElement); //while inherit the parent class - invoke parent class construtor in your child construtor
    }

    public String selectFlight(){
        System.out.println("vijays1");
      return  findElement(flights).getAttribute("class");
    }

    public int getLinks(){
        return findElements(links).size();
    }
}
