package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchFlightsPage extends TestBase {

	
	public SearchFlightsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Search flights']")
	WebElement SearchFlighHeader;

	@FindBy(xpath = "//*[text()='Fly anywhere. Fly everywhere']")
	WebElement searchFlightSubHeader;

	@FindBy(xpath = "//p[text()='One way']")
	WebElement oneWayButton;

	@FindBy(xpath = "//p[text()='Round trip']")
	WebElement roundTripButton;

	@FindBy(xpath = "//div[@class='p-relative']")
	WebElement fromCity;

	@FindBy(id = "ToTag")
	WebElement toCity;

	@FindBy(id = "DepartDate")
	WebElement calender;

	@FindBy(id = "Adults")
	WebElement adultsCount;

	@FindBy(id = "Childrens")
	WebElement childrenCount;

	@FindBy(id = "Infants")
	WebElement infantsCount;

	@FindBy(id = "SearchBtn")
	WebElement submitButton;

	public String getPageHeader() {
		return SearchFlighHeader.getText();
	}

	public FlightResultPage SearchFlight(String from, String to, String date) {
		fromCity.sendKeys(from);
		toCity.sendKeys(to);
		calender.click();
		sele_Actions.selectbyValue(adultsCount, "2");
		sele_Actions.selectbyValue(childrenCount, "0");
		sele_Actions.selectbyValue(infantsCount, "0");
		submitButton.click();
		return new FlightResultPage();

	}

}