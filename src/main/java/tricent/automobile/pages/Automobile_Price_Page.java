package tricent.automobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import tricents.object.DriverContext;

public class Automobile_Price_Page {

	public Automobile_Price_Page() {

		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	
	public static By Choose_PriceSilver = By.id("selectsilver");
	public static By Choose_PriceGold = By.id("selectgold");
	public static By Choose_PricePlatinum = By.xpath("//section[@id='pricePlans']//label[3]");
	public static By Choose_PriceUltimate = By.id("selectultimate");
	public static By Click_BtnNext_AbaPrice = By.xpath("//button[@name='Next (Send Quote)']");
	
	
}
