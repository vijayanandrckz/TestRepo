package dsp.abstractcomp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {

    WebElement sectionElement;
    public AbstractComponent(WebDriver driver, By sectionElement) {
        this.sectionElement = driver.findElement(sectionElement);
    }

    public WebElement findElement(By findelementby){
        return sectionElement.findElement(findelementby);
    }

    public List<WebElement> findElements(By findelementby){
        return sectionElement.findElements(findelementby);
    }
}
