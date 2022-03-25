import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class RegisterNewMember_Window extends JFrame {

	private JPanel contentPane;
	private JTextField MemberShipID_txt;
	private JTextField Name_txt;
	private JTextField Number_txt;
	private JTextField Email_txt;
	private JTextField AccountNo_txt;
	private JTextField RegistrationDate_txt;
	private JTextField PaidAmount_txt;
	private JComboBox<String> RegistrationType_box;
	private JLabel RegistrationDate_lb,RegistrationType_lb,label1,Name_lb,Number_lb,MemberId_lb,Email_lb,AccountNo_lb,PaymentAmount_lb;
	private JButton Register_btn;
	static LocalDate strDate;
	static String RegistrationType;
	static int PaidAmount,checkAmount;
	String regexEmail;
	static Boolean flag=false;
	/**
	 * Create the frame.
	 */
	public RegisterNewMember_Window() {
		setVisible(true);
		setTitle("Registration Form ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 50, 754, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("Registration Form ");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		label1.setBounds(275, 31, 194, 35);
		contentPane.add(label1);
		
		Name_lb = new JLabel("Name :");
		Name_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Name_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		Name_lb.setBounds(124, 116, 102, 18);
		contentPane.add(Name_lb);
		
		Number_lb = new JLabel("Number:");
		Number_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Number_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Number_lb.setBounds(124, 169, 102, 18);
		contentPane.add(Number_lb);
		
		MemberId_lb = new JLabel("Member ID:");
		MemberId_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		MemberId_lb.setBounds(27, 33, 133, 14);
		contentPane.add(MemberId_lb);
		
		MemberShipID_txt = new JTextField();
		MemberShipID_txt.setEditable(false);
		MemberShipID_txt.setBounds(124, 31, 59, 20);
		contentPane.add(MemberShipID_txt);
		MemberShipID_txt.setColumns(10);
		
		Name_txt = new JTextField();
		Name_txt.setBounds(236, 104, 266, 30);
		contentPane.add(Name_txt);
		Name_txt.setColumns(10);
		Name_txt.setToolTipText("Elsa");
		
		Number_txt = new JTextField();
		Number_txt.setColumns(10);
		Number_txt.setBounds(236, 166, 266, 30);
		Number_txt.setToolTipText("9999999998");
		contentPane.add(Number_txt);
		
		Email_lb = new JLabel("Email:");
		Email_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Email_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Email_lb.setBounds(124, 246, 102, 18);
		contentPane.add(Email_lb);
		
		Email_txt = new JTextField();
		Email_txt.setColumns(10);
		Email_txt.setBounds(236, 243, 266, 30);
		Email_txt.setToolTipText("A@gmail.com");
		contentPane.add(Email_txt);
		
		AccountNo_lb = new JLabel("Account no:");
		AccountNo_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		AccountNo_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		AccountNo_lb.setBounds(90, 337, 133, 14);
		contentPane.add(AccountNo_lb);
		
		AccountNo_txt = new JTextField();
		AccountNo_txt.setColumns(10);
		AccountNo_txt.setBounds(236, 321, 266, 30);
		AccountNo_txt.setToolTipText("AC-10011");
		contentPane.add(AccountNo_txt);
		
		RegistrationDate_lb = new JLabel("Registration Date:");
		RegistrationDate_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		RegistrationDate_lb.setBounds(563, 6, 133, 14);
		contentPane.add(RegistrationDate_lb);
		
		RegistrationDate_txt = new JTextField();
		RegistrationDate_txt.setEditable(false);
		RegistrationDate_txt.setColumns(10);
		RegistrationDate_txt.setBounds(565, 31, 163, 20);
		contentPane.add(RegistrationDate_txt);
		
		RegistrationType_lb = new JLabel("Paid Amount");
		RegistrationType_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		RegistrationType_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		RegistrationType_lb.setBounds(22, 439, 204, 30);
		contentPane.add(RegistrationType_lb);
		
		RegistrationType_box = new JComboBox<String>();
		RegistrationType_box.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		RegistrationType_box.setModel(new DefaultComboBoxModel<String>(new String[] {"Full - 40$", "Family - 75$", "Exercise - 25$", "Swim - 20$", "Casual - 10$"}));
		RegistrationType_box.setBounds(236, 386, 266, 33);
		contentPane.add(RegistrationType_box);
		
		PaymentAmount_lb = new JLabel("Reg: Type:");
		PaymentAmount_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		PaymentAmount_lb.setBounds(93, 394, 153, 30);
		contentPane.add(PaymentAmount_lb);
		
		PaidAmount_txt = new JTextField();
		PaidAmount_txt.setColumns(10);
		PaidAmount_txt.setBounds(236, 442, 266, 30);
		contentPane.add(PaidAmount_txt);
		
		Register_btn = new JButton("Register");
		Register_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Register_btn.setBounds(273, 508, 183, 42);
		contentPane.add(Register_btn);
		regexEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		ArrayList<NewMembership_RegistrationDataHolder> MemberShipDetails = StartingWindow.MembersData;
		
		
		// set Registration Date as current Date
		strDate = java.time.LocalDate.now();
		RegistrationDate_txt.setText(strDate.toString());
		
		// setting MemberShipID by default
		int size=MemberShipDetails.size()-1;
		int memberShipNumber= MemberShipDetails.get(size).getMemberShipId()+1;
		MemberShipID_txt.setText(String.valueOf(memberShipNumber));
		
		// selecting combo box value
		RegistrationType_box.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e) {
			      if(RegistrationType_box.getSelectedItem()=="Full - 40$")     
			      {
			    	  RegistrationType="Full";
			    	checkAmount=40;  
			      }   
			      else if(RegistrationType_box.getSelectedItem()=="Family - 75$") {
			    	  RegistrationType="Family";
			    	  checkAmount=75;
			      }
                 else if(RegistrationType_box.getSelectedItem()=="Exercise - 25$") {
                	 RegistrationType="Exercise";
                	 checkAmount=25;  
			      }
                 else if(RegistrationType_box.getSelectedItem()=="Swim - 20$") {
                	 RegistrationType="Swim";
                	 checkAmount=20;  
			      }
                 else if(RegistrationType_box.getSelectedItem()=="Casual - 10$") {
                	 RegistrationType="Casual";
                	 checkAmount=10; 
			      }
			   }
			});
		 
		
		
		
		Register_btn.addActionListener(new ActionListener(){

	         //defining a method actionPerformed
	        public void actionPerformed(ActionEvent ae){ 
	        	// check if number 
	        	try {
	        	  int val=Integer.parseInt(Number_txt.getText());
	        	  
	        	  // check if Account number or email or number not match
	        	  
	        	   for(int i=0;i<MemberShipDetails.size();i++)
	        		{
	        		   if(AccountNo_txt.getText()==MemberShipDetails.get(i).accountNumber||Email_txt.getText()==MemberShipDetails.get(i).email||val==MemberShipDetails.get(i).mobileNumber)
	        		{
	        			flag=true;
	        		}
	        		}
	        	   if(!flag)
	            	{if(Name_txt.getText()!=null&&PaidAmount_txt.getText()!=null&&Number_txt.getText()!=null&&AccountNo_txt.getText()!=null&&Email_txt.getText()!=null&&RegistrationType!=null) {
	            		PaidAmount=Integer.parseInt(PaidAmount_txt.getText());
	            		
	            		
	    	        	Pattern Emailpattern = Pattern.compile(regexEmail);
	    	        	Matcher Emailmatcher = Emailpattern.matcher(Email_txt.getText());
	    	        	
	    	        	
	            		if(PaidAmount<checkAmount||Emailmatcher.matches()==false)
	            		{	          
	            			JOptionPane.showMessageDialog(null, "Please Enter Data Correctly");

	            		}
	            		else {
	            			
	            		   MemberShipDetails.add(new NewMembership_RegistrationDataHolder(memberShipNumber,Name_txt.getText(),val,Email_txt.getText(),AccountNo_txt.getText(),RegistrationType,strDate.toString(),PaidAmount));			
                           System.out.println(memberShipNumber);
                           System.out.println(Name_txt.getText());
                           System.out.println(Integer.parseInt(Number_txt.getText()));
                           System.out.println(Email_txt.getText()); System.out.println(AccountNo_txt.getText());System.out.println(RegistrationType);System.out.println(strDate.toString());System.out.println(PaidAmount);
	            			
	            			dispose();
	            		}
	            		
	            		}
	            	else {
	            		JOptionPane.showMessageDialog(null, "Please Fill All Fields");
	            	}
	            	
	        	}
	        	   else {
	        		   JOptionPane.showMessageDialog(null, "Entered Values are matched with other member Details"); 
	        	   }
	        	}
	        catch(Exception ex) {
	        	JOptionPane.showMessageDialog(null, "please enter Your Number Correctly");
	        }
	        	
	        
	              }});
	
		
		
	}
}
