import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Facilityutities extends FacilityFrameVaraibles{

	/**
	 * method to choice for registration type
	 *
	 */
void ChoiceOfRegistrationType() {
		
	
		if(registrationType.equals("Full"))
		{
			if(facilityType.equals("Swimming pool")) {
				CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
				RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
				isSelectCategory=true;
				isPaid=true;
				PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;
			
			}
			else if(facilityType.equals("Sport Hall"))
			{
				RegistrationTypeCheck_lb.setText("Select in which category you lie!");
				CategorySelector_lb.setVisible(true);
				SelectSupportHall_category.setVisible(true);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
				
				
			}else if(facilityType.equals("Exercise Studio")) {
				CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
				RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
				isSelectCategory=true;
				isPaid=true;
				PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;
			}
			
		}
		else if(registrationType.equals("Family")) {
          if(facilityType.equals("Swimming pool")) {
        	  CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
        	  RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
        	  isPaid=true;
				isSelectCategory=true;
        	  PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;
			}
			else if(facilityType.equals("Sport Hall"))
			{
				CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
				RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
				isPaid=true;
				isSelectCategory=true;
				PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;
				
			}else if(facilityType.equals("Exercise Studio")) {
				CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
				RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
				isPaid=true;
				isSelectCategory=true;
				PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;
			}
			
		}
       else if(registrationType.equals("Exercise")) {
    	   if(facilityType.equals("Swimming pool")) {
    		    CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(false);
    		   
    		   RegistrationTypeCheck_lb.setText("Select in which category you lie!");
    		   SwimmingPool_panel.setVisible(true);
    		   SwimmingPool_panel.setBounds(22, 349, 526, 127);
			}
			else if(facilityType.equals("Sport Hall"))
			{ 
			SwimmingPool_panel.setVisible(false);
			CategorySelector_lb.setVisible(false);
			SelectSupportHall_category.setVisible(false);
			ExerciseStudioCategory_panel.setVisible(false);
				RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
				isSelectCategory=true;
				isPaid=true;
				PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;

			}else if(facilityType.equals("Exercise Studio")) {
				RegistrationTypeCheck_lb.setText("Select in which category you lie!");
				ExerciseStudio_Category();
				ExerciseStudioCategory_panel.setVisible(true);	
			}
			
		}
       else if(registrationType.equals("Swim")) {
    	   if(facilityType.equals("Swimming pool")) {
    		SwimmingPool_panel.setVisible(false);
   			CategorySelector_lb.setVisible(false);
   			SelectSupportHall_category.setVisible(false);
   			ExerciseStudioCategory_panel.setVisible(false);
    		   RegistrationTypeCheck_lb.setText("According to Your MemberShip Type you dont Need to Pay for this Facility!");
    		   isSelectCategory=true;
				isPaid=true;
				PaymentStatus=true;
				amountPaid=0;
				amountUnpaid=0;
			}
			else if(facilityType.equals("Sport Hall"))
			{
				RegistrationTypeCheck_lb.setText("Select in which category you lie!");	
				ExerciseStudioCategory_panel.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				CategorySelector_lb.setVisible(true);
				SelectSupportHall_category.setVisible(true);
				
				
			}else if(facilityType.equals("Exercise Studio")) {
				SwimmingPool_panel.setVisible(false);
	   			CategorySelector_lb.setVisible(false);
	   			SelectSupportHall_category.setVisible(false);
				RegistrationTypeCheck_lb.setText("Select in which category you lie!");
				ExerciseStudio_Category();
				ExerciseStudioCategory_panel.setVisible(true);	
			}	
			
		}
       else if(registrationType.equals("Casual")) {
			
    	   if(facilityType.equals("Swimming pool")) {
    		   ExerciseStudioCategory_panel.setVisible(false);	
      			CategorySelector_lb.setVisible(false);
      			SelectSupportHall_category.setVisible(false);
    		   RegistrationTypeCheck_lb.setText("Select in which category you lie!");
    		   SwimmingPool_panel.setVisible(true);
    		   
    		   SwimmingPool_panel.setBounds(22, 349, 526, 127);
			}
			else if(facilityType.equals("Sport Hall"))
			{
				RegistrationTypeCheck_lb.setText("Select in which category you lie!");	
				CategorySelector_lb.setVisible(true);
				SelectSupportHall_category.setVisible(true);
				ExerciseStudioCategory_panel.setVisible(false);		
				SwimmingPool_panel.setVisible(false);
				
			}else if(facilityType.equals("Exercise Studio")) {
				RegistrationTypeCheck_lb.setText("Select in which category you lie!");	
				ExerciseStudio_Category();
				CategorySelector_lb.setVisible(false);
				SelectSupportHall_category.setVisible(false);
				SwimmingPool_panel.setVisible(false);
				ExerciseStudioCategory_panel.setVisible(true);	
				
			}	
		}
	}

/**
 * method for swimming pool panel
 *
 */
	void SwimmingPanel() {
		
		amountPaid=0;
		SwimmingPool_panel = new JPanel();
		SwimmingPool_panel.setBounds(122, 419, 542, 127);
		contentPane.add(SwimmingPool_panel);
		SwimmingPool_panel.setLayout(null);
		
		Adult_box = new JCheckBox("Adult");
		Adult_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Adult_box.setBounds(21, 7, 97, 23);
		SwimmingPool_panel.add(Adult_box);
		
		Children_box = new JCheckBox("Children");
		Children_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Children_box.setBounds(21, 36, 148, 23);
		SwimmingPool_panel.add(Children_box);
		
		Children_box_1 = new JCheckBox("Children below 4");
		Children_box_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Children_box_1.setBounds(21, 62, 148, 23);
		SwimmingPool_panel.add(Children_box_1);
		
		SeniorCitizen_box = new JCheckBox("Senior Citizen");
		SeniorCitizen_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		SeniorCitizen_box.setBounds(202, 7, 148, 23);
		SwimmingPool_panel.add(SeniorCitizen_box);
		
		Unemployeed_box = new JCheckBox("Unemployeed");
		Unemployeed_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Unemployeed_box.setBounds(202, 36, 148, 23);
		SwimmingPool_panel.add(Unemployeed_box);
		
		Student_box = new JCheckBox("Student");
		Student_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Student_box.setBounds(372, 7, 148, 23);
		SwimmingPool_panel.add(Student_box);
		
		DisablePeople_box = new JCheckBox("Disabled People");
		DisablePeople_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		DisablePeople_box.setBounds(372, 36, 148, 23);
		SwimmingPool_panel.add(DisablePeople_box);
		
		ExtraOption_box = new JCheckBox("Private Hire for Pool Parties - per hour each");
		ExtraOption_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ExtraOption_box.setBounds(21, 88, 191, 23);
		SwimmingPool_panel.add(ExtraOption_box);
		
		PaymentStatus_lb_1 = new JLabel("Payment Status:");
		PaymentStatus_lb_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		PaymentStatus_lb_1.setBounds(372, 77, 133, 14);
		SwimmingPool_panel.add(PaymentStatus_lb_1);
		
		JRadioButton Paid_rd_1 = new JRadioButton("Paid");
		Paid_rd_1.setBounds(336, 97, 97, 23);
		SwimmingPool_panel.add(Paid_rd_1);
		
		JRadioButton PendingPayment_rd_1 = new JRadioButton("Pending Payment");
		PendingPayment_rd_1.setBounds(435, 97, 183, 23);
		SwimmingPool_panel.add(PendingPayment_rd_1);
		
		SwimmingPool_panel.setVisible(false);
	    
		Adult_box.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e) {
			              if(Adult_box.isSelected()) {

			 FacilitySubCategory ="Swimming";
			 amountPaid+=2;
			 
			 ExtraOption_box.setSelected(false);
			 DisablePeople_box.setSelected(false);
			 Student_box.setSelected(false);
			 Unemployeed_box.setSelected(false);
			 SeniorCitizen_box.setSelected(false);
			 Children_box_1.setSelected(false);
			 Children_box.setSelected(false);
			 isSelectCategory=true;
	
			}            
				   }
			}); 	
			             
			              ExtraOption_box.addActionListener(new ActionListener(){
			   			   public void actionPerformed(ActionEvent e) {
			   			              if(ExtraOption_box.isSelected()) {

			   			 FacilitySubCategory ="Swimming";
			   			 amountPaid+=26.5;
			   			 Adult_box.setSelected(false);
			   			 DisablePeople_box.setSelected(false);
			   			 Student_box.setSelected(false);
			   			 Unemployeed_box.setSelected(false);
			   			 SeniorCitizen_box.setSelected(false);
			   			 Children_box_1.setSelected(false);
			   			 Children_box.setSelected(false);
			   			swimmingCategoryHourSet();
			   			Swim_HourPanel.setVisible(true);
			   			isSelectCategory=true;
			   		// SelectTime_swim.setEnabled(true);
			   			}	              
			             
			   }
			});
			              
			              DisablePeople_box.addActionListener(new ActionListener(){
			 			   public void actionPerformed(ActionEvent e) {
			 			              if(DisablePeople_box.isSelected()) {

			 			 FacilitySubCategory ="Swimming";
			 			 amountPaid+=1.25;
			 			 ExtraOption_box.setSelected(false);
			 			 Adult_box.setSelected(false);
			 			 Student_box.setSelected(false);
			 			 Unemployeed_box.setSelected(false);
			 			 SeniorCitizen_box.setSelected(false);
			 			 Children_box_1.setSelected(false);
			 			 Children_box.setSelected(false);
			 			isSelectCategory=true;
			 		
			 			}
			 			             
						   }
						});
			 			              
			 			             Student_box.addActionListener(new ActionListener(){
			 				 			   public void actionPerformed(ActionEvent e) {
			 				 			              if(Student_box.isSelected()) {

			 				 			 FacilitySubCategory ="Swimming";
			 				 			 amountPaid+=1.25;
			 				 			 ExtraOption_box.setSelected(false);
			 				 			 Adult_box.setSelected(false);
			 				 			DisablePeople_box.setSelected(false);
			 				 			 Unemployeed_box.setSelected(false);
			 				 			 SeniorCitizen_box.setSelected(false);
			 				 			 Children_box_1.setSelected(false);
			 				 			 Children_box.setSelected(false);
			 				 			isSelectCategory=true;
			 				 		
			 				 			}	            
			 							   }
			 						}); 				              
			 				 			           
			 				 			              
			 				 			            Unemployeed_box.addActionListener(new ActionListener(){
			 				 						   public void actionPerformed(ActionEvent e) {
			 				 						              if(Unemployeed_box.isSelected()) {

			 				 						 FacilitySubCategory ="Swimming";
			 				 						 amountPaid+=1.25;
			 				 						 ExtraOption_box.setSelected(false);
			 				 						 DisablePeople_box.setSelected(false);
			 				 						 Student_box.setSelected(false);
			 				 						 Adult_box.setSelected(false);
			 				 						 SeniorCitizen_box.setSelected(false);
			 				 						 Children_box_1.setSelected(false);
			 				 						 Children_box.setSelected(false);
			 				 						isSelectCategory=true;
			 				 						}            
			 				 						   }
			 				 						});
			 				 						              
			 				 						            SeniorCitizen_box.addActionListener(new ActionListener(){
			 			 				 						   public void actionPerformed(ActionEvent e) {
			 			 				 						              if(SeniorCitizen_box.isSelected()) {

			 			 				 						 FacilitySubCategory ="Swimming";
			 			 				 						 amountPaid+=1.25;
			 			 				 						 ExtraOption_box.setSelected(false);
			 			 				 						 DisablePeople_box.setSelected(false);
			 			 				 						 Student_box.setSelected(false);
			 			 				 						 Adult_box.setSelected(false);
			 			 				 						Unemployeed_box.setSelected(false);
			 			 				 						 Children_box_1.setSelected(false);
			 			 				 						 Children_box.setSelected(false);
			 			 				 						isSelectCategory=true;
			 			 				 						}             
			 			 				 						   }
			 				 									});				 						 	              
			 			 				 						           
			 			 				 						           Children_box_1.addActionListener(new ActionListener(){
			 				 			 				 						   public void actionPerformed(ActionEvent e) {
			 				 			 				 						              if(Children_box_1.isSelected()) {

			 				 			 				 						 FacilitySubCategory ="Swimming";
			 				 			 				 						 amountPaid+=0;
			 				 			 				 						 ExtraOption_box.setSelected(false);
			 				 			 				 						 DisablePeople_box.setSelected(false);
			 				 			 				 						 Student_box.setSelected(false);
			 				 			 				 						 Adult_box.setSelected(false);
			 				 			 				 						Unemployeed_box.setSelected(false);
			 				 			 				 					SeniorCitizen_box.setSelected(false);
			 				 			 				 						 Children_box.setSelected(false);
			 				 			 				 						isSelectCategory=true;
			 				 			 				 						}
			 				 			 				 						            
			 				 			 				 					   }
			 				 			 				 					});            
			 				 			 				 						          Children_box.addActionListener(new ActionListener(){
						 				 			 				 						   public void actionPerformed(ActionEvent e) {
						 				 			 				 						              if(Children_box.isSelected()) {

						 				 			 				 						 FacilitySubCategory ="Swimming";
						 				 			 				 						 amountPaid+=1.25;
						 				 			 				 						 ExtraOption_box.setSelected(false);
						 				 			 				 						 DisablePeople_box.setSelected(false);
						 				 			 				 						 Student_box.setSelected(false);
						 				 			 				 						 Adult_box.setSelected(false);
						 				 			 				 						Unemployeed_box.setSelected(false);
						 				 			 				 					SeniorCitizen_box.setSelected(false);
						 				 			 				 						 Children_box_1.setSelected(false);
						 				 			 				 						isSelectCategory=true;
						 				 			 				 						}            
						 				 			 				 					   }
			 				 			 				 								});
			 				 			 				 						      PendingPayment_rd_1.addActionListener(new ActionListener(){
			 				 			 				 							   public void actionPerformed(ActionEvent e) {
			 				 			 				 								   
			 				 			 				 								   if(PendingPayment_rd_1.isSelected())
			 				 			 				 								   {
			 				 			 				 									   Paid_rd_1.setSelected(false);  
			 				 			 				 									isPaid=true;
			 				 			 				 								amountUnpaid=amountPaid;
			 				 			 				 								amountPaid=0; 
			 				 			 				 							PaymentStatus=false;
			 				 			 				 								   }
			 				 			 				 							   }
			 				 			 				 							});
			 				 			 				 						
			 				 			 				 						Paid_rd_1.addActionListener(new ActionListener(){
			 				 			 				 							   public void actionPerformed(ActionEvent e) {
			 				 			 				 								   if(Paid_rd_1.isSelected())
			 				 			 				 								   {
			 				 			 				 									   PendingPayment_rd_1.setSelected(false);
			 				 			 				 									amountUnpaid=0;
			 				 			 				 									isPaid=true;
			 				 			 				 								PaymentStatus=true;
			 				 			 				 								   } 
			 				 			 				 								   
			 				 			 				 							   }
			 				 			 				 							});
			 				 			 				 								 				 			 				 						              
			 				 			 				 						              
		
	}
	
	/**
	 * method for select any 3 categories from sport hall choice 
	 *
	 */
		void SelectSportHallCategory() {
			
			// select Category For Panels
			
					SelectSupportHall_category = new JComboBox<String>();
					SelectSupportHall_category.setModel(new DefaultComboBoxModel<String>(new String[] {"Sports Hall - Badminton per court, per hour", "Sports Hall - Tennis per court, per hour", "Sports Hall - Table Tennis per table, per hour"}));
					SelectSupportHall_category.setBounds(255, 309, 241, 22);
					contentPane.add(SelectSupportHall_category);
					SelectSupportHall_category.setVisible(false);
					
					CategorySelector_lb = new JLabel("Select Category for Support Hall:");
					CategorySelector_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
					CategorySelector_lb.setBounds(22, 313, 223, 14);
					contentPane.add(CategorySelector_lb);
					
					
					
					// selecting combo box value
					SelectSupportHall_category.addActionListener(new ActionListener(){
								   public void actionPerformed(ActionEvent e) {
								      if(SelectSupportHall_category.getSelectedItem()=="Sports Hall - Badminton per court, per hour") {
								    	  SportHall_Category1();
								    	  sportCategory2_panel.setVisible(true);
								    	  
						                	 sportCategory3_panel.setVisible(false);
						                	 sportCategory4_panel.setVisible(false);
						                	
						                	 
								      }
					                 else if(SelectSupportHall_category.getSelectedItem()=="Sports Hall - Tennis per court, per hour") {
					                	 SportHall_Category2();
					                	 sportCategory3_panel.setVisible(true);
					                	
					                	 sportCategory2_panel.setVisible(false);
					                	 sportCategory4_panel.setVisible(false);
					                	 
								      }
					                 else if(SelectSupportHall_category.getSelectedItem()=="Sports Hall - Table Tennis per table, per hour") {
					                	 SportHall_Category3();
					                	 sportCategory4_panel.setVisible(true);
					                	
					                	 sportCategory2_panel.setVisible(false);
					                	 sportCategory3_panel.setVisible(false);
								      }
					                
								   }
								});

					
					CategorySelector_lb.setVisible(false);
					SelectSupportHall_category.setVisible(false);
					
			
		}
		
	//******************************** Method for Exercise Studio Panel ****************************************************	
		/**
		 * method for exercise studio category
		 *
		 */
		
		void ExerciseStudio_Category() {

			amountPaid=0;
		
			ExerciseStudioCategory_panel = new JPanel();
			ExerciseStudioCategory_panel.setBounds(22, 338, 526, 145);
			ExerciseStudioCategory_panel.setLayout(null);
			contentPane.add(ExerciseStudioCategory_panel);
			
			Sp1_Block_adult_box = new JCheckBox("Block booking (Adults) ");
			Sp1_Block_adult_box.setFont(new Font("Times New Roman", Font.BOLD, 12));
			Sp1_Block_adult_box.setBounds(21, 37, 148, 23);
			ExerciseStudioCategory_panel.add(Sp1_Block_adult_box);
			
			Sp1_Block_concessionBox = new JCheckBox("Block booking (Concessions) ");
			Sp1_Block_concessionBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
			Sp1_Block_concessionBox.setBounds(21, 63, 191, 23);
			ExerciseStudioCategory_panel.add(Sp1_Block_concessionBox);
			
			Sp1_casual_adultBox = new JCheckBox("Casual booking (Adults) ");
			Sp1_casual_adultBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
			Sp1_casual_adultBox.setBounds(251, 37, 179, 23);
			ExerciseStudioCategory_panel.add(Sp1_casual_adultBox);
			
			lblNewLabel = new JLabel("Sport Hall -Half Hall");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
			lblNewLabel.setBounds(173, 11, 191, 14);
			ExerciseStudioCategory_panel.add(lblNewLabel);
			
			Sp1_casual_ConcessionBox = new JCheckBox("Casual booking (Concession) ");
			Sp1_casual_ConcessionBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
			Sp1_casual_ConcessionBox.setBounds(251, 63, 198, 23);
			ExerciseStudioCategory_panel.add(Sp1_casual_ConcessionBox);
			
			PaymentStatus_lb_2 = new JLabel("Payment Status:");
			PaymentStatus_lb_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
			PaymentStatus_lb_2.setBounds(202, 105, 133, 14);
			ExerciseStudioCategory_panel.add(PaymentStatus_lb_2);
			
			Paid_rd_2 = new JRadioButton("Paid");
			Paid_rd_2.setBounds(154, 122, 97, 23);
			ExerciseStudioCategory_panel.add(Paid_rd_2);
			
			PendingPayment_rd_2 = new JRadioButton("Pending Payment");
			PendingPayment_rd_2.setBounds(279, 122, 183, 23);
			ExerciseStudioCategory_panel.add(PendingPayment_rd_2);
			
					
			
				ExerciseStudioCategory_panel.setVisible(false);	
							Sp1_casual_ConcessionBox.addActionListener(new ActionListener(){
						   public void actionPerformed(ActionEvent e) {
						              if(Sp1_casual_ConcessionBox.isSelected()) {

						 FacilitySubCategory ="Casual booking";
						 amountPaid+=12.25;
						 Sp1_casual_adultBox.setSelected(false);
						 Sp1_Block_concessionBox.setSelected(false);
						 Sp1_Block_adult_box.setSelected(false);
						 isSelectCategory=true;
						
						}            
					   }
					});		
				Sp1_casual_adultBox.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
					              if(Sp1_casual_adultBox.isSelected()) {

					 FacilitySubCategory ="Casual booking";
					 amountPaid+=21;
					 Sp1_casual_ConcessionBox.setSelected(false);
					 Sp1_Block_concessionBox.setSelected(false);
					 Sp1_Block_adult_box.setSelected(false);
					 isSelectCategory=true;
					}            
				   }
				});		
				Sp1_Block_concessionBox.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
					              if(Sp1_Block_concessionBox.isSelected()) {

					 FacilitySubCategory ="Block booking";
					 amountPaid+=10.5;
					 Sp1_casual_ConcessionBox.setSelected(false);
					 Sp1_casual_adultBox.setSelected(false);
					 Sp1_Block_adult_box.setSelected(false);
					 isSelectCategory=true;
					}            
				   }
				});	
				Sp1_Block_adult_box.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
					              if(Sp1_Block_adult_box.isSelected()) {

					 FacilitySubCategory ="Block booking";
					 amountPaid+=18.4;
					 Sp1_casual_ConcessionBox.setSelected(false);
					 Sp1_Block_concessionBox.setSelected(false);
					 Sp1_casual_adultBox.setSelected(false);
					 isSelectCategory=true;
					}            
				   }
				});	
				
				 PendingPayment_rd_2.addActionListener(new ActionListener(){
						   public void actionPerformed(ActionEvent e) {
							   
							   if(PendingPayment_rd_2.isSelected())
							   {
								   Paid_rd_2.setSelected(false);  
								isPaid=true;
								amountUnpaid=amountPaid;
							amountPaid=0; 
							PaymentStatus=false;
							   }
						   }
						});
					
					Paid_rd_2.addActionListener(new ActionListener(){
						   public void actionPerformed(ActionEvent e) {
							   if(Paid_rd_2.isSelected())
							   {
								   PendingPayment_rd_2.setSelected(false);
								   amountPaid=0;
								isPaid=true;
								PaymentStatus=true;
							   } 
							   
						   }
						});
				
				
		}
		
		/**
		 *method for sport hall category 1
		 *
		 */
		
		void SportHall_Category1() {
		
			  amountPaid=0;
			  sportCategory2_panel = new JPanel();
				sportCategory2_panel.setBounds(22, 342, 531, 143);
				contentPane.add(sportCategory2_panel);
				sportCategory2_panel.setLayout(null);
				
				RegistrationDate_lb_1 = new JLabel("Sports Hall - Badminton per court, per hour:");
				RegistrationDate_lb_1.setBounds(55, 11, 344, 17);
				RegistrationDate_lb_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				sportCategory2_panel.add(RegistrationDate_lb_1);
				
				Sp2_adultBox = new JCheckBox("Adults");
				Sp2_adultBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
				Sp2_adultBox.setBounds(28, 41, 148, 23);
				sportCategory2_panel.add(Sp2_adultBox);
				
				Sp2_JuniorBox_1 = new JCheckBox("Junior");
				Sp2_JuniorBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
				Sp2_JuniorBox_1.setBounds(28, 67, 148, 23);
				sportCategory2_panel.add(Sp2_JuniorBox_1);
				
				SelectHours_lb_1 = new JLabel("Select Hours:");
				SelectHours_lb_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				SelectHours_lb_1.setBounds(319, 45, 102, 14);
				sportCategory2_panel.add(SelectHours_lb_1);
				
				Sp2_Hour = new JComboBox<String>();
				Sp2_Hour.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5"}));
				Sp2_Hour.setBounds(419, 41, 53, 22);
				sportCategory2_panel.add(Sp2_Hour);
				//Sp2_Hour.setEnabled(false);
				PaymentStatus_lb_3 = new JLabel("Payment Status:");
				PaymentStatus_lb_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
				PaymentStatus_lb_3.setBounds(247, 84, 133, 14);
				sportCategory2_panel.add(PaymentStatus_lb_3);
				
				PendingPayment_rd_3 = new JRadioButton("Pending Payment");
				PendingPayment_rd_3.setBounds(319, 105, 183, 23);
				sportCategory2_panel.add(PendingPayment_rd_3);
				
				Paid_rd_3 = new JRadioButton("Paid");
				Paid_rd_3.setBounds(196, 105, 109, 23);
				sportCategory2_panel.add(Paid_rd_3);
				sportCategory2_panel.setVisible(false);
				
				
				Sp2_Hour.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
						   if(Sp2_Hour.getSelectedItem()=="1")     
						      {
							   amountPaid*=1;
						      }   
						      else if(Sp2_Hour.getSelectedItem()=="2") {
						    	  amountPaid*=2;
						      }
			                 else if(Sp2_Hour.getSelectedItem()=="3") {
			                	 amountPaid*=3;
						      }
			                 else if(Sp2_Hour.getSelectedItem()=="4") {
			                	 amountPaid*=4;  
						      }
			                 else if(Sp2_Hour.getSelectedItem()=="5") {
			                	 amountPaid*=5;
						      }         
			   }
			});	
				
				
				Sp2_adultBox.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e) {
			              if(Sp2_adultBox.isSelected()) {

			 FacilitySubCategory ="Badminton";
			 amountPaid+=4.27;
			 Sp2_JuniorBox_1.setSelected(false);
			// Sp2_Hour.setEnabled(true);
			
			}            
		   }
		});		
				Sp2_JuniorBox_1.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e) {
		              if(Sp2_JuniorBox_1.isSelected()) {

		 FacilitySubCategory ="Badminton";
		 amountPaid+=2.65;
		 Sp2_adultBox.setSelected(false);
		
		
		}            
	   }
	});
		  }
		  
		/**
		 *method for sport hall category 2
		 *
		 */
		  void SportHall_Category2() {
			  amountPaid=0;
			  sportCategory3_panel = new JPanel();
				sportCategory3_panel.setBounds(22, 342, 531, 118);
				contentPane.add(sportCategory3_panel);
				sportCategory3_panel.setLayout(null);
				
				Sp_lb_2 = new JLabel("Sports Hall - Tennis per court, per hour:");
				Sp_lb_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
				Sp_lb_2.setBounds(55, 11, 344, 17);
				sportCategory3_panel.add(Sp_lb_2);
				
				Sp3_adultBox = new JCheckBox("Adults");
				Sp3_adultBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
				Sp3_adultBox.setBounds(28, 41, 148, 23);
				sportCategory3_panel.add(Sp3_adultBox);
				
				Sp3_JuniorBox = new JCheckBox("Junior");
				Sp3_JuniorBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
				Sp3_JuniorBox.setBounds(28, 67, 148, 23);
				sportCategory3_panel.add(Sp3_JuniorBox);
				
				Sp3_Hour = new JComboBox<String>();
				Sp3_Hour.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5"}));
				Sp3_Hour.setBounds(470, 41, 53, 22);
				sportCategory3_panel.add(Sp3_Hour);
				
				SelectHours_lb = new JLabel("Select Hours:");
				SelectHours_lb.setBounds(319, 44, 102, 14);
				sportCategory3_panel.add(SelectHours_lb);
				SelectHours_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
				
				PaymentStatus_lb_4 = new JLabel("Payment Status:");
				PaymentStatus_lb_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
				PaymentStatus_lb_4.setBounds(238, 67, 133, 14);
				sportCategory3_panel.add(PaymentStatus_lb_4);
				
				Paid_rd_4 = new JRadioButton("Paid");
				Paid_rd_4.setBounds(192, 88, 109, 23);
				sportCategory3_panel.add(Paid_rd_4);
				//Sp3_Hour.setEnabled(false);
				
				PendingPayment_rd_4 = new JRadioButton("Pending Payment");
				PendingPayment_rd_4.setBounds(303, 88, 183, 23);
				sportCategory3_panel.add(PendingPayment_rd_4);
				sportCategory3_panel.setVisible(false);
				Sp3_Hour.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
						   if(Sp3_Hour.getSelectedItem()=="1")     
						      {
							   amountPaid*=1;
							  
						      }   
						      else if(Sp3_Hour.getSelectedItem()=="2") {
						    	  amountPaid*=2; 
						    	 
						      }
			                 else if(Sp3_Hour.getSelectedItem()=="3") {
			                	 amountPaid*=3;
			                	
						      }
			                 else if(Sp3_Hour.getSelectedItem()=="4") {
			                	 amountPaid*=4;  
			                	
						      }
			                 else if(Sp3_Hour.getSelectedItem()=="5") {
			                	 amountPaid*=5;
			                	
						      }         
			   }
			});	
				
				
				Sp3_adultBox.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
					              if(Sp3_adultBox.isSelected()) {

					 FacilitySubCategory ="Tennis";
					 amountPaid+=5.25;
					 Sp3_JuniorBox.setSelected(false);
					 //Sp3_Hour.setEnabled(true);
					
					}            
				   }
				});		
						Sp3_JuniorBox.addActionListener(new ActionListener(){
				   public void actionPerformed(ActionEvent e) {
				              if(Sp3_JuniorBox.isSelected()) {

				 FacilitySubCategory ="Tennis";
				 amountPaid+=2.7;
				 Sp3_adultBox.setSelected(false);
				// Sp3_Hour.setEnabled(true);
				
				}            
			   }
			});
						
						 PendingPayment_rd_4.addActionListener(new ActionListener(){
							   public void actionPerformed(ActionEvent e) {
								   
								   if(PendingPayment_rd_4.isSelected())
								   {
									   Paid_rd_4.setSelected(false);  
									isPaid=true;
									amountUnpaid=amountPaid;
								amountPaid=0; 
								PaymentStatus=false;
								
								   }
							   }
							});
						
						Paid_rd_4.addActionListener(new ActionListener(){
							   public void actionPerformed(ActionEvent e) {
								   if(Paid_rd_4.isSelected())
								   {
									   PendingPayment_rd_4.setSelected(false);
									isPaid=true;
									amountPaid=0;
									PaymentStatus=true;
								   } 
								   
							   }
							});
					
				
		  }

		  
			/**
			 *method for sport hall category 3
			 *
			 */
			  void SportHall_Category3(){
				  amountPaid=0;
				  
				  sportCategory4_panel = new JPanel();
					sportCategory4_panel.setLayout(null);
					sportCategory4_panel.setBounds(22, 342, 531, 122);
					contentPane.add(sportCategory4_panel);
					
					SpoortCategory_lb_3 = new JLabel("Sports Hall - Badminton per court, per hour:");
					SpoortCategory_lb_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
					SpoortCategory_lb_3.setBounds(55, 11, 344, 17);
					sportCategory4_panel.add(SpoortCategory_lb_3);
					
					Sp4_adultBox = new JCheckBox("Adults");
					Sp4_adultBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
					Sp4_adultBox.setBounds(28, 41, 148, 23);
					sportCategory4_panel.add(Sp4_adultBox);
					//Sp4_Hour.setEnabled(false);
					Sp4_JuniorBox = new JCheckBox("Junior");
					Sp4_JuniorBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
					Sp4_JuniorBox.setBounds(28, 67, 148, 23);
					sportCategory4_panel.add(Sp4_JuniorBox);
					
					SelectHours_lb_2 = new JLabel("Select Hours:");
					SelectHours_lb_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
					SelectHours_lb_2.setBounds(319, 45, 102, 14);
					sportCategory4_panel.add(SelectHours_lb_2);
					
					Sp4_Hour = new JComboBox<String>();
					Sp4_Hour.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5"}));
					Sp4_Hour.setBounds(419, 41, 53, 22);
					sportCategory4_panel.add(Sp4_Hour); 
					
					PaymentStatus_lb_5 = new JLabel("Payment Status:");
					PaymentStatus_lb_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
					PaymentStatus_lb_5.setBounds(234, 71, 133, 14);
					sportCategory4_panel.add(PaymentStatus_lb_5);
					
					Paid_rd_5 = new JRadioButton("Paid");
					Paid_rd_5.setBounds(166, 92, 109, 23);
					sportCategory4_panel.add(Paid_rd_5);
					
					PendingPayment_rd_5 = new JRadioButton("Pending Payment");
					PendingPayment_rd_5.setBounds(289, 92, 183, 23);
					sportCategory4_panel.add(PendingPayment_rd_5);
					
					RegistrationType_lb = new JLabel("Registration Type:");
					RegistrationType_lb.setFont(new Font("Times New Roman", Font.BOLD, 14));
					RegistrationType_lb.setBounds(465, 229, 260, 17);
					contentPane.add(RegistrationType_lb);
					
						
					Sp4_Hour.addActionListener(new ActionListener(){
						   public void actionPerformed(ActionEvent e) {
							   if(Sp4_Hour.getSelectedItem()=="1")     
							      {
								   amountPaid*=1;
							
							      }   
							      else if(Sp4_Hour.getSelectedItem()=="2") {
							    	  amountPaid*=2; 
							    	
							      }
				                 else if(Sp4_Hour.getSelectedItem()=="3") {
				                	 amountPaid*=3;
				
							      }
				                 else if(Sp4_Hour.getSelectedItem()=="4") {
				                	 amountPaid*=4; 
				             
							      }
				                 else if(Sp4_Hour.getSelectedItem()=="5") {
				                	 amountPaid*=5;
				               
							      }         
				   }
				});	
							  										
					sportCategory4_panel.setVisible(false);
					Sp4_adultBox.addActionListener(new ActionListener(){
						   public void actionPerformed(ActionEvent e) {
						              if(Sp4_adultBox.isSelected()) {

						 FacilitySubCategory ="Table Tennis";
						 amountPaid+=4.25;
						 Sp4_JuniorBox.setSelected(false);
						 isSelectCategory=true;
						 //Sp4_Hour.setEnabled(true);
						}            
					   }
					});		
							Sp4_JuniorBox.addActionListener(new ActionListener(){
					   public void actionPerformed(ActionEvent e) {
					              if(Sp4_JuniorBox.isSelected()) {

					 FacilitySubCategory ="Table Tennis";
					 amountPaid+=2.5;
					 Sp4_adultBox.setSelected(false);
					 
					 isSelectCategory=true;
					 //Sp4_Hour.setEnabled(true);
					}            
				   }
				});	
			
							 PendingPayment_rd_5.addActionListener(new ActionListener(){
								   public void actionPerformed(ActionEvent e) {
									   
									   if(PendingPayment_rd_5.isSelected())
									   {
										   Paid_rd_5.setSelected(false);  
										isPaid=true;
										amountUnpaid=amountPaid;
									amountPaid=0; 
									PaymentStatus=false;
									   }
								   }
								});
							
							Paid_rd_5.addActionListener(new ActionListener(){
								   public void actionPerformed(ActionEvent e) {
									   if(Paid_rd_5.isSelected())
									   {
										   PendingPayment_rd_5.setSelected(false);
										isPaid=true;
										amountPaid=0;
										PaymentStatus=true;
									   } 
									   
								   }
								});
						
							
							
			  }

			  /**
				 *method to calculate hours for swimming pool facility
				 *
				 */
			  void swimmingCategoryHourSet() {
			
				    Swim_HourPanel = new JPanel();
					Swim_HourPanel.setBounds(538, 354, 163, 49);
					contentPane.add(Swim_HourPanel);
					Swim_HourPanel.setLayout(null);
					
					swim__hour_lb = new JLabel("Select Hour:");
					swim__hour_lb.setFont(new Font("Times New Roman", Font.BOLD, 12));
					swim__hour_lb.setBounds(10, 15, 84, 14);
					Swim_HourPanel.add(swim__hour_lb);
					
					SelectTime_swim = new JComboBox<String>();
					SelectTime_swim.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5"}));
					SelectTime_swim.setBounds(104, 11, 49, 22);
					Swim_HourPanel.add(SelectTime_swim);
					Swim_HourPanel.setVisible(false);
					//SelectTime_swim.setEnabled(false);
					SelectTime_swim.addActionListener(new ActionListener(){
						   public void actionPerformed(ActionEvent e) {
							   if(SelectTime_swim.getSelectedItem()=="1")     
							      {
								   amountPaid+=7;
							
							      }   
							      else if(SelectTime_swim.getSelectedItem()=="2") {
							    	  amountPaid+=14; 
							  
							      }
				                 else if(SelectTime_swim.getSelectedItem()=="3") {
				                	 amountPaid+=21;
				                	
							      }
				                 else if(SelectTime_swim.getSelectedItem()=="4") {
				                	 amountPaid+=28; 
				                	 
							      }
				                 else if(SelectTime_swim.getSelectedItem()=="5") {
				                	 amountPaid+=35;
				                	
							      }         
				   }
				});	
					
					
				
			  
			 	
			  }
			  
			  
			  


}
