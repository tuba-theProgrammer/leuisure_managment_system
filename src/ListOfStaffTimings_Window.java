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

public class ListOfStaffTimings_Window extends JFrame {

	private JPanel contentPane;
	private JTable stafRotaTable;
	private JButton Close_btn;
	private JScrollPane scrollPane;
	static LocalDate strDate;
	private DefaultTableModel model;
	private JLabel lblNewLabel;
	
	/**
	 * Create the frame.
	 */
	public ListOfStaffTimings_Window() {
		
		setVisible(true);
		setTitle("Fitness Diary");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//adding scrollPane for table
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 1164, 303);
		contentPane.add(scrollPane);
		
		
		
		
		// JTable ======== for Fitness data
		stafRotaTable = new JTable();
		scrollPane.setViewportView(stafRotaTable); // adding tables for scrollPane
		
		
		Close_btn = new JButton("Close");
		Close_btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Close_btn.setBounds(528, 409, 128, 29);
		contentPane.add(Close_btn);
		
		lblNewLabel = new JLabel("Staff Schedules");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(439, 32, 306, 35);
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
	
	void DisplayTableData() {
		
		
		model=new DefaultTableModel();
		model.addColumn("Names");
	    model.addColumn("Monday");
	    model.addColumn("Tuesday");
	    model.addColumn("Wednesday");
	    model.addColumn("Friday");
	    model.addColumn("Saturday");
	    model.addColumn("Sunday");
	    
	    
	    ArrayList<LifeGuardScheduleDataHolder> Weeklychedule=AssumedDataGenerator.getLifeGuardSchedule();
		    
		for(LifeGuardScheduleDataHolder Schedule : Weeklychedule)
		{
			model.addRow(new Object[]{
					Schedule.getLifeGuardName(),
					Schedule.getMonday(),
					Schedule.getTuesday(),
					Schedule.getWed(),
					Schedule.getThurs(),
					Schedule.getFri(),
					Schedule.getSat(),
					Schedule.getSunday()
	    	 });
			
	    	 
		}
	    
	 stafRotaTable.setModel(model);
    	
   	 stafRotaTable.getColumnModel().getColumn(0).setPreferredWidth(100);
   	 stafRotaTable.getColumnModel().getColumn(1).setPreferredWidth(100);
   	 stafRotaTable.getColumnModel().getColumn(2).setPreferredWidth(100);
   	 stafRotaTable.getColumnModel().getColumn(3).setPreferredWidth(100);
   	 stafRotaTable.getColumnModel().getColumn(4).setPreferredWidth(100);
   	 stafRotaTable.getColumnModel().getColumn(5).setPreferredWidth(100);
   	 stafRotaTable.getColumnModel().getColumn(6).setPreferredWidth(100);
   		
	    	
	
		}
	
	
}

