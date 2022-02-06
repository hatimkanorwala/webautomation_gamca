package readData;

public class globalValues {
	private static String seperator="=";
	private static String propertyFileName="data.properties";
	private static String logs="./automation.logs";
	private static String generallogs="./automation_gen.logs";
	private static String hashFile= "automation.lic";
	private static String version= "1.0.20";
	public static String getSeperator() {
		return seperator;
	} 
	public static String getPropertyFileName() {
		return propertyFileName;
	}
	public static String getLogs() {
		return logs;
	}
	public static String getHashFile() {
		return hashFile;
	}
	public static String getVersion() {
		return version;
	}
	public static String getGenerallogs() {
		return generallogs;
	}
	
}
