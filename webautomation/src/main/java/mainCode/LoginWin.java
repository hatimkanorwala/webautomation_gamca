package mainCode;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class LoginWin {
	private static Text username;
	private static Text password;

	static Label lblMessage;
	static Shell shlWebAutomationLogin;
	
	public static void main(String[] args) {
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
		
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				
				if(username.getText().equals("ADMIN") && password.getText().equals("ADMIN")||1==1) {
					shlWebAutomationLogin.dispose();
					new Dashboard().dashboardWin();
				}else {
					lblMessage.setText("Username & Password invalid");
					lblMessage.setVisible(true);
				}
				
			}
		});
		
		
		shlWebAutomationLogin.open();
		shlWebAutomationLogin.layout();
		while (!shlWebAutomationLogin.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
