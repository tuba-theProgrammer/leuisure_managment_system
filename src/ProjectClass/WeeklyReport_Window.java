package ProjectClass;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WeeklyReport_Window extends JFrame {

	private JPanel contentPane;
	private JTextField Swim_money_txt;
	private JTextField SportHall_money_txt;
	private JTextField StudioMoney_Txt;
   static int swimMoney,SportMoney,studioMoney;
	
	/**
	 * Create the frame.
	 */
	public WeeklyReport_Window() {
		setTitle("Weekly Report");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weekly Report");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblNewLabel.setBounds(474, 11, 236, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Money Made From:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(24, 77, 257, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSwimming = new JLabel("Swimming");
		lblSwimming.setFont(new Font("Tw Cen MT", Font.BOLD, 33));
		lblSwimming.setBounds(10, 228, 217, 103);
		contentPane.add(lblSwimming);
		
		JLabel lblSportHall = new JLabel("Sport Hall");
		lblSportHall.setFont(new Font("Trebuchet MS", Font.BOLD, 33));
		lblSportHall.setBounds(456, 237, 177, 83);
		contentPane.add(lblSportHall);
		
		JLabel lblExerciseStudio = new JLabel("Exercise Studio");
		lblExerciseStudio.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblExerciseStudio.setBounds(803, 227, 274, 104);
		contentPane.add(lblExerciseStudio);
		
		Swim_money_txt = new JTextField();
		Swim_money_txt.setHorizontalAlignment(SwingConstants.CENTER);
		Swim_money_txt.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		Swim_money_txt.setEditable(false);
		Swim_money_txt.setBounds(269, 194, 110, 176);
		contentPane.add(Swim_money_txt);
		Swim_money_txt.setColumns(10);
		
		SportHall_money_txt = new JTextField();
		SportHall_money_txt.setHorizontalAlignment(SwingConstants.CENTER);
		SportHall_money_txt.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		SportHall_money_txt.setEditable(false);
		SportHall_money_txt.setColumns(10);
		SportHall_money_txt.setBounds(643, 194, 128, 176);
		contentPane.add(SportHall_money_txt);
		
		StudioMoney_Txt = new JTextField();
		StudioMoney_Txt.setHorizontalAlignment(SwingConstants.CENTER);
		StudioMoney_Txt.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		StudioMoney_Txt.setEditable(false);
		StudioMoney_Txt.setColumns(10);
		StudioMoney_Txt.setBounds(1058, 187, 116, 183);
		contentPane.add(StudioMoney_Txt);
		
		
		// Show All earned money in facility
		ArrayList<ParticipantInfoDataHolder_Facility> DataHolder1 = StartingWindow.facilityClassDataHolder.get(0).getParticipantDetails();
			
			for(ParticipantInfoDataHolder_Facility Value : DataHolder1)
		{
				swimMoney+=Value.getPaidAmount();
		}
	    
        ArrayList<ParticipantInfoDataHolder_Facility> DataHolder2 = StartingWindow.facilityClassDataHolder.get(1).getParticipantDetails();
			
			for(ParticipantInfoDataHolder_Facility Value : DataHolder2)
		{
				SportMoney+=Value.getPaidAmount();
		}
			
        ArrayList<ParticipantInfoDataHolder_Facility> DataHolder3 = StartingWindow.facilityClassDataHolder.get(2).getParticipantDetails();
			
			for(ParticipantInfoDataHolder_Facility Value : DataHolder1)
		{
				studioMoney+=Value.getPaidAmount();
		}
		
		Swim_money_txt.setText(String.valueOf(swimMoney));
		SportHall_money_txt.setText(String.valueOf(SportMoney));
		StudioMoney_Txt.setText(String.valueOf(studioMoney));
		
		
		
	}
}
