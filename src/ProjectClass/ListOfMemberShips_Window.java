package ProjectClass;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.SwingConstants;

public class ListOfMemberShips_Window extends JFrame {

	private JPanel contentPane;
	private JTable MemberShipDetails_Table;
	private JScrollPane scrollPane;
	private JLabel lb;
	private DefaultTableModel model;
	
	/**
	 * Create the frame.
	 */
	public ListOfMemberShips_Window() {
		setTitle("MemberShip Details");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		// label for membership
		lb = new JLabel("MemberShip Details");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lb.setBounds(457, 11, 270, 26);
		contentPane.add(lb);
		
		        //adding scrollPane for table
				scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 103, 1164, 272);
				contentPane.add(scrollPane);
				
				
				
				
				// JTable ======== for Fitness data
				MemberShipDetails_Table = new JTable();
				scrollPane.setViewportView(MemberShipDetails_Table); // adding tables for scrollPane
				
				JButton Close_btn = new JButton("Close");
				Close_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
				Close_btn.setBounds(531, 412, 123, 26);
				contentPane.add(Close_btn);
				
				DisplayTableData();   // Calling Display Method
				
				// creating button for Close
				
				Close_btn.addActionListener(new ActionListener(){

					//defining a method actionPerformed
				       public void actionPerformed(ActionEvent ae){ 
				    	   dispose(); 	  
						            	  
						}});
				
	}
	
void DisplayTableData() {
		
		
		model=new DefaultTableModel();
	    model.addColumn("MemberShip ID");
	    model.addColumn("Member Name");
	    model.addColumn("Mobile Number");
	    model.addColumn("Email");
	    model.addColumn("Account Number");
	    model.addColumn("MemberShip Type");
	    model.addColumn("registration Date");
	    model.addColumn("Paid Amount");
	    model.addColumn("Update");
	   
	    ArrayList<NewMembership_RegistrationDataHolder>memberDetails = StartingWindow.MembersData;
		
		for( NewMembership_RegistrationDataHolder Details : memberDetails)
		{
			model.addRow(new Object[]{
					Details.getMemberShipId(),
					Details.getName(),
					Details.getMobileNumber(),
					Details.getEmail(),
					Details.getAccountNumber(),
					Details.getMemberShipType(),
					Details.getRegistrationDate(),
					Details.getPaidAmount(),
	    			"Update"
	    	 });
			
	    	 
		}
	    
	 MemberShipDetails_Table.setModel(model);
    	
   	 MemberShipDetails_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
   	 MemberShipDetails_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
   	 MemberShipDetails_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
   	 MemberShipDetails_Table.getColumnModel().getColumn(3).setPreferredWidth(150);
   	 MemberShipDetails_Table.getColumnModel().getColumn(4).setPreferredWidth(100);
   	 MemberShipDetails_Table.getColumnModel().getColumn(5).setPreferredWidth(100);
  	 MemberShipDetails_Table.getColumnModel().getColumn(6).setPreferredWidth(100);
  	 MemberShipDetails_Table.getColumnModel().getColumn(7).setPreferredWidth(100);
  	 MemberShipDetails_Table.getColumnModel().getColumn(8).setCellRenderer(new ButtonRenderer4());
  	 MemberShipDetails_Table.getColumnModel().getColumn(8).setCellEditor(new ButtonEditor4(new JTextField(),this));

   	 MemberShipDetails_Table.setRowSelectionAllowed(false);
      
	    		
	    	
	
		}
	

}





//BUTTON RENDERER CLASS
class ButtonRenderer4 extends JButton implements  TableCellRenderer
{


//CONSTRUCTOR
public ButtonRenderer4() {
//SET BUTTON PROPERTIES
setOpaque(true);
}
@Override
public Component getTableCellRendererComponent(JTable table, Object obj,
boolean selected, boolean focused, int row, int col) {

//SET PASSED OBJECT AS BUTTON TEXT
setText((obj==null) ? "":obj.toString());

return this;
}

}

//BUTTON EDITOR CLASS
class ButtonEditor4 extends DefaultCellEditor
{


protected JButton btn;
private String lbl;
private Boolean clicked;
static int row;
ListOfMemberShips_Window parentWindow;
public ButtonEditor4(JTextField txt, ListOfMemberShips_Window parentWindow) {
super(txt);

btn=new JButton();
btn.setOpaque(true);
this.parentWindow=parentWindow;
//WHEN BUTTON IS CLICKED
btn.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {

  fireEditingStopped();
}
});
}

//OVERRIDE A COUPLE OF METHODS
@Override
public Component getTableCellEditorComponent(JTable table, Object obj,
boolean selected, int row, int col) {
this.row=row;
//SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
	
lbl=(obj==null) ? "":obj.toString();
btn.setText(lbl);
clicked=true;


return btn;
}

//IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
@Override
public Object getCellEditorValue() {

if(clicked)
{ 
	new UpdateMemberShipBio_Window(row,parentWindow);
	
	//new UpdataMemberShipData(row);
    }
//SET IT TO FALSE NOW THAT ITS CLICKED
clicked=false;
return new String(lbl);
}

@Override
public boolean stopCellEditing() {

   //SET CLICKED TO FALSE FIRST
clicked=false;
return super.stopCellEditing();
}

@Override
protected void fireEditingStopped() {
//TODO Auto-generated method stub
super.fireEditingStopped();
}

}

