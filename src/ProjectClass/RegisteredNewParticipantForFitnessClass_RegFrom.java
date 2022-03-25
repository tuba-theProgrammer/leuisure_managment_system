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
import javax.swing.SwingConstants;

public class RegisteredNewParticipantForFitnessClass_RegFrom {

	private JFrame jf;
	private JPanel contentPane;
	private JTextField MemberShipID_txt;
	private JTextField Name_txt;
	private JTextField Number_txt;
	private JTextField Email_txt;
	private JTextField AccountNo_txt;
	private JTextField RegistrationDate_txt;
	private JLabel RegistrationDate_lb, label1, Name_lb, Number_lb, MemberId_lb, Email_lb, AccountNo_lb,
			PaymentStatus_lb;
	private JButton Register_btn;
	private JRadioButton PendingPayment_rd, Paid_rd;
	int index;
	static float PerClassPayment, setAmount, pendingAmount;
	private JButton LoadData_btn;
	static int MemberID;
	static Boolean PaymentStatus, checkfIdNotMatched = true;
	private JPanel panel;

	/**
	 * Create the application.
	 */

	public RegisteredNewParticipantForFitnessClass_RegFrom(int index) {
		this.index = index;
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf = new JFrame();
		jf.setVisible(true);
		jf.setTitle("Registration Form ");
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setBounds(300, 50, 754, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jf.setContentPane(contentPane);
		contentPane.setLayout(null);

		label1 = new JLabel("Registration of Participant");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		label1.setBounds(258, 23, 270, 35);
		contentPane.add(label1);

		Name_lb = new JLabel("Name :");
		Name_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Name_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		Name_lb.setBounds(100, 133, 183, 14);
		contentPane.add(Name_lb);

		Number_lb = new JLabel("Number:");
		Number_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Number_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		Number_lb.setBounds(100, 189, 183, 14);
		contentPane.add(Number_lb);

		MemberId_lb = new JLabel("Member ID:");
		MemberId_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		MemberId_lb.setBounds(590, 189, 113, 14);
		contentPane.add(MemberId_lb);

		MemberShipID_txt = new JTextField();
		MemberShipID_txt.setBounds(602, 221, 89, 20);
		contentPane.add(MemberShipID_txt);
		MemberShipID_txt.setColumns(10);

		Name_txt = new JTextField();
		Name_txt.setEditable(false);
		Name_txt.setBounds(312, 133, 236, 20);
		contentPane.add(Name_txt);
		Name_txt.setColumns(10);

		Number_txt = new JTextField();
		Number_txt.setEditable(false);
		Number_txt.setColumns(10);
		Number_txt.setBounds(312, 189, 236, 20);
		contentPane.add(Number_txt);

		Email_lb = new JLabel("Email:");
		Email_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		Email_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		Email_lb.setBounds(100, 261, 183, 14);
		contentPane.add(Email_lb);

		Email_txt = new JTextField();
		Email_txt.setEditable(false);
		Email_txt.setColumns(10);
		Email_txt.setBounds(312, 261, 236, 20);
		contentPane.add(Email_txt);

		AccountNo_lb = new JLabel("Account no:");
		AccountNo_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		AccountNo_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		AccountNo_lb.setBounds(100, 351, 183, 14);
		contentPane.add(AccountNo_lb);

		AccountNo_txt = new JTextField();
		AccountNo_txt.setEditable(false);
		AccountNo_txt.setColumns(10);
		AccountNo_txt.setBounds(312, 351, 236, 20);
		contentPane.add(AccountNo_txt);

		RegistrationDate_lb = new JLabel("Registration Date:");
		RegistrationDate_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		RegistrationDate_lb.setBounds(565, 33, 183, 18);
		contentPane.add(RegistrationDate_lb);

		RegistrationDate_txt = new JTextField();
		RegistrationDate_txt.setEditable(false);
		RegistrationDate_txt.setColumns(10);
		RegistrationDate_txt.setBounds(565, 62, 163, 20);
		contentPane.add(RegistrationDate_txt);

		Register_btn = new JButton("Register");
		Register_btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Register_btn.setBounds(277, 508, 183, 42);
		contentPane.add(Register_btn);

		LoadData_btn = new JButton("Load Data");
		LoadData_btn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LoadData_btn.setBounds(602, 302, 89, 23);
		contentPane.add(LoadData_btn);

		PaymentStatus_lb = new JLabel("Payment Status:");
		PaymentStatus_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		PaymentStatus_lb.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		PaymentStatus_lb.setBounds(100, 442, 183, 14);
		contentPane.add(PaymentStatus_lb);

		Paid_rd = new JRadioButton("Paid");
		Paid_rd.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		Paid_rd.setBounds(312, 439, 89, 23);
		contentPane.add(Paid_rd);

		PendingPayment_rd = new JRadioButton("Pending Payment");
		PendingPayment_rd.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		PendingPayment_rd.setBounds(403, 439, 143, 23);
		contentPane.add(PendingPayment_rd);

//******************************************************************** implemented code starts from here*****************************************		

		// setting amount account to classes
		if (index == 0) {
			PerClassPayment += 2;
		} else if (index == 1) {
			PerClassPayment += 3;
		} else if (index == 2) {
			PerClassPayment += 1;
		} else if (index == 3) {
			PerClassPayment += 4;
		} else if (index == 4) {
			PerClassPayment += 6;
		}

		// Radio button for Paid and Unpaid check
		PendingPayment_rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (PendingPayment_rd.isSelected()) {
					Paid_rd.setSelected(false);
					PaymentStatus = false;
					pendingAmount = PerClassPayment;
					PerClassPayment = 0;
				}
			}
		});

		Paid_rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Paid_rd.isSelected()) {
					pendingAmount = 0;
					PendingPayment_rd.setSelected(false);
					PaymentStatus = true;

				}

			}
		});

		// setting amount of classes Registration

		// Array to register in selected class
		ArrayList<NewMembership_RegistrationDataHolder> MemberDetails = StartingWindow.MembersData; // get Member ship
																									// id to access
																									// menmberData
		ArrayList<FitnessClass_InfoDataHolder> fitnessClassDataHolder = StartingWindow.fitnessClassDataHolder; //// use
																												//// to
																												//// register
																												//// participants
																												//// in
																												//// selected
																												//// class

		Register_btn.setEnabled(false);// initial Making Registration button False check if value are correct then make
										// it enable

		panel = new JPanel();
		panel.setBounds(628, 480, 454, 70);
		contentPane.add(panel);

		LoadData_btn.addActionListener(new ActionListener() {

			// defining a method actionPerformed
			public void actionPerformed(ActionEvent ae) {
				MemberID = Integer.parseInt(MemberShipID_txt.getText());

				Boolean flag = true;

				for (FitnessParticipent_RegistrationInfoDataHolder details : fitnessClassDataHolder.get(index)
						.getParticipantDetails()) {
					if (details.getMemberShipId() == MemberID) {
						flag = false;
						break;
					}
				}

				if (flag) {

					for (NewMembership_RegistrationDataHolder details : MemberDetails) {

						if (details.getMemberShipId() == MemberID) {

							Name_txt.setText(details.getName());
							Number_txt.setText(String.valueOf(details.getMobileNumber()));
							Email_txt.setText(details.getEmail());
							AccountNo_txt.setText(details.getAccountNumber());
							RegistrationDate_txt.setText(details.getRegistrationDate());
							setAmount = details.getPaidAmount();
							Register_btn.setEnabled(true);

							checkfIdNotMatched = false;
						}

					}
					if (checkfIdNotMatched) {
						JOptionPane.showMessageDialog(null, "Id not Matched");

					}
				} else {
					JOptionPane.showMessageDialog(null, "This id is already registered in this class");
				}

			}
		});

		Register_btn.addActionListener(new ActionListener() {

			// defining a method actionPerformed
			public void actionPerformed(ActionEvent ae) {

				if (Paid_rd.isSelected() || PendingPayment_rd.isSelected()) {
					System.out.println(MemberID);
					System.out.println(Name_txt.getText());
					System.out.println(Integer.parseInt(Number_txt.getText()));
					System.out.println(Email_txt.getText());
					System.out.println(AccountNo_txt.getText());
					System.out.println(RegistrationDate_txt.getText());
					System.out.println(PaymentStatus);
					System.out.println(PerClassPayment);
					System.out.println(pendingAmount);
					StartingWindow.fitnessClassDataHolder.get(index).numberOfPeople += 1;
					fitnessClassDataHolder.get(index).getParticipantDetails()
							.add(new FitnessParticipent_RegistrationInfoDataHolder(MemberID, Name_txt.getText(),
									Integer.parseInt(Number_txt.getText()), Email_txt.getText(),
									AccountNo_txt.getText(), RegistrationDate_txt.getText(), PaymentStatus,
									setAmount + PerClassPayment, pendingAmount));
					jf.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Please Select Payment Option!");

				}

			}
		});

	}
}
