package tricents.object;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Automobile_Objects {
	

	public void click(By by) {
		DriverContext.getDriver().findElement(by).click();

	}

	public void selectDados(String dado, By by) {
		WebElement elemento = DriverContext.getDriver().findElement(by);
		Select selectDao = new Select(elemento);
		selectDao.selectByVisibleText(dado);

	}

	public void inserirDados(By by, String dados) {
		DriverContext.getDriver().findElement(by).sendKeys(dados);
		;

	}
	
	  public void validarElementoDisponivel(By by, String local) { WebElement
	  elemento = DriverContext.getDriver().findElement(by);
	  System.out.println(local); System.out.println(elemento.getText());
		assertTrue((elemento.getText()).contains(local));
	  
	  }
	 

	


}
