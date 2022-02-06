package automationCode;

import java.awt.TrayIcon.MessageType;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mainCode.MainBackend;

public class Module2 {

	public WebDriver selectReligion(WebDriver driver, String religion_Name) {
		String drpDown = "id_generalinfoform-religion";
		if (religion_Name.equalsIgnoreCase("hindu"))
			religion_Name = "Hinduism";
		if (religion_Name.equalsIgnoreCase("christian"))
			religion_Name = "Christianity";
		driver = selectOption(driver, drpDown, religion_Name);
		return driver;
	}

	public WebDriver setFirstName(WebDriver driver, String fname) {
		WebElement fNameBox = driver.findElement(By.id("id_generalinfoform-first_name"));

		fNameBox.clear();
		if (!fname.isEmpty())
			fNameBox.sendKeys(fname);
		else
			fNameBox.sendKeys("-");

		return driver;
	}

	public WebDriver setLastName(WebDriver driver, String lname) {
		WebElement lNameBox = driver.findElement(By.id("id_generalinfoform-last_name"));

		lNameBox.clear();
		if (!lname.isEmpty())
			lNameBox.sendKeys(lname);
		else
			lNameBox.sendKeys("-");

		return driver;
	}

	public WebDriver setDOB(WebDriver driver, Date dob) {

		int dd = dob.getDate();
		int mm = dob.getMonth() + 1;
		int yy = dob.getYear();
		WebElement doseElement = driver.findElement(By.id("id_generalinfoform-dob"));
		doseElement.clear();
		doseElement.sendKeys(dd + "/");
		doseElement.sendKeys(mm + "/");
		doseElement.sendKeys("" + yy);

		return driver;
	}

	public WebDriver setPtIssueDt(WebDriver driver, Date d) {

		int dd = d.getDate();
		int mm = d.getMonth() + 1;
		int yy = d.getYear();
		WebElement doseElement = driver.findElement(By.id("id_generalinfoform-passport_issue_date"));
		doseElement.clear();
		doseElement.sendKeys(dd + "/");
		doseElement.sendKeys(mm + "/");
		doseElement.sendKeys("" + yy);

		return driver;
	}

	public WebDriver setPtExpDt(WebDriver driver, Date d) {

		int dd = d.getDate();
		int mm = d.getMonth() + 1;
		int yy = d.getYear();
		WebElement doseElement = driver.findElement(By.id("id_generalinfoform-passport_expiry_on"));
		doseElement.clear();
		doseElement.sendKeys(dd + "/");
		doseElement.sendKeys(mm + "/");
		doseElement.sendKeys("" + yy);

		return driver;
	}

	public WebDriver setHeight(WebDriver driver, String height) {
		WebElement heightBox = driver.findElement(By.id("id_generalinfoform-height"));
		heightBox.clear();
		heightBox.sendKeys(height);
		return driver;
	}

	public WebDriver setWeight(WebDriver driver, String weight) {
		WebElement weightBox = driver.findElement(By.id("id_generalinfoform-weight"));
		weightBox.clear();
		weightBox.sendKeys(weight);
		return driver;
	}

	public WebDriver setGender(WebDriver driver, String sex, String MaleID, String FemaleID) {
		WebElement MaleRadio = driver.findElement(By.id("id_generalinfoform-gender_0"));
		WebElement FemaleRadio = driver.findElement(By.id("id_generalinfoform-gender_1"));
		if (MaleID.equalsIgnoreCase(sex)) {
			MaleRadio.click();
		} else if (FemaleID.equalsIgnoreCase(sex)) {
			FemaleRadio.click();
		}
		return driver;
	}

	public WebDriver setPassportIssue(WebDriver driver, String address) {
		WebElement passportIssue = driver.findElement(By.id("id_generalinfoform-passport_issue_place"));
		passportIssue.clear();
		passportIssue.sendKeys(address);
		return driver;
	}

	public WebDriver selectPositionName(WebDriver driver, String position) {
		String drpDown = "id_generalinfoform-applied_position";

		driver.findElement(By.id(drpDown)).click();
		Select religionDrpdown = new Select(driver.findElement(By.id(drpDown)));
		boolean valueFound = false;

		List<WebElement> op = religionDrpdown.getOptions();

		for (int i = 0; i < op.size(); i++) {
			// System.out.println("index"+i+" "+op.get(i).getAttribute("value"));
			if (op.get(i).getText().equalsIgnoreCase(position)) {
				religionDrpdown.selectByIndex(i);
				// System.out.println("option selected:"+op.get(i).getText());
				valueFound = true;
				break;
			}
		}
		// System.out.println("value found: "+valueFound);
		if (!valueFound) {
			WebElement chkBox = driver.findElement(By.id("id_generalinfoform-applied_position_is_other"));
			while (!chkBox.isSelected()) {
				chkBox.click();
			}
			WebElement PositionOther = driver.findElement(By.id("id_generalinfoform-applied_position_other"));
			PositionOther.clear();
			PositionOther.sendKeys(position);
		}

		return driver;

	}

