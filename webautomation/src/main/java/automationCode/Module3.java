package automationCode;

import java.sql.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Module3 {


	public WebDriver setBloodPressure(WebDriver driver, String bp) {
		WebElement bloodPresure = driver.findElement(By.id("id_custom_field_1"));
		bloodPresure.clear();
		bloodPresure.sendKeys(bp);
		return driver;
	}
	
	public WebDriver setPulse(WebDriver driver, String pulse) {
		WebElement pulseField = driver.findElement(By.id("id_custom_field_2"));
		pulseField.clear();
		pulseField.sendKeys(pulse);
		return driver;
	}

	public WebDriver selectColourVision(WebDriver driver, String vision) {
		String drpDown="id_custom_field_12";
		driver = selectOption(driver,drpDown,vision);
		return driver;
	}

	public WebDriver setDulteye(WebDriver driver, String duLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_6"));
		field.clear();
		field.sendKeys(duLtEye);
		return driver;
	}

	public WebDriver setDurteye(WebDriver driver, String duRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_7"));
		field.clear();
		field.sendKeys(duRtEye);
		return driver;
	}

	public WebDriver setDalteye(WebDriver driver, String daLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_4"));
		field.clear();
		field.sendKeys(daLtEye);
		return driver;
	}

	public WebDriver setDarteye(WebDriver driver, String daRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_5"));
		field.clear();
		field.sendKeys(daRtEye);
		return driver;
	}

	public WebDriver setNulteye(WebDriver driver, String nuLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_10"));
		field.clear();
		field.sendKeys(nuLtEye);
		return driver;
	}

	public WebDriver setNurteye(WebDriver driver, String nuRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_11"));
		field.clear();
		field.sendKeys(nuRtEye);
		return driver;
	}

	public WebDriver setNalteye(WebDriver driver, String naLtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_8"));
		field.clear();
		field.sendKeys(naLtEye);
		return driver;
	}

	public WebDriver setNarteye(WebDriver driver, String naRtEye) {
		WebElement field = driver.findElement(By.id("id_custom_field_9"));
		field.clear();
		field.sendKeys(naRtEye);
		return driver;
	}
	
	public WebDriver setEarLeft(WebDriver driver, String ear) {
		String drpDown="id_custom_field_14";
		if(!ear.equalsIgnoreCase("Normal")) {
			ear = "Abnormal";
			driver = selectOption(driver,drpDown,ear);
		}
		return driver;
	}
	
	public WebDriver setEarRight(WebDriver driver, String ear) {
		String drpDown="id_custom_field_15";
		if(!ear.equalsIgnoreCase("Normal")) {
			ear = "Abnormal";
			driver = selectOption(driver,drpDown,ear);
		}
		return driver;
	}

	public WebDriver selectXray(WebDriver driver, String chest_Xray, String xrayAbNormal) {
		String drpDown="id_custom_field_40";
		if(!chest_Xray.equalsIgnoreCase(xrayAbNormal)) 
			chest_Xray="NAD";
		else
			chest_Xray="Abnormal";
		driver = selectOption(driver,drpDown,chest_Xray);
		return driver;
	}

	public WebDriver selectBloodGrp(WebDriver driver, String blood_Group) {
		String drpDown="id_custom_field_42";
		String bg=blood_Group.split(" ")[0];
		if(blood_Group.toUpperCase().split(" ")[1].startsWith("P")) {
			bg+="+";
		}else {
			bg+="-";
		}
		driver = selectOption(driver,drpDown,bg);
		return driver;
	}

	public WebDriver setHaemoglobin(WebDriver driver, String blood_Haemoglobin) {
		WebElement field = driver.findElement(By.id("id_custom_field_43"));
		field.clear();
		field.sendKeys(blood_Haemoglobin);
		return driver;
	}
	
	
	public WebDriver setMalaria(WebDriver driver, String maleria, String malariaPresent) {
		String drpDown="id_custom_field_44";
		if(!maleria.equalsIgnoreCase(malariaPresent)) {
			maleria="Present";
			driver = selectOption(driver,drpDown,maleria);
		}else {
			maleria="Absent";
		}
		
		return driver;
	}
	
	public WebDriver setMicro_Filaria(WebDriver driver, String Micro_Filaria, String microFilariaPresent) {
		String drpDown="id_custom_field_45";
		if(!Micro_Filaria.equalsIgnoreCase(microFilariaPresent)) {
			Micro_Filaria="Present";
			driver = selectOption(driver,drpDown,Micro_Filaria);
		}else {
			Micro_Filaria="Absent";
		}
		
		return driver;
	}

	public WebDriver setRBS(WebDriver driver, String rbs) {
		WebElement field = driver.findElement(By.id("id_custom_field_46"));
		field.clear();
		field.sendKeys(rbs);
		return driver;
	}
	
	public WebDriver setLFT(WebDriver driver, String lft,String lftAbnormal) {
		String drpDown="id_custom_field_47";
		if(lft.equalsIgnoreCase(lftAbnormal)) {
			lft="Abnormal";
		}else {
			lft="Normal";
		}
		driver = selectOption(driver,drpDown,lft);
		return driver;
	}

	public WebDriver setCreatinine(WebDriver driver, String serolgy_Creatinine) {
		WebElement field = driver.findElement(By.id("id_custom_field_48"));
		field.clear();
		field.sendKeys(serolgy_Creatinine);
		return driver;
	}

	public WebDriver selectElisaHIV(WebDriver driver, String elisa_HIV, String serologyDefault) {
		String drpDown="id_custom_field_49";
		if(!elisa_HIV.equalsIgnoreCase(serologyDefault)) {
			elisa_HIV="Positive";
			driver = selectOption(driver,drpDown,elisa_HIV);
		}else {
			elisa_HIV="Negative";
		}
		
		return driver;
	}

	public WebDriver selectElisaHBS(WebDriver driver, String elisa_HBS, String serologyDefault) {
		String drpDown="id_custom_field_50";
		if(!elisa_HBS.equalsIgnoreCase(serologyDefault)) {
			elisa_HBS="Positive";
			driver = selectOption(driver,drpDown,elisa_HBS);
		}else {
			elisa_HBS="Negative";
		}
		
		return driver;
	}

	public WebDriver selectElisaAntiHCV(WebDriver driver, String elisa_AntiHCV, String serologyDefault) {
		String drpDown="id_custom_field_51";
		if(!elisa_AntiHCV.equalsIgnoreCase(serologyDefault)) {
			elisa_AntiHCV="Positive";
			driver = selectOption(driver,drpDown,elisa_AntiHCV);
		}else {
			elisa_AntiHCV="Negative";
		}
		
		return driver;
	}

	public WebDriver selectVdrl(WebDriver driver, String vdrl, String serologyDefault) {
		String drpDown="id_custom_field_52";
		if(!vdrl.equalsIgnoreCase(serologyDefault)) {
			vdrl="Positive";
			driver = selectOption(driver,drpDown,vdrl);
		}else {
			vdrl="Negative";
		}
		
		return driver;
	}

	public WebDriver selectTpha(WebDriver driver, String tpha, String serologyDefault) {
		String drpDown="id_custom_field_53";
		if(!tpha.equalsIgnoreCase(serologyDefault)) {
			tpha="Positive";
			driver = selectOption(driver,drpDown,tpha);
		}else {
			tpha="Negative";
		}
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

	public WebDriver selectCovid(WebDriver driver, String covid, Date dose) {
		String drpDown="id_custom_field_69";
		
		driver = selectOption(driver,drpDown,covid);
		int dd = dose.getDate();
		int mm = dose.getMonth()+1;
		int yy = dose.getYear();
		WebElement doseElement = driver.findElement(By.id("id_custom_field_70"));
		doseElement.sendKeys(dd+"/");
		doseElement.sendKeys(mm+"/");
		doseElement.sendKeys(""+yy);
		
		return driver;
	}

	public WebDriver setRR(WebDriver driver, String sysmetic_RR) {
		WebElement rrField = driver.findElement(By.id("id_custom_field_3"));
		rrField.clear();
		rrField.sendKeys(sysmetic_RR);
		return driver;
	}

	

	
	
}
