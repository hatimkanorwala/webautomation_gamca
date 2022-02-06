package automationCode;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dataCollection.ReadCsv;
import io.github.bonigarcia.wdm.WebDriverManager;
import readData.PropertyData;

public class Login {

	public String loginDriver="";
	ReadCsv readCsv = new ReadCsv();
	PropertyData pData = readCsv.getPropertyData();
	public WebDriver getLoginPage(String Url, String timewait) {
		WebDriver driver = null;
		
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless");
			options.addArguments("log-level=ALL");
			driver = new ChromeDriver(options);
			driver.get(Url);
			loginDriver = driver.getWindowHandle();
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.findElement(By.id("id_username")).sendKeys(pData.getGamcaUsername());
			//driver.findElement(By.id("id_password")).sendKeys(pData.getGamcaPassword());
			System.out.println("Waiting for User inputs in " + timewait + " sec");
			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
			Thread.sleep(Integer.parseInt(timewait) * 1000);

			/*String username = driver.findElement(By.id("id_username")).getAttribute("value");
			String password = driver.findElement(By.id("id_password")).getAttribute("value");
			
			new MainBackend().writeLogs("username:"+username+"\npassword:"+password);*/
			WebElement viewBtn = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/input[2]"));
			viewBtn.click();
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return driver;
	}
	

	public WebDriver getDashboardPage(WebDriver driver, String url) throws InterruptedException {
		closeDashboardPage(driver);
		System.out.println("page opened?");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('');");

		
		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size()); 

		for (String winHandle : driver.getWindowHandles()) {
			if(!winHandle.equals(loginDriver))
				driver.switchTo().window(winHandle);

		} 

		driver.navigate().to(url);
		Thread.sleep(2500);
		return driver;
	}

	public WebDriver closeDashboardPage(WebDriver driver) throws InterruptedException {
		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size());

		for (String winHandle : driver.getWindowHandles()) {
			if(!winHandle.equals(loginDriver)) {
				driver.close();
				System.out.println("page closed");
				driver.switchTo().window(loginDriver);
				Thread.sleep(2500);
				
			}
				

		}
		return driver;
	}

}
