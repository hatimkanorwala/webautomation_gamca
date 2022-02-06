package mainCode;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");

	public WebDriver login() {
		driver = loginMod.getLoginPage(pData.getURL(), pData.getWaitSecLogin());
		return driver;
	}

	public void testSelect1(WebDriver driver, dataObject data) {
		driver.get("http://localhost/code.html");
		Module2 mod2 = new Module2();
		driver = mod2.selectReligion(driver, data.getReligion_Name());
		System.out.println("religion done" + data.getReligion_Name());
	}

	/**
	 * @param AllData
	 * @param driver
	 */
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
				if (pData.getDebug()) {
					writeLogs(data.toString());
				}
				Module1 mod1 = new Module1();
				driver = mod1.setPassport(driver, data.getPassPort_No());
				driver = mod1.selectStatus(driver, pData.getStatusToSearch());
				driver = mod1.clickSearch(driver);
				driver = mod1.clickView(driver);
				log("mod1 done");

				Module2 mod2 = new Module2();
				driver = mod2.selectReligion(driver, data.getReligion_Name());
				log("religion done");
				driver = mod2.setFirstName(driver, data.getFirst_Name());
				log("First Name done "+data.getFirst_Name());
				driver = mod2.setLastName(driver, data.getLast_Name());
				log("last name done "+data.getLast_Name());
				//driver = mod2.setDOB(driver, data.getDate_Of_Birth());
				log("DOB done "+data.getDate_Of_Birth());
				driver = mod2.setHeight(driver, data.getHeight());
				log("height done");
				driver = mod2.setWeight(driver, data.getWeight());
				log("weight done" + data.getWeight());
				//driver = mod2.setPtIssueDt(driver, data.getPassport_IssueDt());
				log("Ppt issue date done "+data.getPassport_IssueDt());
				//driver = mod2.setPtExpDt(driver, data.getExpiry_date());
				log("Ppt expiry date done "+data.getExpiry_date());
				driver = mod2.setGender(driver, data.getSex(), pData.getMaleGender(), pData.getFemaleGender());
				log("gender done");
				driver = mod2.setPassportIssue(driver, data.getPassPort_Place());
				log("Passport issue place done "+data.getPassPort_Place());
				driver = mod2.selectPositionName(driver, data.getPossition_Name());
				log("position done");
				if (data.getCountry_Name().equalsIgnoreCase("Kuwait")) {
					// driver = mod2.setNationalId(driver,data.getSex());
					log("national id done");
				} else {
					log("national id not done as country not kuwait");
				}
				driver = mod2.uploadPhoto(driver,
						pData.getPhotoLocation() + "\\" + data.getPassPort_No() + pData.getPhotoEnd(),
						pData.getWaitPhotoCrop());
				log("photo done");
				driver = mod2.setMaritalStatus(driver, data.getMarital_Status(), pData.getMarriedId(),
						pData.getUnmarriedId());
				log("martial done");
				driver = mod2.clickSaveOpen(driver, pData.getWaitSecLogin());
				log("mod 2 done");

				Module3 mod3 = new Module3();
				driver = mod3.setBloodPressure(driver, data.getSysmetic_BP());
				log("bp done" + data.getSysmetic_BP());
				driver = mod3.setPulse(driver, data.getPulse());
				log("pulse done " + data.getPulse());
				driver = mod3.setRR(driver, data.getSysmetic_RR());
				log("RR done " + data.getSysmetic_RR());
				driver = mod3.selectColourVision(driver, data.getVision());
				log("colour vision done" + data.getVision());
				driver = mod3.setDulteye(driver, data.getDULtEye());
				log("dulteye done" + data.getDULtEye());
				driver = mod3.setDurteye(driver, data.getDURtEye());
				log("durteye done" + data.getDURtEye());
				driver = mod3.setDalteye(driver, data.getDALtEye());
				log("dalteye done" + data.getDALtEye());
				driver = mod3.setDarteye(driver, data.getDARtEye());
				log("darteye done" + data.getDARtEye());
				driver = mod3.setNulteye(driver, data.getNULtEye());
				log("nulteye done" + data.getNULtEye());
				driver = mod3.setNurteye(driver, data.getNURtEye());
				log("nurteye done" + data.getNURtEye());
				driver = mod3.setNalteye(driver, data.getNALtEye());
				log("nalteye done" + data.getNALtEye());
				driver = mod3.setNarteye(driver, data.getNARtEye());
				log("narteye done" + data.getNARtEye());
				driver = mod3.setEarLeft(driver, data.getEar_Left());
				log("left ear done" + data.getEar_Left());
				driver = mod3.setEarRight(driver, data.getEar_Right());
				log("right ear done" + data.getEar_Right());
				
				driver = mod3.selectXray(driver, data.getXray_check(),pData.getXrayAbNormal());
				log("xray done"+data.getXray_check()+" "+ pData.getXrayAbNormal());
				 
				driver = mod3.selectBloodGrp(driver, data.getBlood_Group());
				log("bloodgrp done" + data.getBlood_Group());
				driver = mod3.setHaemoglobin(driver, data.getBlood_Haemoglobin());
				log("haemoglobin done" + data.getBlood_Haemoglobin());
				driver = mod3.setMalaria(driver, data.getMaleria(),pData.getMalariaPresent());
				log("Maleria done" + data.getMaleria());
				driver = mod3.setMicro_Filaria(driver, data.getMicro_Filaria(),pData.getMicroFilariaPresent());
				log("Micro_Filaria done" + data.getMicro_Filaria());
				driver = mod3.setRBS(driver, data.getSerolgy_RBS());
				log("rbs done" + data.getSerolgy_RBS());
				driver = mod3.setLFT(driver, data.getSerolgy_Lfts(),pData.getLftAbnormal());
				log("lft done" + data.getSerolgy_Lfts());
				driver = mod3.setCreatinine(driver, data.getSerolgy_Creatinine());
				log("creatinine done" + data.getSerolgy_Creatinine());
				
				driver = mod3.selectElisaHIV(driver, data.getElisa_HIV(), pData.getSerologyDefault());
				log("elisaHIV done" + data.getElisa_HIV());
				driver = mod3.selectElisaHBS(driver, data.getElisa_HBS(), pData.getSerologyDefault());
				log("elisaHBS done" + data.getElisa_HBS());
				driver = mod3.selectElisaAntiHCV(driver, data.getElisa_AntiHCV(), pData.getSerologyDefault());
				log("elisaAnitHCV done" + data.getElisa_AntiHCV());
				driver = mod3.selectVdrl(driver, data.getVDRL(), pData.getSerologyDefault());
				log("vdrl done" + data.getVDRL());
				driver = mod3.selectTpha(driver, data.getTPHA(), pData.getSerologyDefault());
				log("tpha done" + data.getTPHA());
				 
				if (pData.getFemaleGender().equalsIgnoreCase(data.getSex())) {
					driver = mod3.selectPregnancy(driver, data.getPregnancy_Test());
					log("pregnancy done" + data.getPregnancy_Test());
				}

				driver = mod3.selectMMR1(driver, "Yes");
				log("mmr1 done" + "Yes");
				driver = mod3.selectMMR2(driver, "No");
				log("mmr2 done" + "No");
				if (data.getCountry_Name().toUpperCase().contains("SAUDI")) {
					driver = mod3.selectMeningococcal(driver, "Yes");
					log("meningococcal done" + "Yes");
				} else {
					driver = mod3.selectMeningococcal(driver, "No");
					log("meningococcal done" + "No");
				}

				// Covid
				log("gslip dt:"+data.getGamcaslip_date());
				log("dose 2 date: "+data.getDOSE2());
				log("Compare:"+data.getGamcaslip_date().compareTo(data.getDOSE2())+(data.getGamcaslip_date().compareTo(data.getDOSE2())!=0));
				if ( data.getGamcaslip_date().compareTo(data.getDOSE2())==0) {
					driver = mod3.selectCovid(driver, data.getCOVID(), data.getDOSE1());
					log("Covid dose1 done" + DateFor.format(data.getDOSE1()).toString());
				} else {
					driver = mod3.selectCovid(driver, data.getCOVID(), data.getDOSE2());
					log("Covid dose2 done" + DateFor.format(data.getDOSE2()).toString());
				}

				// final status

				log("Mod 3 done");

				// driver = loginMod.closeDashboardPage(driver);
				log("Automation paused for entry, ready for next entry");
				new MainBackend().NotifyPopup("Success","Data is entered for Passport# " + data.getPassPort_No()
				+ "\nYou can proceed with verification and submitting data",MessageType.INFO);
				/*JOptionPane.showConfirmDialog(null,
						"Data is entered for Passport# " + data.getPassPort_No()
								+ "\nYou can proceed with verification and submitting data",
						"Success", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
						*/
			}
		} catch (Exception e) {
			log("Some Error occoured: " + e.getMessage());
			e.printStackTrace();
		}
		// System.out.println("Stopping the automation");
		// driver.quit();

	}

	public void logout(WebDriver driver) {
		driver.quit();
	}

	public void writeLogs(String msg) {
		try {
			FileWriter myWriter = new FileWriter(globalValues.getLogs(), true);
			myWriter.write(msg);
			myWriter.close();
			// System.out.println("Successfully wrote to the file.");

		} catch (Exception e) {
			System.out.println("An error occurred." + e.getMessage());
//		      e.printStackTrace();
		}
	}
	
	public void log(String msg) {
		try {
			FileWriter myWriter = new FileWriter(globalValues.getGenerallogs(), true);
			myWriter.write(msg+"\n");
			myWriter.close();
			System.out.println(msg);

		} catch (Exception e) {
			System.out.println("An error occurred." + e.getMessage());
//		      e.printStackTrace();
		}
	}
	
	public void NotifyPopup(String title,String msg, MessageType icon) {
		try {
			SystemTray tray = SystemTray.getSystemTray();
			Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
			TrayIcon trayIcon = new TrayIcon(image, "GAMCA Automation");
			// Let the system resize the image if needed
			trayIcon.setImageAutoSize(true);
			// Set tooltip text for the tray icon
			trayIcon.setToolTip("System tray icon demo");
			tray.add(trayIcon);

			// Display info notification:
			trayIcon.displayMessage(title, msg,icon);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
