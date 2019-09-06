package tricent.automobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import tricents.object.DriverContext;

public class Automobile_Insurant_Page {

	public Automobile_Insurant_Page() {

		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	public static By Input_FirstName = By.id("firstname");
	public static By Input_LastName = By.id("lastname");
	public static By Input_DateBirth = By.id("birthdate");
	public static By Choose_GenderMale = By.xpath("//label[text()='Male']");
	public static By Choose_GenderFemale = By.xpath("//label[text()='Female']");
	public static By Input_Address = By.id("streetaddress");
	public static By Choose_Country = By.id("country");
	public static By Input_ZipCode = By.id("zipcode");
	public static By Input_City = By.id("city");
	public static By Choose_Occupation = By.id("occupation");
	public static By Choose_Speeding = By.xpath("//div[10]//p[1]//label[1]//span[1]");
	public static By Choose_Bungee_Jumping = By.xpath("//div[10]//p[1]//label[2]//span[1]");
	public static By Choose_Cliff_Diving = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox invalid']//p[@class='group']//label[1]");
	public static By Choose_SkyDiving = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox invalid']//p[@class='group']//label[1]");
	public static By Choose_Others = By.xpath("//div[@class='field idealforms-field idealforms-field-checkbox invalid']//p[@class='group']//label[1]");
	public static By Input_WebSite = By.id("website");
	public static By Click_BtnNextInsurant = By.id("nextenterproductdata");
	
	

}
