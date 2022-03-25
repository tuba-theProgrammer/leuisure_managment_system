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

public class ListOfPendingRequestsForRegistions_Fitness extends JFrame {

	private JPanel contentPane;
	private JTable ParticipantsDetails_Table;
	private JScrollPane scrollPane;
	private JLabel lb;
	private DefaultTableModel model;
	private ArrayList<String> memberShipIds; 
	static int row;
	/**
	 * Create the frame.
	 */
	public ListOfPendingRequestsForRegistions_Fitness(int row) {
		this.row=row;
		setTitle("Partcipants Details");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 100, 986, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		memberShipIds = new ArrayList<String>();
		
		// label for membership
		lb = new JLabel("Pending registrations");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lb.setBounds(352, 30, 270, 26);
		contentPane.add(lb);
		
		        //adding scrollPane for table
				scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 99, 950, 272);
				contentPane.add(scrollPane);
				
				// JTable ======== for Fitness data
				ParticipantsDetails_Table = new JTable();
				scrollPane.setViewportView(ParticipantsDetails_Table); // adding tables for scrollPane
				
				JButton Close_btn = new JButton("Close");
				Close_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
				Close_btn.setBounds(423, 403, 123, 35);
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
	    model.addColumn("registration Date");
	    model.addColumn("Paid Amount");
	    model.addColumn("Pending Amount");
	    model.addColumn("Pending");
	   
	    
	    ArrayList<FitnessParticipent_RegistrationInfoDataHolder>   PartcipantsDetailsShow = StartingWindow.fitnessClassDataHolder.get(row).getParticipantDetails();
		
		for( FitnessParticipent_RegistrationInfoDataHolder Details : PartcipantsDetailsShow)
		{   
			if(!Details.getPaymentStatus())
			{
			
				//Storing Ids of those who has not paid.
				
				memberShipIds.add(Details.getMemberShipId()+"");
				
			model.addRow(new Object[]{
				  Details.getMemberShipId(),
				  Details.getName(),
				  Details.getMobileNumber(),
				  Details.getEmail(),
				  Details.getAccountNumber(),
				  Details.getRegistrationDate(),
				  Details.getPaidAmount(),
				  Details.getpendingAmount(),
				  "Paid"
			
	    	 });
			
			} 
		}
	    
	 ParticipantsDetails_Table.setModel(model);
    	
   	 ParticipantsDetails_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
   	 ParticipantsDetails_Table.getColumnModel().getColumn(1).setPreferredWidth(100);
   	 ParticipantsDetails_Table.getColumnModel().getColumn(2).setPreferredWidth(100);
   	 ParticipantsDetails_Table.getColumnModel().getColumn(3).setPreferredWidth(150);
   	 ParticipantsDetails_Table.getColumnModel().getColumn(4).setPreferredWidth(100);
  	 ParticipantsDetails_Table.getColumnModel().getColumn(5).setPreferredWidth(100);
  	 ParticipantsDetails_Table.getColumnModel().getColumn(6).setPreferredWidth(100);
  	ParticipantsDetails_Table.getColumnModel().getColumn(7).setPreferredWidth(100);
  	 ParticipantsDetails_Table.getColumnModel().getColumn(8).setCellRenderer(new ButtonRenderer2());
  	 ParticipantsDetails_Table.getColumnModel().getColumn(8).setCellEditor(new ButtonEditor2(new JTextField(),memberShipIds,row,this));
   	 ParticipantsDetails_Table.setRowSelectionAllowed(false);

		}
	

}



//BUTTON RENDERER CLASS
class ButtonRenderer2 extends JButton implements  TableCellRenderer
{

//CONSTRUCTOR
public ButtonRenderer2() {

	
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
class ButtonEditor2 extends DefaultCellEditor
{


ArrayList<String> memberShipIds;
int classIndex;

protected JButton btn;
private String lbl;
private Boolean clicked;
static int row,selectedIndex;
ListOfPendingRequestsForRegistions_Fitness parentWindow;
public ButtonEditor2(JTextField txt, ArrayList<String> memberShipIds, int classIndex, ListOfPendingRequestsForRegistions_Fitness parentWindow) {
super(txt);

btn=new JButton();
btn.setOpaque(true);

this.classIndex =classIndex;
this.memberShipIds = memberShipIds;
this.parentWindow = parentWindow;

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
 System.out.println("Working for payments of parti");
 	  setPaymentStatus(true);
 
      }
//SET IT TO FALSE NOW THAT ITS CLICKED
clicked=false;
return new String(lbl);
}


private void setPaymentStatus(Boolean value) {
	
	
	 ArrayList<FitnessParticipent_RegistrationInfoDataHolder>   PartcipantsDetailsShow = StartingWindow.fitnessClassDataHolder.get(classIndex).getParticipantDetails();
		
	 int targetMember =Integer.parseInt( memberShipIds.get(row));
	 int tagetIndex=0;
		for( FitnessParticipent_RegistrationInfoDataHolder Details : PartcipantsDetailsShow)
		{   
			if(Details.getMemberShipId()==targetMember)
			{
				System.out.println("Foun on index "+tagetIndex);
				break;
			}
			tagetIndex++;
		}
		
		StartingWindow.fitnessClassDataHolder.get(classIndex).getParticipantDetails().get(tagetIndex).paymentStatus=true;
		float setAmount=StartingWindow.fitnessClassDataHolder.get(classIndex).getParticipantDetails().get(tagetIndex).pendingAmount;
		StartingWindow.fitnessClassDataHolder.get(classIndex).getParticipantDetails().get(tagetIndex).paidAmount+=setAmount;
		StartingWindow.fitnessClassDataHolder.get(classIndex).getParticipantDetails().get(tagetIndex).pendingAmount=0;
		new  ListOfPendingRequestsForRegistions_Fitness(classIndex);
		parentWindow.dispose();
		System.out.println("Updated");
	
}

@Override
public boolean stopCellEditing() {

     //SET CLICKED TO FALSE FIRST
  clicked=false;
return super.stopCellEditing();
}

@Override
protected void fireEditingStopped() {
// TODO Auto-generated method stub
super.fireEditingStopped();
}



}
