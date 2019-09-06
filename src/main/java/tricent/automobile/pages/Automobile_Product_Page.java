package tricent.automobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import tricents.object.DriverContext;

public class Automobile_Product_Page {
	
	public Automobile_Product_Page() {
		
		PageFactory.initElements(DriverContext.getDriver(), this);
		}

		public static By Input_State_Data = By.id("startdate");
		public static By Choose_Insurance_Sum = By.id("insurancesum");
		public static By Choose_Merit_Rating = By.id("meritrating");
		public static By Choose_Damage_Insurance = By.id("damageinsurance");
		public static By Choose_Euro_Protection = By.xpath("//label[text()='Euro Protection']");
		public static By Choose_LegalDefense_Insurance = By.xpath("//label[text()='Legal Defense Insurance']");
		public static By Choose_Courtesy_Car = By.id("courtesycar");
		public static By Click_BtnNextProduct = By.id("nextselectpriceoption");
		
		
		
	}
	
	


