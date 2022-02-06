package dataCollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import readData.PropertyData;
import readData.globalValues;

public class ReadCsv {

	PropertyData pData = new PropertyData();
	String seperator = globalValues.getSeperator();
	String FileName = globalValues.getPropertyFileName();

	public PropertyData getPropertyData() {

		//File file = new File("D:\\ProgramsData\\Github\\DeveloperCodes\\webautomation_gamca\\webautomation\\"+FileName);
		File file = new File("./"+FileName);
		if (!file.exists()) {
			System.out.println("Property file not found");
			System.exit(0);
		}

		try {
			Scanner sc;
			String line, key, value;
			sc = new Scanner(file);

			while (sc.hasNext()) {
				line = sc.next();
				if (!line.startsWith("#")) {
					key = line.split(seperator)[0];
					if(!line.endsWith("=") )
						value = line.split(seperator)[1].replace("*", " ");
					else
						value = "";
					switch (key) {
					case "photoLocation":
						pData.setPhotoLocation(value);
						break;
					case "photoEnd":
						pData.setPhotoEnd(value);
						break;
					case "URL":
						pData.setURL(value);
						break;
					case "dashboardURL":
						pData.setDashboardURL(value);
						break; 
					case "waitSecLogin":
						pData.setWaitSecLogin(value);
						break;
					case "waitPhotoCrop":
						pData.setWaitPhotoCrop(value);
						break;
					case "db":
						pData.setDb(value);
						break;
					case "dbName":
						pData.setDBName(value);
						break;
					case "dbUrl":
						pData.setDBURL(value);
						break;
					case "dbPort":
						pData.setDBPort(value);
						break;
					case "dbUsername":
						pData.setUsername(value);
						break;
					case "dbPassword":
						pData.setPassword(value);
						break;
					case "maleGender":
						pData.setMaleGender(value);
						break;
					case "femaleGender":
						pData.setFemaleGender(value);
						break;
					case "maritalMarried":
						pData.setMarriedId(value);
						break;
					case "maritalUnMarried":
						pData.setUnmarriedId(value);
						break;
					case "statusToSearch":
						pData.setStatusToSearch(value);
						break;
					case "gamca_username":
						pData.setGamcaUsername(value);
						break;
					case "gamca_password":
						pData.setGamcaPassword(value);
						break;
					case "APPLICATION_USERNAME":
						pData.setAppUsername(value);
						break;
					case "APPLICATION_PASSWORD":
						pData.setAppPassword(value);
						break;
					case "debug":
						if(value.equalsIgnoreCase("true"))
							pData.setDebug(true);
						else
							pData.setDebug(false);
						break;
					case "xrayAbNormal":
						pData.setXrayAbNormal(value);
						break;
					case "malariaPresent":
						pData.setMalariaPresent(value);
						break;
					case "microFilariaPresent":
						pData.setMicroFilariaPresent(value);
						break;
					case "lftAbnormal":
						pData.setMicroFilariaPresent(value);
						break;
					case "serologyDefault":
						pData.setSerologyDefault(value);
						break;
					
					}
				}

			}
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pData;

	}
}
