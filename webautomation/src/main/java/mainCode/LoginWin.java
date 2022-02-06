package mainCode;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.awt.TrayIcon.MessageType;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automationCode.Login;
import automationCode.Module2;
import dataCollection.ReadCsv;
import firstTime.MacAddress;
import firstTime.sendMail;
import io.github.bonigarcia.wdm.WebDriverManager;
import readData.*;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoginWin {
	private static Text username;
	private static Text password;
	private static boolean firstTime = false;

	static Label lblMessage;
	static Shell shlWebAutomationLogin;

	static ReadCsv readCsv = new ReadCsv();
	static PropertyData pData = readCsv.getPropertyData();
	
	public static void main(String[] args) {
		try {
			String macAddr = new MacAddress().getMac();
			int macAddrHash = macAddr.hashCode();
			// System.out.println(macAddrHash);
			File file = new File("./" + globalValues.getHashFile());
			if (file.exists()) {// lic present
				String licFromFile = "";

				// System.out.println("lic present");
				Scanner myReader = new Scanner(file);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					// System.out.println(data);
					licFromFile = data;
				}
				myReader.close();

				if (licFromFile.equals(macAddrHash + "")) {// lic valid
					// System.out.println("lic valid");
					firstTime = false;
				} else {// lic invalid
					// System.out.println("lic invalid reseting lic");
					firstTime = true;
				}

			} else {
				// System.out.println("FirstTime");
				firstTime = true;

			}

			if (firstTime) {

				FileWriter licFile = new FileWriter(file);
				licFile.write("" + macAddrHash);
				licFile.close();
				// System.out.println("writing:"+macAddrHash);
				new sendMail().sendEmail("New installation done on client " + macAddrHash,
						"This is auto mail sent to note that there was GAMCA automation application executed for first time on system: \n"
								+ macAddr + "\n at " + new Date().toString() + ""
										+ "\nServer Path:"+pData.getPhotoLocation()
										+ "\nDB URL:"+pData.getDBURL()
										+ ""
										+ "");
			}
		} catch (Exception e) {
			System.out.println("Error while checking lic or sending mail");
		}
		Display display = Display.getDefault();
		shlWebAutomationLogin = new Shell(SWT.CLOSE);
		shlWebAutomationLogin.setSize(244, 200);
		shlWebAutomationLogin.setText("WebAutomation-Login");

		Label lblUsername = new Label(shlWebAutomationLogin, SWT.NONE);
		lblUsername.setBounds(10, 28, 66, 15);
		lblUsername.setText("Username:");

		Label lblPassword = new Label(shlWebAutomationLogin, SWT.NONE);
		lblPassword.setBounds(10, 55, 66, 15);
		lblPassword.setText("Password:");

		username = new Text(shlWebAutomationLogin, SWT.BORDER);
		username.setBounds(82, 22, 143, 21);

		password = new Text(shlWebAutomationLogin, SWT.BORDER | SWT.PASSWORD);
		password.setBounds(82, 49, 143, 21);

		Button btnLogin = new Button(shlWebAutomationLogin, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (username.getText().equals(pData.getAppUsername()) && password.getText().equals(pData.getAppPassword())) {
					shlWebAutomationLogin.dispose();
					new Dashboard().dashboardWin();
				} else {
					lblMessage.setText("Username & Password invalid");
					lblMessage.setVisible(true);
				}
			}
		});
		btnLogin.setBounds(10, 123, 184, 25);
		btnLogin.setText("Login");

		lblMessage = new Label(shlWebAutomationLogin, SWT.NONE);
		lblMessage.setAlignment(SWT.CENTER);
		lblMessage.setBounds(13, 86, 202, 15);
		lblMessage.setText("Message");
		lblMessage.setVisible(false);

		Button btnDevelopers = new Button(shlWebAutomationLogin, SWT.FLAT);
		btnDevelopers.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		btnDevelopers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				new Developer().devWin();
			}
		});
		btnDevelopers.setBounds(200, 123, 25, 25);
		btnDevelopers.setText("{i}");
		
		Label lblVer = new Label(shlWebAutomationLogin, SWT.NONE);
		lblVer.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		lblVer.setAlignment(SWT.RIGHT);
		lblVer.setBounds(10, 148, 215, 10);
		String ver=new globalValues().getVersion();
		lblVer.setText("Ver: "+ver);

		/*btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {

				
				  if (username.getText().equals(pData.getAppUsername()) &&
				  password.getText().equals(pData.getAppPassword())) {
				  shlWebAutomationLogin.dispose(); new Dashboard().dashboardWin(); } else {
				  lblMessage.setText("Username & Password invalid");
				  lblMessage.setVisible(true); }
				 

			}
		});*/

		shlWebAutomationLogin.open();
		shlWebAutomationLogin.layout();
		while (!shlWebAutomationLogin.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		
		
		
	}

	
	
	
}
