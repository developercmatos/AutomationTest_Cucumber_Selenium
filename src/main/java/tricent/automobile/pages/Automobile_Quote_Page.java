package tricent.automobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import tricents.object.DriverContext;

public class Automobile_Quote_Page {

	public Automobile_Quote_Page() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	public static By Input_Email = By.id("email");
	public static By Input_Phone = By.id("phone");
	public static By Input_Username = By.id("username");
	public static By Input_Password = By.id("password");
	public static By Input_Confirm_Password = By.id("confirmpassword");
	public static By Input_Comments = By.id("Comments");
	public static By Click_BtnSendEmail = By.id("sendemail");
	public static By Message_SucessSendEmail = By.xpath("//h2[contains(text(),'Sending e-mail success!')]");
	public static By Click_BtnConfirm = By.xpath("//button[@class='confirm']");
	
	
	
	
}
