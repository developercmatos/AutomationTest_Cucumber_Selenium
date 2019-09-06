package tricent.automobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import tricents.object.DriverContext;

public class Automobile_Vehicle_Page {

	public Automobile_Vehicle_Page() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	public static By logo_Automobile = By.id("nav_automobile");

	public static By ChooseMake = By.id("make");

	public static By Enginer = By.id("engineperformance");

	public static By DataManufacture = By.id("dateofmanufacture");

	public static By ChooseSeat = By.id("numberofseats");

	public static By ChooseFuelType = By.id("fuel");

	public static By ListPrice = By.id("listprice");

	public static By LicenseNumber = By.id("licenseplatenumber");
	
	public static By AnnualMileage = By.id("annualmileage");
	
	public static By NextVehicle = By.id("nextenterinsurantdata");
	
	
	

}