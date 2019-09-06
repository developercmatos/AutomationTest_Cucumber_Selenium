package tricents.object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OpenBrowser {

	static String browserType = "";

	// Method to map ChromeDriver and Choose the Browser
	public static void openBrowser(String url) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		browserType = "chrome";

		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rafael.matos.marinho\\eclipse-workspace\\com.br.tricentsproject\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);
			DriverContext.setDriver(driver);

		} else if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\rafael.matos.marinho\\eclipse-workspace\\com.br.tricentsproject\\drivers\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);
			DriverContext.setDriver(driver);

		} else {

			System.setProperty("webdriver.msedgedriver.driver",
					"C:\\Users\\rafael.matos.marinho\\eclipse-workspace\\com.br.tricentsproject\\drivers\\msedgedriver.exe");

			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);
			DriverContext.setDriver(driver);
		}

	}

	// Method to close the Web Page
	public void closeBrowser() {
		DriverContext.getDriver().quit();
	}

	
	//Method to wait for web page to open
public static void waitForPageLoadComplete() {
	Wait<WebDriver> wait = new WebDriverWait(DriverContext.getDriver(), 30);
		wait.until(driver1 -> String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState"))
				.equals("complete"));
	}


}