	public WebDriver uploadPhoto(WebDriver driver, String path, String waitTime) {
		try {
			WebElement photoBrowse = driver.findElement(By.id("id_reportform-personal_photo"));
			int trys = 1;
			while (!new File(path).exists() && trys < 3) {
				new MainBackend().NotifyPopup("Image Error", "Image path not found " + path, MessageType.ERROR);
				// JOptionPane.showConfirmDialog(null, "Image path not found "+path, "ERROR",
				// JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
				trys++;
			}
			if (trys == 3) {
				new MainBackend().NotifyPopup("Image Error",
						"Maximum attempts, please run the data entry again " + path, MessageType.ERROR);
				// JOptionPane.showConfirmDialog(null, "Maximum attempts, please run the data
				// entry again "+path, "ERROR", JOptionPane.CLOSED_OPTION,
				// JOptionPane.ERROR_MESSAGE);
				throw new FileNotFoundException();
			}
			photoBrowse.sendKeys(path);
			Thread.sleep(Integer.parseInt(waitTime) * 1000);
		} catch (Exception e) {
			System.out.println("Error in uploading photo");
			e.printStackTrace();
		}
		return driver;
	}

	public WebDriver clickSaveOpen(WebDriver driver, String timewait) {
		try {
			// System.out.println("Waiting for User inputs in "+timewait+" sec");
			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

			// Thread.sleep(Integer.parseInt(timewait)*1000);
			if (driver.findElements(By.xpath("/html/body/main/div/div[2]/div/div/form/div[2]/button[2]")).size() != 0) {
				WebElement viewBtn = driver
						.findElement(By.xpath("/html/body/main/div/div[2]/div/div/form/div[2]/button[2]"));
				viewBtn.click();
				System.out.println("Waiting for User inputs in " + timewait + " sec");
				Thread.sleep(Integer.parseInt(timewait) * 1000);
			} else {
				System.out.println("Save and open button not found the entry is Not New status");
			}
		} catch (NumberFormatException | InterruptedException e) {
			System.out.println();
		}
		return driver;
	}

	public WebDriver setMaritalStatus(WebDriver driver, String marital_Status, String MarriedID, String UnmarriedID) {
		WebElement marriedRad = driver.findElement(By.id("id_generalinfoform-marital_status_0"));
		WebElement unmarriedRad = driver.findElement(By.id("id_generalinfoform-marital_status_1"));
		if (MarriedID.equalsIgnoreCase(marital_Status)) {
			marriedRad.click();
		} else if (UnmarriedID.equalsIgnoreCase(marital_Status)) {
			unmarriedRad.click();
		}
		return driver;
	}

	private WebDriver selectOption(WebDriver driver, String drpDown, String religion_Name) {
		driver.findElement(By.id(drpDown)).click();
		Select religionDrpdown = new Select(driver.findElement(By.id(drpDown)));
		// System.out.println(religion_Name);
		// religionDrpdown.selectByVisibleText(religion_Name);
		// religionDrpdown.selectByIndex(4);

		List<WebElement> op = religionDrpdown.getOptions();

		for (int i = 0; i < op.size(); i++) {
			// System.out.println("index"+i+" "+op.get(i).getAttribute("value"));
			if (op.get(i).getText().equalsIgnoreCase(religion_Name)) {
				religionDrpdown.selectByIndex(i);
				break;
			}
		}

		return driver;
	}

	public WebDriver setNationalId(WebDriver driver, String sex) {
		WebElement ApprovedRadio = driver.findElement(By.id("id_generalinfoform-national_id_check_0"));
		WebElement RejectedRadio = driver.findElement(By.id("id_generalinfoform-national_id_check_1"));
		if ("Approved".equalsIgnoreCase(sex)) {
			ApprovedRadio.click();
		} else if ("Rejected".equalsIgnoreCase(sex)) {
			RejectedRadio.click();
		}
		return driver;
	}

}
