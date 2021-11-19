package dataCollection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mainCode.MainBackend;
import readData.PropertyData;
import readData.dataObject; 

public class readFromDB {

	ReadCsv readCsv = new ReadCsv();
	PropertyData pData = readCsv.getPropertyData();

	public ArrayList<dataObject> getData(String start, String end) {
		ArrayList<dataObject> AllData = new ArrayList<dataObject>();
		Connection conn = null;
		try {
			
			if(pData.getDb().equals("mysql"))
				conn = getConnectionMYSQL();
			else if(pData.getDb().equals("mssql"))
				conn = getConnectionMSSQL();
			
			if (conn == null) {
				dataObject data = new dataObject();
				data.setHremarks("ERROR");
				AllData.add(data);
				return AllData;
			}
			//String table="gamca.dbo.patients_details";//LOCAL
			String table="oprns.patients_details";//CLINIC
/*			String sql_select = "SELECT * FROM `oprns.patients_details`gamca.dbo.patients_details WHERE `Examine_Date` between '" + start
					+ "' and '" + end + "'";
*/
			
			
			String sql_select = "SELECT * FROM "+table+" WHERE Examine_Date between '" + start
					+ "' and '" + end + "'";
	System.out.println(sql_select);
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(sql_select);

			while (results.next()) {

				dataObject data = new dataObject();
				
				data.setPatient_Id(results.getInt("Patient_Id"));
				data.setFirst_Name(CheckNull(results.getString("First_Name")));
				data.setLast_Name(CheckNull(results.getString("Last_Name")));
				data.setPassPort_No(CheckNull(results.getString("PassPort_No")));
				data.setCountry_Name(CheckNull(results.getString("Country_Name")));
				data.setCrt_Date(results.getDate("Crt_Date"));
				data.setExamine_Date(results.getDate("Examine_Date"));
				data.setMedical_Status(CheckNull(results.getString("Medical_Status")));
				data.setHremarks(CheckNull(results.getString("Hremarks")));
				data.setReligion_Name(CheckNull(results.getString("Religion_Name")));
				data.setHeight(CheckNull(results.getString("Height")));
				data.setWeight(CheckNull(results.getString("Weight")));
				data.setSex(CheckNull(results.getString("Sex")));
				data.setMarital_Status(CheckNull(results.getString("Marital_Status")));
				data.setPossition_Name(CheckNull(results.getString("Possition_Name")));
				
				data.setSysmetic_BP(CheckNull(results.getString("Sysmetic_BP")));
				data.setVision(CheckNull(results.getString("Vision")));
				data.setDULtEye(CheckNull(results.getString("DULtEye")));
				data.setDURtEye(CheckNull(results.getString("DURtEye")));
				data.setDALtEye(CheckNull(results.getString("DALtEye")));
				data.setDARtEye(CheckNull(results.getString("DARtEye")));
				data.setNALtEye(CheckNull(results.getString("NALtEye")));
				data.setNARtEye(CheckNull(results.getString("NARtEye")));
				data.setNULtEye(CheckNull(results.getString("NULtEye")));
				data.setNURtEye(CheckNull(results.getString("NURtEye")));
				data.setXray_check(CheckNull(results.getString("Xray_check")));
				data.setBlood_Group(CheckNull(results.getString("Blood_Group")));
				data.setBlood_Haemoglobin(CheckNull(results.getString("Blood_Haemoglobin")));
				data.setFBS(CheckNull(results.getString("FBS")));
				data.setSerolgy_Creatinine(CheckNull(results.getString("Serolgy_Creatinine")));
				data.setElisa_HIV(CheckNull(results.getString("Elisa_HIV")));
				data.setElisa_HBS(CheckNull(results.getString("Elisa_HBS")));
				data.setElisa_AntiHCV(CheckNull(results.getString("Elisa_AntiHCV")));
				data.setVDRL(CheckNull(results.getString("VDRL")));
				data.setTPHA(CheckNull(results.getString("TPHA")));
				data.setPregnancy_Test(CheckNull(results.getString("Pregnancy_Test")));
				data.setMMR1(results.getBoolean("MMR1"));
				data.setMMR2(results.getBoolean("MMR2"));
				data.setMeningococcal(results.getBoolean("Meningococcal"));
				data.setCOVID(CheckNull(results.getString("COVID")));
				data.setDOSE1(results.getDate("DOSE1"));
				data.setDOSE2(results.getDate("DOSE2"));
				data.setFinal_Status(CheckNull(results.getString("Final_Status")));

				AllData.add(data);
			}
			//new MainBackend().writeLogs(AllData.toString());
			//System.out.println("Data:"+AllData);

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			dataObject data = new dataObject();
			data.setHremarks("ERROR");
			AllData.add(data);
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return AllData;

	}

	private String CheckNull(String string) {
		if(string==null||string.isEmpty()) {
			return "";
		}
		return string;
	}

	private Connection getConnectionMSSQL() {
		Connection conn = null;

		try {
//":"+pData.getDBPort()+      integratedSecurity=true;
			String dbURL = "jdbc:sqlserver://"+pData.getDBURL()+";databaseName="+pData.getDBName()+";";
			String user = pData.getUsername();
			String pass = pData.getPassword();
			System.out.println(dbURL);
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver ).newInstance();
			conn = DriverManager.getConnection(dbURL, user, pass);
			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}

	private Connection getConnectionMYSQL() {
		Connection conn = null;

		try {

			String dbURL = "jdbc:mysql://" + pData.getDBURL() + ":" + pData.getDBPort() + "/"+pData.getDBName();
			String user = pData.getUsername();
			String pass = pData.getPassword();
			conn = DriverManager.getConnection(dbURL, user, pass);
			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				/*
				 * System.out.println("Driver name: " + dm.getDriverName());
				 * System.out.println("Driver version: " + dm.getDriverVersion());
				 * System.out.println("Product name: " + dm.getDatabaseProductName());
				 * System.out.println("Product version: " + dm.getDatabaseProductVersion());
				 */

				// notifyUser("tjdsk","njdkgfkancj");

			}

		} catch (SQLException ex) {
			System.out.println("Error: " + ex.getMessage());
			return null;
		}
		return conn;
	}
}
