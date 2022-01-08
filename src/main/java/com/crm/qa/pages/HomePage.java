package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='mr-6']")
	WebElement logo;

	@FindBy(xpath = "//div[text()='Flights']")
	WebElement flightOption;

	@FindBy(xpath = "//div[text()='Hotels']")
	WebElement hotelOption;

	@FindBy(xpath = "//div[text()='Trains']")
	@CacheLookup
	WebElement TrainOption;

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public SearchFlightsPage selectFlightOption() {
		if (flightOption.isEnabled()) {
			flightOption.click();
		}
		return new SearchFlightsPage();
	}

	public SearchHotelPage selecthotelOption() {
		hotelOption.click();
		return new SearchHotelPage();
	}

}
