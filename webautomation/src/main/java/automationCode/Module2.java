package automationCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Module2 {

	public WebDriver selectReligion(WebDriver driver, String religion_Name) {
		String drpDown="id_generalinfoform-religion";
		driver = selectOption(driver,drpDown,religion_Name);
		return driver;
	}

	

	public WebDriver setHeight(WebDriver driver, String height) {
		WebElement heightBox = driver.findElement(By.id("id_generalinfoform-height"));
		heightBox.sendKeys(height);
		return driver;
	}

	public WebDriver setWeight(WebDriver driver, String weight) {
		WebElement weightBox = driver.findElement(By.id("id_generalinfoform-height"));
		weightBox.sendKeys(weight);
		return driver;
	}

	public WebDriver setGender(WebDriver driver, String sex, String MaleID, String FemaleID) {
		WebElement MaleRadio = driver.findElement(By.id("id_generalinfoform-gender_0"));
		WebElement FemaleRadio = driver.findElement(By.id("id_generalinfoform-gender_1"));
		if(MaleID.equalsIgnoreCase(sex)) {
			MaleRadio.click();
		}else if(FemaleID.equalsIgnoreCase(sex)) {
			FemaleRadio.click();
		}
		return driver;
	}

	public WebDriver selectPositionName(WebDriver driver, String position) {
		String drpDown="id_generalinfoform-applied_position";
		driver = selectOption(driver,drpDown,position);
		return driver;
	}

	public WebDriver uploadPhoto(WebDriver driver, String path, String waitTime) {
		try {
			WebElement photoBrowse = driver.findElement(By.id("id_reportform-personal_photo"));
			photoBrowse.sendKeys(path);
			Thread.sleep(Integer.parseInt(waitTime) * 1000);
		} catch (NumberFormatException | InterruptedException e) {
			System.out.println("Error in uploading photo");
			e.printStackTrace();
		}
		return driver;
	}

	public WebDriver clickSaveOpen(WebDriver driver, String timewait) {
		try {
			System.out.println("Waiting for User inputs in "+timewait+" sec");
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
			Thread.sleep(Integer.parseInt(timewait)*1000);
			WebElement viewBtn = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/form/div[2]/button[2]"));
			viewBtn.click();
			System.out.println("Waiting for User inputs in "+timewait+" sec");
			Thread.sleep(Integer.parseInt(timewait)*1000);
		} catch (NumberFormatException | InterruptedException e) {
			System.out.println();
		}
		return driver;
	}

	public WebDriver setMaritalStatus(WebDriver driver, String marital_Status, String MarriedID, String UnmarriedID) {
		WebElement marriedRad = driver.findElement(By.id("id_generalinfoform-marital_status_0"));
		WebElement unmarriedRad = driver.findElement(By.id("id_generalinfoform-marital_status_1"));
		if(MarriedID.equalsIgnoreCase(marital_Status)) {
			marriedRad.click();
		}else if(UnmarriedID.equalsIgnoreCase(marital_Status)) {
			unmarriedRad.click();
		}
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
