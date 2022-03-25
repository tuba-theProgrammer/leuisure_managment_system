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
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwimingFacility_Window extends JFrame {

	private JPanel contentPane;
	private JTable FacilityOpeningTimingsTable;
	private JButton Close_btn,Registration_btn,ParticipantDetails_btn,Unpaid_btn;
	private JScrollPane scrollPane;
	int index;
	private JLabel lb1;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public SwimingFacility_Window(int index) {
		this.index=index;
		setVisible(true);
		setTitle(AssumedDataGenerator.getFacilitySampleData().get(index).FacilityName);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//adding scrollPane for table
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 1164, 239);
		contentPane.add(scrollPane);
		
		// JTable ======== for Fitness data
		FacilityOpeningTimingsTable = new JTable();
		scrollPane.setViewportView(FacilityOpeningTimingsTable); // adding tables for scrollPane
		
		
		lb1 = new JLabel(AssumedDataGenerator.getFacilitySampleData().get(index).FacilityName);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lb1.setBounds(456, 11, 271, 24);
		contentPane.add(lb1);
	  
		

	    Registration_btn = new JButton("Register Partcipants ");
		Registration_btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Registration_btn.setBounds(137, 323, 212, 45);
		contentPane.add(Registration_btn);
		
		ParticipantDetails_btn = new JButton("Participant Details");
		ParticipantDetails_btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ParticipantDetails_btn.setBounds(486, 323, 212, 45);
		contentPane.add(ParticipantDetails_btn);
		
		Unpaid_btn = new JButton("Unpaid");
		Unpaid_btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Unpaid_btn.setBounds(835, 323, 212, 45);
		contentPane.add(Unpaid_btn);
	
        // registration 
		Registration_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

							int num = StartingWindow.facilityClassDataHolder.get(index).numberOfPeople;
				if(num<7) {
				new RegisterNewPartcipantForFacility_RegFrom(index);
				}
				else {
					JOptionPane.showMessageDialog(null, "Can't register - selected Facility is already reserved");  	        		
					   
				}
			}
		});
        //Partcipants details		
		ParticipantDetails_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ListOfRegisteredParticipants_Facility(index);
			}
		});

       // Unpaid Button
		Unpaid_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ListOfPendingRequestsForRegistration_Facility(index);
			}
		});
		

		
		
		Close_btn = new JButton("Close");
		Close_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Close_btn.setBounds(544, 409, 95, 29);
		contentPane.add(Close_btn);
		
		 
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
	 * creating method for facilities
	 */
	void DisplayTableData() {
		
		
		/**
		 * Adding Column to Table 
		 */
		
		model=new DefaultTableModel();
	    model.addColumn("WeekDay");
	    model.addColumn("Shift1 - Timing");
	    model.addColumn("Shift1 - LifeGuard");
	    model.addColumn("Shift2 - Timing");
	    model.addColumn("Shift2 - LifeGuard");
		    
	    
	    /**
		 * getting data in FacilityOpeningTimingsDataHolder type array, this data is comes from AssumedDataGenerator class
		 */
	    ArrayList<FacilityOpeningTimingsDataHolder> faciliyOpeningTiming = AssumedDataGenerator.getFacilitySampleData().get(index).getOpeningTiming();
		
		for(FacilityOpeningTimingsDataHolder timings : faciliyOpeningTiming)
		{   
			 /**
			 * Adding Data from FacilityOpeningTimingsDataHolder to rows in Table
			 */
			model.addRow(new Object[]{
					
					timings.getweekDay(),
					timings.getshift1_timing(),
					timings.getshift1_instructor(),
					timings.getshift2_timing(),
					timings.getshift2_instructor()
	    	 });
			
	    	 
		}
	    
	 FacilityOpeningTimingsTable.setModel(model);
    	
   	 FacilityOpeningTimingsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
   	 FacilityOpeningTimingsTable.getColumnModel().getColumn(1).setPreferredWidth(80);
   	 FacilityOpeningTimingsTable.getColumnModel().getColumn(2).setPreferredWidth(50);
   	 FacilityOpeningTimingsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
   	 FacilityOpeningTimingsTable.getColumnModel().getColumn(4).setPreferredWidth(60);
   	    	 FacilityOpeningTimingsTable.setRowSelectionAllowed(false);
   
	    		
	    	
	
		}
}
