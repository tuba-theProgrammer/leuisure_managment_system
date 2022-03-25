import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartingWindow extends AssumedDataGenerator {
	
	private JFrame frame;
	private JPanel contentPane;
	private JButton FacilityDiary_btn,FitnessDiary_btn,Registration_btn,ShowMemberShips_btn,ShowLifeGuard_btn,Facility_WeeklyReport_btn;
	private JLabel lblNewLabel;
	static ArrayList<FitnessClass_InfoDataHolder> fitnessClassDataHolder;
	static ArrayList<FacilityClassDataHolder> facilityClassDataHolder;
	static ArrayList<NewMembership_RegistrationDataHolder> MembersData;
	/**
	 * Launch the application.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				
					// getting Data That we Assumed in Data Generator class
					
					facilityClassDataHolder=(AssumedDataGenerator.getFacilitySampleData());  
					fitnessClassDataHolder = (AssumedDataGenerator.getFitnessSampleData());
					MembersData=(AssumedDataGenerator.getMembershipData());
					
					//Here i am initializing it.... as this is static so ... i accessed with class name.
									StartingWindow window = new StartingWindow();
				
					window.frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartingWindow() {
		
		
		initialize();
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame=new JFrame();
		frame.setTitle("Leisure Facility Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(100, 100, 1200, 488);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));    // setting borders size
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setVisible(true);        // make form visibity true
		
		
		
		// Label for first window
		lblNewLabel = new JLabel("Leisure Facility Managment System");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 32));
		lblNewLabel.setBounds(306, 43, 623, 80);
		contentPane.add(lblNewLabel);
		
		
		//Facility Diary Button
		FacilityDiary_btn = new JButton("Facility registrations");
		FacilityDiary_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		FacilityDiary_btn.setBounds(434, 349, 332, 61);
		contentPane.add(FacilityDiary_btn);  // adding button to content pane
	
			
		//Fitness Diary button
		FitnessDiary_btn = new JButton("Fitness class registrations");
		FitnessDiary_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		FitnessDiary_btn.setBounds(434, 240, 332, 61);
		contentPane.add(FitnessDiary_btn);   // adding button to content pane
		
		
		// Registration Button
		Registration_btn = new JButton("Resgister a new member");
		Registration_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Registration_btn.setBounds(10, 240, 332, 61);
		contentPane.add(Registration_btn);  // adding button to content pane
		
		
		// Button to show memberShip details
		
		ShowMemberShips_btn = new JButton("Show all members");
		ShowMemberShips_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ShowMemberShips_btn.setBounds(10, 349, 332, 61);
		contentPane.add(ShowMemberShips_btn);
		
		// button to show LifeGuard Duties
		ShowLifeGuard_btn = new JButton("Show Staff Timings");
		ShowLifeGuard_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ShowLifeGuard_btn.setBounds(842, 240, 332, 61);
		contentPane.add(ShowLifeGuard_btn);
		
		
		// Facility - report Of Weekly budget Button
		Facility_WeeklyReport_btn = new JButton("Weekly Report of Facility Booking");
		Facility_WeeklyReport_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Facility_WeeklyReport_btn.setBounds(842, 349, 332, 61);
		contentPane.add(Facility_WeeklyReport_btn);
		
		
		// here are action listener for each buttons
		// An action listener is an object of type ActionListener. ActionListener is not a class, but is a property that can give to any class which we define.
		
		// for FitnessDiary button
		FitnessDiary_btn.addActionListener(new ActionListener(){ 

               //defining a method actionPerformed
              public void actionPerformed(ActionEvent ae){ 
            	  new FitnessClassRegistration_Window();
            	  
              }});
		
		// for Facility Diary button
		FacilityDiary_btn.addActionListener(new ActionListener(){

		         //defining a method actionPerformed
		        public void actionPerformed(ActionEvent ae){ 
		        	new FacilityChooser_Window();  
		            	  
		              }});
		
		
		// for registration button
		Registration_btn.addActionListener(new ActionListener(){

			//defining a method actionPerformed
		       public void actionPerformed(ActionEvent ae){ 
		    	   new RegisterNewMember_Window();        	  
				            	  
				}});
		
		
		// show membership
		ShowMemberShips_btn.addActionListener(new ActionListener(){

			//defining a method actionPerformed
		       public void actionPerformed(ActionEvent ae){ 
		    	   new ListOfMemberShips_Window();  	   	  
				            	  
				}});
		
		//show lifeGuard rota
		ShowLifeGuard_btn.addActionListener(new ActionListener(){

			//defining a method actionPerformed
		       public void actionPerformed(ActionEvent ae){ 
		    	   new ListOfStaffTimings_Window();	   
				            	  
				}});
		
		
		// facility booking --- income made
		Facility_WeeklyReport_btn.addActionListener(new ActionListener(){

			//defining a method actionPerformed
		       public void actionPerformed(ActionEvent ae){ 
		    		  new WeeklyReport_Window(); 
				}});
		
		
	}
}
