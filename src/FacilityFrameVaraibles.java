import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FacilityFrameVaraibles {

	protected   static Boolean isPaid=false,isSelectCategory=false,PaymentStatus;
	protected   Boolean checkfIdNotMatched=true;
	protected float getAmount;
	protected   static int MemberID;
	protected   static String registrationType,facilityType; 
	protected   static String FacilitySubCategory;
	protected   static float amountPaid,amountUnpaid;
	protected	int index;
		
	
	protected JFrame jf;
	protected JPanel contentPane;
	protected JTextField MemberShipID_txt;
	protected JTextField Name_txt;
	protected JTextField Number_txt;
	protected JTextField Email_txt;
	protected JTextField AccountNo_txt;
	protected JTextField RegistrationDate_txt;
	protected JLabel RegistrationDate_lb,label1,Name_lb,Number_lb,MemberId_lb,Email_lb,AccountNo_lb,RegistrationTypeCheck_lb;
	protected JButton Register_btn;
	protected JButton LoadData_btn; 
	protected JCheckBox Children_box;
	protected JCheckBox Children_box_1;
	protected JCheckBox SeniorCitizen_box;
	protected JCheckBox Unemployeed_box;
	protected JCheckBox Student_box;
	protected JCheckBox DisablePeople_box;
	protected JCheckBox ExtraOption_box;
	protected JPanel ExerciseStudioCategory_panel,SwimmingPool_panel;
	protected JCheckBox Sp1_Block_adult_box;
	protected JCheckBox Sp1_Block_concessionBox;
	protected JCheckBox Sp1_casual_adultBox;
	protected JCheckBox Adult_box;
	protected JLabel CategorySelector_lb;
	protected JComboBox<String> SelectSupportHall_category;
	protected JLabel lblNewLabel;
	protected JCheckBox Sp1_casual_ConcessionBox;
	protected JPanel sportCategory2_panel;
	protected JLabel RegistrationDate_lb_1;
	protected JCheckBox Sp2_adultBox;
	protected JCheckBox Sp2_JuniorBox_1;
	protected JPanel sportCategory3_panel;
	protected JLabel Sp_lb_2;
	protected JCheckBox Sp3_adultBox;
	protected JCheckBox Sp3_JuniorBox;
	protected JComboBox<String> Sp3_Hour;
	protected JLabel SelectHours_lb;
	protected JLabel SelectHours_lb_1;
	protected JComboBox<String> Sp2_Hour;
	protected JPanel sportCategory4_panel;
	protected JLabel SpoortCategory_lb_3;
	protected JCheckBox Sp4_adultBox;
	protected JCheckBox Sp4_JuniorBox;
	protected JLabel SelectHours_lb_2;
	protected JComboBox<String> Sp4_Hour;
	protected JLabel PaymentStatus_lb_1;
	protected JLabel PaymentStatus_lb_2;
	protected JRadioButton Paid_rd_2;
	protected JRadioButton PendingPayment_rd_2;
	protected JLabel PaymentStatus_lb_3;
	protected JRadioButton PendingPayment_rd_3;
	protected JRadioButton Paid_rd_3;
	protected JLabel PaymentStatus_lb_4;
	protected JRadioButton Paid_rd_4;
	protected JRadioButton PendingPayment_rd_4;
	protected JLabel PaymentStatus_lb_5;
	protected JRadioButton Paid_rd_5;
	protected JRadioButton PendingPayment_rd_5;
	protected JLabel swim__hour_lb;
	protected JComboBox<String> SelectTime_swim;
    protected JPanel Swim_HourPanel;
    protected JLabel RegistrationType_lb;

   
}
