package mainCode;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;

import java.util.ArrayList;
 
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;

import dataCollection.readFromDB;
import readData.dataObject;

import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.TableItem;
import org.openqa.selenium.WebDriver;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Dashboard {
	private Table table;
	ArrayList<dataObject> AllData = new ArrayList<dataObject>();
	MainBackend Operation=new MainBackend();
	WebDriver driver;
	
	public Shell shlWebautomationdashboard;
	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void dashboardWin() {
		try {
			Dashboard window = new Dashboard();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		shlWebautomationdashboard = new Shell(SWT.CLOSE);
		shlWebautomationdashboard.setSize(850, 500);
		shlWebautomationdashboard.setText("WebAutomation-Dashboard");
		shlWebautomationdashboard.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite = new Composite(shlWebautomationdashboard, SWT.NONE);
		composite.setLayout(new FormLayout());
		
		Group grpSetFilter = new Group(composite, SWT.NONE);
		FormData fd_grpSetFilter = new FormData();
		fd_grpSetFilter.top = new FormAttachment(0);
		fd_grpSetFilter.bottom = new FormAttachment(0, 50);
		fd_grpSetFilter.right = new FormAttachment(0, 834);
		grpSetFilter.setLayoutData(fd_grpSetFilter);
		grpSetFilter.setLayout(null);
		grpSetFilter.setText("Filters");
		
		Label lblStartDate = new Label(grpSetFilter, SWT.NONE);
		lblStartDate.setBounds(29, 16, 71, 18);
		lblStartDate.setText("Start Date:");
		
		final DateTime StartDate = new DateTime(grpSetFilter, SWT.NONE);
		StartDate.setBounds(129, 12, 101, 25);
		
		Label lblEndDate = new Label(grpSetFilter, SWT.NONE);
		lblEndDate.setBounds(259, 16, 71, 18);
		lblEndDate.setText("End Date:");
		
		final DateTime EndDate = new DateTime(grpSetFilter, SWT.NONE);
		EndDate.setBounds(359, 12, 101, 25);
		
		Button btnSearchData = new Button(grpSetFilter, SWT.NONE);
		
		btnSearchData.setBounds(489, 12, 141, 25);
		btnSearchData.setText("Search Data");
		
		final Button btnStartAutomation = new Button(grpSetFilter, SWT.NONE);
		btnStartAutomation.setEnabled(false);
		btnStartAutomation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(btnStartAutomation.getText().equals("Login Automation")) {
					//btnStartAutomation.setEnabled(false);
					//Operation.automation(AllData);
					driver = Operation.login();
					btnStartAutomation.setText("Close Automation");
				}else {
					Operation.logout(driver);
					btnStartAutomation.setText("Login Automation");
				}
				
				
			}
		});
		btnStartAutomation.setBounds(659, 12, 141, 25);
		btnStartAutomation.setText("Login Automation");
		
		final Label lblSearchedCount = new Label(composite, SWT.NONE);
		fd_grpSetFilter.left = new FormAttachment(lblSearchedCount, 0, SWT.LEFT);
		FormData fd_lblSearchedCount = new FormData();
		fd_lblSearchedCount.top = new FormAttachment(grpSetFilter, 6);
		fd_lblSearchedCount.left = new FormAttachment(0);
		fd_lblSearchedCount.right = new FormAttachment(0, 834);
		lblSearchedCount.setLayoutData(fd_lblSearchedCount);
		lblSearchedCount.setAlignment(SWT.CENTER);
		lblSearchedCount.setText("Searched Count: 0");
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		fd_lblSearchedCount.bottom = new FormAttachment(scrolledComposite, -6);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setExpandHorizontal(true);
		FormData fd_scrolledComposite = new FormData();
		fd_scrolledComposite.left = new FormAttachment(grpSetFilter, 0, SWT.LEFT);
		fd_scrolledComposite.bottom = new FormAttachment(100);
		fd_scrolledComposite.top = new FormAttachment(0, 79);
		fd_scrolledComposite.right = new FormAttachment(0, 834);
		scrolledComposite.setLayoutData(fd_scrolledComposite);
		scrolledComposite.setMinWidth(800);
		
		
		
		
		Composite composite_1 = new Composite(scrolledComposite, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		
		table = new Table(composite_1, SWT.FULL_SELECTION);
		table.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("row selected"+table.getItem(table.getSelectionIndex()));
				TableItem item = table.getItem(table.getSelectionIndex());
				//System.out.println(item.getText(4));
				//System.out.println(getItem(item.getText(4)).getFirst_Name());
				ArrayList<dataObject> selected=new ArrayList<dataObject>();
				selected.add(getItem(item.getText(2)));
				
				//Operation.testSelect(driver, getItem(item.getText(2)));
				Operation.automation(selected,driver);
				
			}
		});
		table.setLinesVisible(true);
		GridData gd_table = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_table.heightHint = 349;
		table.setLayoutData(gd_table);
		table.setSize(844, 236);
		table.setHeaderVisible(true);
		
		TableColumn tblclmnSr = new TableColumn(table, SWT.LEFT);
		tblclmnSr.setWidth(75);
		tblclmnSr.setText("Sr #");
		
		final TableColumn tblclmnExmColumn = new TableColumn(table, SWT.LEFT);
		tblclmnExmColumn.setWidth(100);
		tblclmnExmColumn.setText("Examine Date");
		
		TableColumn tblclmnPassportId = new TableColumn(table, SWT.LEFT);
		tblclmnPassportId.setWidth(130);
		tblclmnPassportId.setText("Passport Id");
		
		TableColumn tblclmnFirstName = new TableColumn(table, SWT.LEFT);
		tblclmnFirstName.setWidth(130);
		tblclmnFirstName.setText("First Name");
		
		TableColumn tblclmnLastName = new TableColumn(table, SWT.LEFT);
		tblclmnLastName.setWidth(130);
		tblclmnLastName.setText("Last Name");
		
		TableColumn tblclmnCountryTravellingTo = new TableColumn(table, SWT.LEFT);
		tblclmnCountryTravellingTo.setWidth(130);
		tblclmnCountryTravellingTo.setText("Country travelling to");
		
		final TableColumn tblclmnCreatedDate = new TableColumn(table, SWT.LEFT);
		tblclmnCreatedDate.setWidth(110);
		tblclmnCreatedDate.setText("Result");
		
		
		
		scrolledComposite.setContent(composite_1);
		scrolledComposite.setMinSize(composite_1.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    GridData scrollGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		
		
	    
	    btnSearchData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				//table.clearAll();
				table.removeAll();
				
				String startMonth = validateMonth(StartDate.getMonth()+1);
				String endMonth = validateMonth(EndDate.getMonth()+1);
				
				String startDate = validateDate(StartDate.getDay());
				String endDate = validateDate(EndDate.getDay());
				
				AllData = new readFromDB().getData(StartDate.getYear()+"-"+ (startMonth)+"-"+startDate,EndDate.getYear()+"-"+(endMonth)+"-"+endDate);
						
				if(AllData.size()==1) {
					try {
						if(AllData.get(0).getHremarks().equals("ERROR")) {
							notifyUser("Database Connection was Unsuccessful.", "Database Connection",SWT.ICON_ERROR);
						}else {
							notifyUser("Database Connection was Successful.", "Database Connection",SWT.ICON_WORKING);
						}
					}
					catch(NullPointerException ex) {
						notifyUser("Database Connection was Successful.", "Database Connection",SWT.ICON_WORKING);
					}
					
				}else {
					notifyUser("Database Connection was Successful.", "Database Connection",SWT.ICON_WORKING);
				}
				
				
				int i=1;
				lblSearchedCount.setText("Searched Count: "+AllData.size());
				if(AllData.size()>0) {
					btnStartAutomation.setEnabled(true);
				}
				for (dataObject item : AllData) {
					TableItem tableItem = new TableItem(table, SWT.NONE);
					tableItem.setText(new String[] {""+i++, ""+ item.getExamine_Date().toString(), item.getPassPort_No(), item.getFirst_Name(), item.getLast_Name(), item.getCountry_Name(), item.getMedical_Status().toString()  });
				}
				
				
			}
		});
	    
	    
	    
	    
	    
	    
		
		shlWebautomationdashboard.open();
		shlWebautomationdashboard.layout();
		while (!shlWebautomationdashboard.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected String validateMonth(int month) {
		String m="";
		if(month<10) {
			m="0"+month;
		}else {
			m = ""+month;
		}
		return m;
	}
	protected String validateDate(int date) {
		String d="";
		if(date<10) {
			d="0"+date;
		}else {
			d = ""+date;
		}
		return d;
	}

	public dataObject getItem(String pNo) {
		for (dataObject data : AllData) {
			if(data.getPassPort_No().equals(pNo)) {
				return data;
			}
		}
		return null;
	}
	
	public void notifyUser(String title,String msg, int iconWorking) {
		//System.out.println("here");
		MessageBox mb = new MessageBox( shlWebautomationdashboard.getShell(), SWT.OK  | iconWorking );
	    mb.setMessage( title );
	    mb.setText( msg );
	    mb.open();
	    
	}
}
