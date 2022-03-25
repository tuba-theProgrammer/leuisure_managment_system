package ProjectClass;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public  class UpdateMemberShipBio_Window  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*
	
	/**
	 * Create the application.
	 */
	int index;
	private JTextPane textAccountNumber;
	private JTextPane textMemberShipId;
	private JTextPane textMobile;
	private JTextPane textEmail;
	private JTextPane textName;
	ListOfMemberShips_Window parentWindow;
	Boolean flag=false;
	public UpdateMemberShipBio_Window(int index, ListOfMemberShips_Window parentWindow) {
		this.index=index;
		this.parentWindow=parentWindow;
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 562, 490);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Update The Profile");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(200, 30, 178, 51);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		textName = new JTextPane();
		textName.setBounds(176, 120, 202, 29);
		frame.getContentPane().add(textName);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(174, 99, 204, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(174, 162, 204, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		textEmail = new JTextPane();
		textEmail.setBounds(176, 183, 202, 29);
		frame.getContentPane().add(textEmail);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile Number");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(174, 223, 204, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		textMobile = new JTextPane();
		textMobile.setBounds(176, 244, 202, 29);
		frame.getContentPane().add(textMobile);
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ArrayList<NewMembership_RegistrationDataHolder> memberRegistrationDetails = StartingWindow.MembersData;
				
				
				try {
		        	  int val=Integer.parseInt(textMobile.getText());
		        	  
		        	  // check if Account number or email or number not match
		        	  
		        	   for(int i=0;i<memberRegistrationDetails.size();i++)
		        		{  if(i!=index) {
		        		   if(textAccountNumber.getText()==memberRegistrationDetails.get(i).accountNumber||textEmail.getText()==memberRegistrationDetails.get(i).email||val==memberRegistrationDetails.get(i).mobileNumber)
		        		{
		        			flag=true;
		        		}
		        		   else {
		        			   continue;
		        		   }
		        		}
		        		}
		        	   if(!flag) {
				memberRegistrationDetails.get(index).setName(textName.getText());
				memberRegistrationDetails.get(index).setEmail(textEmail.getText());
				memberRegistrationDetails.get(index).setMemberShipId(Integer.parseInt(textMemberShipId.getText()));
				memberRegistrationDetails.get(index).setMobileNumber(Integer.parseInt(textMobile.getText()));
				memberRegistrationDetails.get(index).setAccountNumber(textAccountNumber.getText());
				parentWindow.dispose();
				frame.dispose();
				
				new ListOfMemberShips_Window();
				
				System.out.println("Updated");
		        	   }
		        	   else {
		        		   JOptionPane.showMessageDialog(null, "Entered Values are matched with other member Details"); 
		        	   }
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "please enter Your Number Correctly");
				}
			}
		});
		btnUpdate.setBounds(219, 405, 105, 35);
		frame.getContentPane().add(btnUpdate);
		
		JLabel lblNewLabel_1_3 = new JLabel("Membership Id");
		lblNewLabel_1_3.setEnabled(false);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 11, 103, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textMemberShipId = new JTextPane();
		textMemberShipId.setEnabled(false);
		textMemberShipId.setBounds(12, 32, 101, 29);
		frame.getContentPane().add(textMemberShipId);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Account Number");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(174, 289, 204, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
	
		textAccountNumber = new JTextPane();
		textAccountNumber.setBounds(176, 310, 202, 29);
		frame.getContentPane().add(textAccountNumber);
		
		frame.setVisible(true);
		loadData();
		
	}
	
	private void loadData()
	{
		ArrayList<NewMembership_RegistrationDataHolder> memberRegistrationDetails = StartingWindow.MembersData;
		
		textMemberShipId.setText(memberRegistrationDetails.get(index).getMemberShipId()+"");
		textName.setText(memberRegistrationDetails.get(index).getName());
		textAccountNumber.setText(memberRegistrationDetails.get(index).getAccountNumber());
		textEmail.setText(memberRegistrationDetails.get(index).getEmail());
		textMobile.setText(memberRegistrationDetails.get(index).getMobileNumber()+"");
	
	}
}
