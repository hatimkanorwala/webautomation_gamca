package mainCode;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import automationCode.Login;
import automationCode.Module1;
import automationCode.Module2;
import automationCode.Module3;
import dataCollection.ReadCsv;
import readData.PropertyData;
import readData.dataObject;
import readData.globalValues;

public class MainBackend {

	static WebDriver driver;
	ReadCsv readCsv = new ReadCsv();
	PropertyData pData = readCsv.getPropertyData();
	Login loginMod = new Login();

	public WebDriver login() {
		driver = loginMod.getLoginPage(pData.getURL(), pData.getWaitSecLogin());
		return driver;
	}
	public void testSelect1(WebDriver driver, dataObject data) {
		driver.get("http://localhost/code.html");
		Module2 mod2 = new Module2();
		driver = mod2.selectReligion(driver, data.getReligion_Name());
		System.out.println("religion done"+data.getReligion_Name());
	}

	public void automation(ArrayList<dataObject> AllData, WebDriver driver) {
		// System.out.println(AllData.size());
		// Display display = new Display();

		try {

			// driver = loginMod.getLoginPage(pData.getURL(), pData.getWaitSecLogin());

			// ArrayList<dataObject> AllData = new ArrayList<dataObject>();

			// AllData will be fetched from db with start date and end date filters
			// AllData = new readFromDB().getData(StartDate.getYear()+"-"+
			// (StartDate.getMonth()+1)+"-"+StartDate.getDay(),EndDate.getYear()+"-"+(EndDate.getMonth()+1)+"-"+EndDate.getDay());

			for (dataObject data : AllData) {
				
				driver = loginMod.getDashboardPage(driver, pData.getDashboardURL());
				// driver = loginMod.closeDashboardPage(driver);

				Module1 mod1 = new Module1();
				driver = mod1.setPassport(driver, data.getPassPort_No());
				driver = mod1.selectStatus(driver, "New");
				driver = mod1.clickSearch(driver);
				driver = mod1.clickView(driver);
System.out.println("mod1 done");

				Module2 mod2 = new Module2();
				driver = mod2.selectReligion(driver, data.getReligion_Name());
				System.out.println("religion done");
				driver = mod2.setHeight(driver, data.getHeight());
				System.out.println("height done");
				driver = mod2.setWeight(driver, data.getWeight());
				System.out.println("weight done");
				driver = mod2.setGender(driver, data.getSex(), pData.getMaleGender(), pData.getFemaleGender());
				System.out.println("gender done");
				driver = mod2.setMaritalStatus(driver, data.getMarital_Status(), pData.getMarriedId(),
						pData.getUnmarriedId());
				System.out.println("martial done");
				driver = mod2.selectPositionName(driver, data.getPossition_Name());
				System.out.println("position done");
				driver = mod2.uploadPhoto(driver,
						pData.getPhotoLocation() + "\\" + "sample"/*data.getPassPort_No()*/  + pData.getPhotoEnd(),pData.getWaitPhotoCrop());
				System.out.println("photo done");
				driver = mod2.clickSaveOpen(driver, pData.getWaitSecLogin());
				System.out.println("mod 2 done");

				Module3 mod3 = new Module3();
				driver = mod3.setBloodPressure(driver, data.getSysmetic_BP());
				System.out.println("bp done"+data.getSysmetic_BP());
				driver = mod3.selectColourVision(driver, data.getVision());
				System.out.println("colour vision done"+data.getVision());
				driver = mod3.setDulteye(driver, data.getDULtEye());
				System.out.println("dulteye done"+data.getDULtEye());
				driver = mod3.setDurteye(driver, data.getDURtEye());
				System.out.println("durteye done"+data.getDURtEye());
				driver = mod3.setDalteye(driver, data.getDALtEye());
				System.out.println("dalteye done"+data.getDALtEye());
				driver = mod3.setDarteye(driver, data.getDARtEye());
				System.out.println("darteye done"+data.getDARtEye());
				driver = mod3.setNulteye(driver, data.getNULtEye());
				System.out.println("nulteye done"+data.getNULtEye());
				driver = mod3.setNurteye(driver, data.getNURtEye());
				System.out.println("nurteye done"+data.getNURtEye());
				driver = mod3.setNalteye(driver, data.getNALtEye());
				System.out.println("nalteye done"+data.getNALtEye());
				driver = mod3.setNarteye(driver, data.getNARtEye());
				System.out.println("narteye done"+data.getNARtEye());
				driver = mod3.selectXray(driver, data.getChest_Xray());
				System.out.println("xray done"+data.getXray_check());
				driver = mod3.selectBloodGrp(driver, data.getBlood_Group());
				System.out.println("bloodgrp done"+data.getBlood_Group());
				driver = mod3.setHaemoglobin(driver, data.getBlood_Haemoglobin());
				System.out.println("haemoglobin done"+data.getBlood_Haemoglobin());
				driver = mod3.setFBS(driver, data.getFBS());
				System.out.println("fbs done"+data.getFBS());
				driver = mod3.setCreatinine(driver, data.getSerolgy_Creatinine());
				System.out.println("creatinine done"+data.getSerolgy_Creatinine());
				driver = mod3.selectElisaHIV(driver, data.getElisa_HIV());
				System.out.println("elisaHIV done"+data.getElisa_HIV());
				driver = mod3.selectElisaHBS(driver, data.getElisa_HBS());
				System.out.println("elisaHBS done"+data.getElisa_HBS());
				driver = mod3.selectElisaAntiHCV(driver, data.getElisa_AntiHCV());
				System.out.println("elisaAnitHCV done"+data.getElisa_AntiHCV());
				driver = mod3.selectVdrl(driver, data.getVDRL());
				System.out.println("vdrl done"+data.getVDRL());
				driver = mod3.selectTpha(driver, data.getTPHA());
				System.out.println("tpha done"+data.getTPHA());
				
				if(pData.getFemaleGender().equalsIgnoreCase(data.getSex())) {
					driver = mod3.selectPregnancy(driver, data.getPregnancy_Test());
					System.out.println("pregnancy done"+data.getPregnancy_Test());
				}
				driver = mod3.selectMMR1(driver, data.isMMR1());
				System.out.println("mmr1 done"+data.isMMR1());
				driver = mod3.selectMMR2(driver, data.isMMR2());
				System.out.println("mmr2 done"+data.isMMR2());
				driver = mod3.selectMeningococcal(driver, data.isMeningococcal());
				System.out.println("meningococcal done"+data.isMeningococcal());
				//Covid
				//Covid dose date
				//final status

				System.out.println("Mod 3 done");

				driver = loginMod.closeDashboardPage(driver);
				System.out.println("Automation paused for entry, ready for next entry");
			}
		} catch (Exception e) {
			System.out.println("Some Error occoured: " + e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("Stopping the automation");
		// driver.quit();

	}
	
	public void logout(WebDriver driver) {
		driver.quit();
	}
	
	public void writeLogs(String msg) {
		 try {
			 FileWriter myWriter = new FileWriter(globalValues.getLogs(),true);
		      myWriter.write(msg);
		      myWriter.close();
		      //System.out.println("Successfully wrote to the file.");
		      
		    } catch (Exception e) {
		      System.out.println("An error occurred."+e.getMessage());
//		      e.printStackTrace();
		    }
	}
	


}
