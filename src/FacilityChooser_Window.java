import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class FacilityChooser_Window extends JFrame {

	private JPanel contentPane;
    private JButton Facility3_btn,Facility1_btn,Facility2_btn;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	public FacilityChooser_Window() {
		setVisible(true);
		setTitle("Select Facility");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facilities");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblNewLabel.setBounds(516, 11, 151, 51);
		contentPane.add(lblNewLabel);
		
		Facility1_btn = new JButton("Swimming Pool");
		Facility1_btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Facility1_btn.setBounds(435, 101, 313, 64);
		contentPane.add(Facility1_btn);
		
		Facility2_btn = new JButton("Support Hall");
		Facility2_btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Facility2_btn.setBounds(435, 222, 313, 64);
		contentPane.add(Facility2_btn);
		
		Facility3_btn = new JButton("Exercise Studio");
		Facility3_btn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Facility3_btn.setBounds(435, 343, 313, 64);
		contentPane.add(Facility3_btn);
		
		/**
		 * first facility  button 
		 */
		
		
		Facility1_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new SwimingFacility_Window(0);
			}
		});
		/**
		 * second facility  button 
		 */
			Facility2_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new SwimingFacility_Window(1);
			}
		});
		
			/**
			 * third facility  button 
			 */
			
		Facility3_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwimingFacility_Window(2);
				
			}
		});
		
	}
}
