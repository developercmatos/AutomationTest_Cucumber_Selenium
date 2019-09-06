package tricents.stepdef;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java8.En;
import tricent.automobile.pages.Automobile_Insurant_Page;
import tricent.automobile.pages.Automobile_Price_Page;
import tricent.automobile.pages.Automobile_Product_Page;
import tricent.automobile.pages.Automobile_Quote_Page;
import tricent.automobile.pages.Automobile_Vehicle_Page;
import tricents.object.Automobile_Objects;
import tricents.object.DriverContext;
import tricents.object.OpenBrowser;

public class Automobile_StepDef implements En {

	Automobile_Objects i = null;
	OpenBrowser open = null;

	public Automobile_StepDef() {
		i = new Automobile_Objects();
		open = new OpenBrowser();

		Given("Abrir o Web Browser", () -> {
			OpenBrowser.openBrowser("http://sampleapp.tricentis.com/101/app.php");
		});

		Given("Estando no menu de Automobile", () -> {
			i.click(Automobile_Vehicle_Page.logo_Automobile);
		});

		When("Entrei com os dados do veiculo e segui para o proximo passo", () -> {

			i.selectDados("Audi", Automobile_Vehicle_Page.ChooseMake);
			i.inserirDados(Automobile_Vehicle_Page.Enginer, "1234");
			i.inserirDados(Automobile_Vehicle_Page.DataManufacture, "09/07/2017");
			i.selectDados("2", Automobile_Vehicle_Page.ChooseSeat);
			i.selectDados("Diesel", Automobile_Vehicle_Page.ChooseFuelType);
			i.inserirDados(Automobile_Vehicle_Page.ListPrice, "1000");
			i.inserirDados(Automobile_Vehicle_Page.LicenseNumber, "123456");
			i.inserirDados(Automobile_Vehicle_Page.AnnualMileage, "2000");
			i.click(Automobile_Vehicle_Page.NextVehicle);
		});

		When("Entrei com os dados do seguro e segui para o proximo passo", () -> {

			i.inserirDados(Automobile_Insurant_Page.Input_FirstName, "Rafael");
			i.inserirDados(Automobile_Insurant_Page.Input_LastName, "Matos");
			i.inserirDados(Automobile_Insurant_Page.Input_DateBirth, "04/19/1985");
			i.click(Automobile_Insurant_Page.Choose_GenderMale);
			i.inserirDados(Automobile_Insurant_Page.Input_Address, "Real da Torre");
			i.inserirDados(Automobile_Insurant_Page.Choose_Country, "Brazil");
			i.inserirDados(Automobile_Insurant_Page.Input_ZipCode, "50710100");
			i.inserirDados(Automobile_Insurant_Page.Input_City, "Recife");
			i.inserirDados(Automobile_Insurant_Page.Choose_Occupation, "Public Official");
			i.click(Automobile_Insurant_Page.Choose_Speeding);
			i.inserirDados(Automobile_Insurant_Page.Input_WebSite, "www.google.com.br");
			i.click(Automobile_Insurant_Page.Click_BtnNextInsurant);
		});

		When("Entrei com os dados do produto e segui para o proximo passo", () -> {

			i.inserirDados(Automobile_Product_Page.Input_State_Data, "09/07/2020");
			i.selectDados("3.000.000,00", Automobile_Product_Page.Choose_Insurance_Sum);
			i.selectDados("Malus 16", Automobile_Product_Page.Choose_Merit_Rating);
			i.selectDados("No Coverage", Automobile_Product_Page.Choose_Damage_Insurance);
			i.click(Automobile_Product_Page.Choose_Euro_Protection);
			i.selectDados("No", Automobile_Product_Page.Choose_Courtesy_Car);
			i.click(Automobile_Product_Page.Click_BtnNextProduct);
		});

		When("Selecionei a opcao de preco e segui para o proximo passo", () -> {

			i.click(Automobile_Price_Page.Choose_PricePlatinum);

			WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), 8);
			wait.until(ExpectedConditions.elementToBeClickable(Automobile_Price_Page.Click_BtnNext_AbaPrice));
			i.click(Automobile_Price_Page.Click_BtnNext_AbaPrice);
		});

		When("Entrei com os dados de Quote", () -> {

			i.inserirDados(Automobile_Quote_Page.Input_Email, "rafaelmatosmusico@gmail.com");
			i.inserirDados(Automobile_Quote_Page.Input_Phone, "81998807827");
			i.inserirDados(Automobile_Quote_Page.Input_Username, "rafamatosmusik");
			i.inserirDados(Automobile_Quote_Page.Input_Password, "123456Rafael");
			i.inserirDados(Automobile_Quote_Page.Input_Confirm_Password, "123456Rafael");
			i.inserirDados(Automobile_Quote_Page.Input_Comments, "Testando");
			i.click(Automobile_Quote_Page.Click_BtnSendEmail);

		});

		
		
		Then("Validei que o cadastro foi realizado com sucesso", () -> {
			WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), 30);
			wait.until(ExpectedConditions.elementToBeClickable(Automobile_Quote_Page.Click_BtnConfirm));
			
			i.validarElementoDisponivel(Automobile_Quote_Page.Message_SucessSendEmail, "Sending e-mail success!");
			i.click(Automobile_Quote_Page.Click_BtnConfirm);
			open.closeBrowser();
			
		});

	}
}
