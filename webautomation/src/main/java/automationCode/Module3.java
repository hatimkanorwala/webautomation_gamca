package automationCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Module3 {

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

	public WebDriver setBloodPressure(WebDriver driver, String bp) {
		WebElement bloodPresure = driver.findElement(By.id("id_custom_field_1"));
		bloodPresure.sendKeys(bp);
		return driver;
	}

	public WebDriver selectColourVision(WebDriver driver, String vision) {
		String drpDown="id_custom_field_12";
		driver = selectOption(driver,drpDown,vision);
		return driver;
	}

	public WebDriver setDulteye(WebDriver driver, String duLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_6"));
		field.sendKeys(duLtEye);
		return driver;
	}

	public WebDriver setDurteye(WebDriver driver, String duRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_7"));
		field.sendKeys(duRtEye);
		return driver;
	}

	public WebDriver setDalteye(WebDriver driver, String daLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_4"));
		field.sendKeys(daLtEye);
		return driver;
	}

	public WebDriver setDarteye(WebDriver driver, String daRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_5"));
		field.sendKeys(daRtEye);
		return driver;
	}

	public WebDriver setNulteye(WebDriver driver, String nuLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_10"));
		field.sendKeys(nuLtEye);
		return driver;
	}

	public WebDriver setNurteye(WebDriver driver, String nuRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_11"));
		field.sendKeys(nuRtEye);
		return driver;
	}

	public WebDriver setNalteye(WebDriver driver, String naLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_8"));
		field.sendKeys(naLtEye);
		return driver;
	}

	public WebDriver setNarteye(WebDriver driver, String naRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_9"));
		field.sendKeys(naRtEye);
		return driver;
	}

	public WebDriver selectXray(WebDriver driver, String chest_Xray) {
		String drpDown="id_custom_field_40";
		driver = selectOption(driver,drpDown,chest_Xray);
		return driver;
	}

	public WebDriver selectBloodGrp(WebDriver driver, String blood_Group) {
		String drpDown="id_custom_field_42";
		driver = selectOption(driver,drpDown,blood_Group);
		return driver;
	}

	public WebDriver setHaemoglobin(WebDriver driver, String blood_Haemoglobin) {
		WebElement field = driver.findElement(By.id("id_custom_field_43"));
		field.sendKeys(blood_Haemoglobin);
		return driver;
	}

	public WebDriver setFBS(WebDriver driver, String fbs) {
		System.out.println("fbs value:"+fbs);
		WebElement field = driver.findElement(By.id("id_custom_field_46"));
		field.sendKeys(fbs);
		return driver;
	}

	public WebDriver setCreatinine(WebDriver driver, String serolgy_Creatinine) {
		WebElement field = driver.findElement(By.id("id_custom_field_48"));
		field.sendKeys(serolgy_Creatinine);
		return driver;
	}

	public WebDriver selectElisaHIV(WebDriver driver, String elisa_HIV) {
		String drpDown="id_custom_field_49";
		driver = selectOption(driver,drpDown,elisa_HIV);
		return driver;
	}

	public WebDriver selectElisaHBS(WebDriver driver, String elisa_HBS) {
		String drpDown="id_custom_field_50";
		driver = selectOption(driver,drpDown,elisa_HBS);
		return driver;
	}

	public WebDriver selectElisaAntiHCV(WebDriver driver, String elisa_AntiHCV) {
		String drpDown="id_custom_field_51";
		driver = selectOption(driver,drpDown,elisa_AntiHCV);
		return driver;
	}

	public WebDriver selectVdrl(WebDriver driver, String vdrl) {
		String drpDown="id_custom_field_52";
		driver = selectOption(driver,drpDown,vdrl);
		return driver;
	}

	public WebDriver selectTpha(WebDriver driver, String tpha) {
		String drpDown="id_custom_field_53";
		driver = selectOption(driver,drpDown,tpha);
		return driver;
	}

	public WebDriver selectPregnancy(WebDriver driver, String pregnancy_Test) {
		String drpDown="id_custom_field_54";
		driver = selectOption(driver,drpDown,pregnancy_Test);
		return driver;
	}

	public WebDriver selectMMR1(WebDriver driver, String mmr1) {
		String drpDown="id_custom_field_63";
		driver = selectOption(driver,drpDown,mmr1);
		return driver;
	}
	
	public WebDriver selectMMR2(WebDriver driver, String mmr2) {
		String drpDown="id_custom_field_65";
		driver = selectOption(driver,drpDown,mmr2);
		return driver;
	}

	public WebDriver selectMeningococcal(WebDriver driver, String meningococcal) {
		String drpDown="id_custom_field_67";
		driver = selectOption(driver,drpDown,meningococcal);
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
