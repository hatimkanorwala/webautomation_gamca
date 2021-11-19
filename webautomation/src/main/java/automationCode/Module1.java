package automationCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Module1 {

	public WebDriver setPassport(WebDriver driver,String pNo) {
		WebElement passportNo = driver.findElement(By.id("id_passport"));
		passportNo.sendKeys(pNo);
		return driver;
	}
	
	public WebDriver selectStatus(WebDriver driver,String status) {
		String drpDown="id_status";
		driver = selectOption(driver,drpDown,status);
		return driver;
	}
	
	public WebDriver clickSearch(WebDriver driver) {
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/form/div[2]/button[2]"));
		searchBtn.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}

	public WebDriver clickView(WebDriver driver) {
		WebElement viewBtn = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div[2]/table/tbody/tr/td[6]/a"));
		viewBtn.click();
		return driver;
	}
	
	private WebDriver selectOption(WebDriver driver, String drpDown, String religion_Name) {
		driver.findElement(By.id(drpDown)).click();
		Select religionDrpdown = new Select(driver.findElement(By.id(drpDown)));
		//System.out.println(religion_Name);
		//religionDrpdown.selectByVisibleText(religion_Name);
		//religionDrpdown.selectByIndex(4);
		
		List <WebElement> op = religionDrpdown.getOptions();
		
	      for(int i =0; i<op.size() ; i++){
	    	  //System.out.println("index"+i+" "+op.get(i).getAttribute("value"));
	    	  if(op.get(i).getText().equalsIgnoreCase(religion_Name)) {
	    		  religionDrpdown.selectByIndex(i);
	        	 break;
	         }
	      }
	      
	      return driver;
	}
	
}
