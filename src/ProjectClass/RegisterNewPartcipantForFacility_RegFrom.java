package ProjectClass;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class RegisterNewPartcipantForFacility_RegFrom extends Facilityutities{
    
	/**
	 * Create the application.
	 */
	
	
	//Constructor
	public RegisterNewPartcipantForFacility_RegFrom(int index) {
		this.index=index;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf=new JFrame();
		jf.setVisible(true);
		jf.setTitle("Registration Form ");
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setBounds(300, 100, 770,596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("Registration of Participant");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		label1.setBounds(240, 23, 270, 35);
		contentPane.add(label1);
		
		Name_lb = new JLabel("Name :");
		Name_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Name_lb.setBounds(86, 135, 46, 14);
		contentPane.add(Name_lb);
		
		Number_lb = new JLabel("Number:");
		Number_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Number_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Number_lb.setBounds(446, 135, 102, 14);
		contentPane.add(Number_lb);
		
		MemberId_lb = new JLabel("Member ID:");
		MemberId_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		MemberId_lb.setBounds(22, 88, 133, 14);
		contentPane.add(MemberId_lb);
		
		MemberShipID_txt = new JTextField();
		MemberShipID_txt.setBounds(122, 86, 145, 20);
		contentPane.add(MemberShipID_txt);
		MemberShipID_txt.setColumns(10);
		
		Name_txt = new JTextField();
		Name_txt.setEditable(false);
		Name_txt.setBounds(155, 133, 239, 20);
		contentPane.add(Name_txt);
		Name_txt.setColumns(10);
		
		Number_txt = new JTextField();
		Number_txt.setEditable(false);
		Number_txt.setColumns(10);
		Number_txt.setBounds(562, 133, 163, 20);
		contentPane.add(Number_txt);
		
		Email_lb = new JLabel("Email:");
		Email_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Email_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Email_lb.setBounds(30, 180, 102, 14);
		contentPane.add(Email_lb);
		
		Email_txt = new JTextField();
		Email_txt.setEditable(false);
		Email_txt.setColumns(10);
		Email_txt.setBounds(158, 178, 236, 20);
		contentPane.add(Email_txt);
		
		AccountNo_lb = new JLabel("Account no:");
		AccountNo_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		AccountNo_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AccountNo_lb.setBounds(419, 180, 133, 14);
		contentPane.add(AccountNo_lb);
		
		AccountNo_txt = new JTextField();
		AccountNo_txt.setEditable(false);
		AccountNo_txt.setColumns(10);
		AccountNo_txt.setBounds(562, 178, 163, 20);
		contentPane.add(AccountNo_txt);
		
		RegistrationDate_lb = new JLabel("Registration Date:");
		RegistrationDate_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		RegistrationDate_lb.setBounds(22, 230, 133, 14);
		contentPane.add(RegistrationDate_lb);
		
		RegistrationDate_txt = new JTextField();
		RegistrationDate_txt.setEditable(false);
		RegistrationDate_txt.setColumns(10);
		RegistrationDate_txt.setBounds(155, 228, 239, 20);
		contentPane.add(RegistrationDate_txt);
		
		Register_btn = new JButton("Register");
		Register_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Register_btn.setBounds(542, 48, 183, 42);
		contentPane.add(Register_btn);
		
		LoadData_btn = new JButton("Load Data");
		LoadData_btn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LoadData_btn.setBounds(305, 85, 89, 23);
		contentPane.add(LoadData_btn);
		
		
		
//******************************************************************** implemented code starts from here*****************************************		
		
		
		Register_btn.setEnabled(false);
		
		RegistrationTypeCheck_lb = new JLabel("------------------------------------------------------------------------------------------------------");
		RegistrationTypeCheck_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		RegistrationTypeCheck_lb.setBounds(22, 278, 556, 20);
		contentPane.add(RegistrationTypeCheck_lb);
		
		
		
//********************************************************************** Panel for swimming --- Method called
		SwimmingPanel();

		
//************************************************************************ support Panels**********************************************************	
		SelectSportHallCategory();
		 SportHall_Category1();
		 SportHall_Category2();
		 SportHall_Category3();
		 
// ********************************************************* Exercise Studio Panel*************************************************
		 ExerciseStudio_Category();
		
//***********************************************************	 LOAD Button	
				
		// Array to register in selected class
		ArrayList<NewMembership_RegistrationDataHolder> MemberDetails = StartingWindow.MembersData;   // get Member ship id to access menmberData
		ArrayList<FacilityClassDataHolder> facilityClassDataHolder = StartingWindow.facilityClassDataHolder;  //// use to register participants in selected class
		
		

		LoadData_btn.addActionListener(new ActionListener(){

	         //defining a method actionPerformed
	        public void actionPerformed(ActionEvent ae){ 
	        	MemberID= Integer.parseInt(MemberShipID_txt.getText());
	        	
	        	Boolean flag = true;
	        	
	        	for(ParticipantInfoDataHolder_Facility  details: facilityClassDataHolder.get(index).getParticipantDetails())
	        	{
	        		if(details.getMemberShipId()==MemberID)
	        		{
	        			flag=false;
	        			break;
	        		}
	        	}
	        	
	        	if(flag)
	        	{
	        	facilityType=facilityClassDataHolder.get(index).getFacilityName();
	        	for(NewMembership_RegistrationDataHolder details :MemberDetails)
	    		{
	        		
	    		      if(details.getMemberShipId()==MemberID)
	    		      {
	    		    	  
	    		    	  
	    		    	  Name_txt.setText(details.getName());
	    		    	  Number_txt.setText(String.valueOf(details.getMobileNumber()));
	    		    	  Email_txt.setText(details.getEmail());
	    		    	  AccountNo_txt.setText(details.getAccountNumber());
	    		    	  RegistrationDate_txt.setText(details.getRegistrationDate());
	    	
	    		    	  Register_btn.setEnabled(true);
	    		    	  RegistrationType_lb.setText(RegistrationType_lb.getText()+"  "+details.getMemberShipType());
	    		    	  registrationType=details.getMemberShipType();
	    		    	  getAmount=details.getPaidAmount();
	    		    	  checkfIdNotMatched=false; 
	    		    	  ChoiceOfRegistrationType();
	    		      }
	    		      
	    		     
	    		}
	        	if(checkfIdNotMatched)
	        	{
	        		 JOptionPane.showMessageDialog(null, "Id not Matched");  

	        	}
	        	}
	        	else
	        	{
	       		 JOptionPane.showMessageDialog(null, "This id is already registered in this class");  	        		
	        	}
	        	
	              }});
	
		
//**************************************************************** Registeration Button********************************	
		
		Register_btn.addActionListener(new ActionListener(){

	         //defining a method actionPerformed
	        public void actionPerformed(ActionEvent ae){
	        
	        	if(isPaid&&isSelectCategory)
	        	{
	        		System.out.println(MemberID);
	        		System.out.println( Name_txt.getText());
	        		System.out.println(Integer.parseInt(Number_txt.getText()));
	        		System.out.println(Email_txt.getText());
	        		System.out.println(AccountNo_txt.getText());
	        		System.out.println(RegistrationDate_txt.getText());
	        		System.out.println(PaymentStatus);
	        		System.out.println(amountPaid);
	        		System.out.println(amountUnpaid);
	        		System.out.println( FacilitySubCategory);
	        		StartingWindow.facilityClassDataHolder.get(index).numberOfPeople+=1;
	        		facilityClassDataHolder.get(index).getParticipantDetails().add(new ParticipantInfoDataHolder_Facility(MemberID, Name_txt.getText(),Integer.parseInt(Number_txt.getText()), Email_txt.getText(), AccountNo_txt.getText(),RegistrationDate_txt.getText(),registrationType,FacilitySubCategory,PaymentStatus,getAmount+amountPaid,amountUnpaid));
	        		jf.dispose();
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(null, "Please Select Payment Option!");
	        		
	        		
	        	}
	        	
	            	
	              }});
		
	

	}
	
// check what type of registration we have and then make  participant register according to that
	
	
	
	  
	  
}

