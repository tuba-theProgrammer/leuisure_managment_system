import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FitnessClassRegistration_Window extends JFrame {

	private JPanel contentPane;
	private JTable FitnessDiary_Table;
	private JButton Close_btn;
	private JScrollPane scrollPane;
	static LocalDate strDate;
	private DefaultTableModel model;
	private JLabel lblNewLabel;
	/**
	 * Create the frame.
	 */
	public FitnessClassRegistration_Window() {
		
		setVisible(true);
		setTitle("Fitness Class schedules");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//adding scrollPane for table
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 1164, 323);
		contentPane.add(scrollPane);
		
		
		
		// JTable ======== for Fitness data
		FitnessDiary_Table = new JTable();
		scrollPane.setViewportView(FitnessDiary_Table); // adding tables for scrollPane
		
		
		Close_btn = new JButton("Close");
		Close_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Close_btn.setBounds(528, 409, 128, 29);
		contentPane.add(Close_btn);
		
		lblNewLabel = new JLabel("Fitness classes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(478, 26, 227, 38);
		contentPane.add(lblNewLabel);
	   
		Close_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {

		      dispose();
		    }
		  });
		
		
		
		 // calling method to disolay table data
		 DisplayTableData();		
	
	}
	/**
	 * method to create table for getting data of fitness class
	 *
	 */	
	
	void DisplayTableData() {
				
		model=new DefaultTableModel();
	    model.addColumn("Class Grade");
	    model.addColumn("Class Instructor Name");
	    model.addColumn("Start Time");
	    model.addColumn("End Time");
	    model.addColumn("Date");
	    model.addColumn("Register new participant");
	    model.addColumn("Details of Partcipants");   // will show those who can attend selected class
	    model.addColumn("Pending Reg: Amount");
	
	    ArrayList<FitnessClass_InfoDataHolder>fitnessClassDataHolder = AssumedDataGenerator.getFitnessSampleData();
		
	    // setting todays date in fitness table -- make it according to it
	    strDate = java.time.LocalDate.now();
	    
		for(FitnessClass_InfoDataHolder fitnessClassDataHolderRecValue : fitnessClassDataHolder)
		{
			model.addRow(new Object[]{
					fitnessClassDataHolderRecValue.getClassGrade(),
					fitnessClassDataHolderRecValue.getClassInstructorName(),
					fitnessClassDataHolderRecValue.getStartTime(),
					fitnessClassDataHolderRecValue.getEndTime(),
					strDate.toString(),
					"Register New",
					"Participants",
	    			"Pending participants"
	    	 });
			
	    	 
		}
	    
	 FitnessDiary_Table.setModel(model);
    	
   	 FitnessDiary_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
   	 FitnessDiary_Table.getColumnModel().getColumn(1).setPreferredWidth(80);
   	 FitnessDiary_Table.getColumnModel().getColumn(2).setPreferredWidth(50);
   	 FitnessDiary_Table.getColumnModel().getColumn(3).setPreferredWidth(50);
   	 FitnessDiary_Table.getColumnModel().getColumn(4).setPreferredWidth(60);
   	 FitnessDiary_Table.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
   	 FitnessDiary_Table.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JTextField()));
     FitnessDiary_Table.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
  	 FitnessDiary_Table.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JTextField()));
  	 FitnessDiary_Table.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
 	 FitnessDiary_Table.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JTextField()));
   	 FitnessDiary_Table.setRowSelectionAllowed(false);
   
	    		
	    	
	
		}
	
	
}



//BUTTON RENDERER CLASS

class ButtonRenderer extends JButton implements  TableCellRenderer
{

//CONSTRUCTOR
public ButtonRenderer() {
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
class ButtonEditor extends DefaultCellEditor
{
 ArrayList<FitnessClass_InfoDataHolder> fitnessClassDataHolder = StartingWindow.fitnessClassDataHolder;
 static int NumberOfPeople;
 protected JButton btn;
 private String lbl;
 private Boolean clicked;
 static int row;

 public ButtonEditor(JTextField txt) {
  super(txt);
  
  btn=new JButton();
  btn.setOpaque(true);

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
   NumberOfPeople=fitnessClassDataHolder.get(row).getNumberOfPeople();
   System.out.println(NumberOfPeople);
   
   
  return btn;
}

//IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
 @Override
public Object getCellEditorValue() {

   if(clicked)
    {  if(lbl.equals("Register New")) {
    	if(NumberOfPeople>=10) {
    		  btn.setVisible(false); 
    	   }else {
    		   
    		   new RegisteredNewParticipantForFitnessClass_RegFrom(row);
    		   
    	   }
    }
    else if(lbl.equals("Participants")) {
    	new ListOfRegisteredParticipants_fitnessClass(row);
    	
    }
    else if(lbl.equals("Pending participants")) {
    	new ListOfPendingRequestsForRegistions_Fitness(row);
    }
       
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
  // TODO Auto-generated method stub
  super.fireEditingStopped();
}

}