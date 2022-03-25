package ProjectClass;
import java.util.ArrayList;

public class AssumedDataGenerator {

	public  AssumedDataGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<FitnessClass_InfoDataHolder> getFitnessSampleData()
	{  
		
		
//*********************************************************** SWIM CLASSES************************************************************************************
//*************************************** Class A-
		//Creating array for class A
		ArrayList<FitnessClass_InfoDataHolder> fitnessClassDataHolders = new ArrayList<FitnessClass_InfoDataHolder>();
		
		
		ArrayList<FitnessParticipent_RegistrationInfoDataHolder> participantDetailsForClass1 = new ArrayList<FitnessParticipent_RegistrationInfoDataHolder>();
		participantDetailsForClass1.add(new FitnessParticipent_RegistrationInfoDataHolder(1001, "James", 000111, "james@gmail.com", "AC-01001","12-12-2020", false, 23,2));
		participantDetailsForClass1.add(new FitnessParticipent_RegistrationInfoDataHolder(1002, "Methew", 000112, "mathew@gmail.com", "AC-00021","10-12-2020", true, 20,0));
		participantDetailsForClass1.add(new FitnessParticipent_RegistrationInfoDataHolder(1003, "Nad", 000131, "nad@gmail.com", "AC-50002","14-12-2020",true, 13,0));
		participantDetailsForClass1.add(new FitnessParticipent_RegistrationInfoDataHolder(1004, "Zee", 000141, "zee@gmail.com", "AC-00003","17-12-2020",false, 63,2));
		participantDetailsForClass1.add(new FitnessParticipent_RegistrationInfoDataHolder(1005, "Lara", 000151, "lara@gmail.com", "AC-01004","22-12-2020", false, 33,3));
		
		// adding Data of Partcipants to Class
		fitnessClassDataHolders.add(new FitnessClass_InfoDataHolder("SwimStar", "Mr : Jhon", "9:00 AM", "11:00 PM",5,participantDetailsForClass1 ));
		

		
//********************************************************** Exercise / fitness related classes
//*************************************** Class B-   Atheletic
		//Creating array for class B
		ArrayList<FitnessParticipent_RegistrationInfoDataHolder> participantDetailsForClass2 = new ArrayList<FitnessParticipent_RegistrationInfoDataHolder>();
				
	    participantDetailsForClass2.add(new FitnessParticipent_RegistrationInfoDataHolder(1001, "James", 000111, "james@gmail.com", "AC-01001","12-12-2020",false, 23,3));
		participantDetailsForClass2.add(new FitnessParticipent_RegistrationInfoDataHolder(1002, "Methew", 000112, "mathew@gmail.com", "AC-00021","10-12-2020", true, 20,0));
		participantDetailsForClass2.add(new FitnessParticipent_RegistrationInfoDataHolder(1003, "Nad", 000131, "nad@gmail.com", "AC-50002","14-12-2020", true, 13,0));
		participantDetailsForClass2.add(new FitnessParticipent_RegistrationInfoDataHolder(1004, "Zee", 000141, "zee@gmail.com", "AC-00003","17-12-2020",false, 63,1));
							
		// adding Data of Partcipants to Class
		fitnessClassDataHolders.add(new FitnessClass_InfoDataHolder("Athletic", "Mr : Zee", "12:00 AM", "2:00 PM",10,participantDetailsForClass2 ));

		
//******************************************* Class C-	 Dynamic Flow Yoga	
		//Creating array for class C
		ArrayList<FitnessParticipent_RegistrationInfoDataHolder> participantDetailsForClass3 = new ArrayList<FitnessParticipent_RegistrationInfoDataHolder>();
		fitnessClassDataHolders.add(new FitnessClass_InfoDataHolder("Dynamic-Flow-Yoga", "Miss : Tuba", "3:00 AM", "5:00 PM", 0,participantDetailsForClass3));
		

//******************************************* Class D- Basic Training Circuit
		//Creating array for class C
		ArrayList<FitnessParticipent_RegistrationInfoDataHolder> participantDetailsForClass4 = new ArrayList<FitnessParticipent_RegistrationInfoDataHolder>();
		fitnessClassDataHolders.add(new FitnessClass_InfoDataHolder("Basic Training Circuit", "Miss : mass", "6:00 AM", "8:00 PM",0,participantDetailsForClass3));
						
		
		return fitnessClassDataHolders;
	}
	

//********************************** For member register data
	
	public static ArrayList<NewMembership_RegistrationDataHolder> getMembershipData(){
		//**************************Creating ArrayList For Members
		
				ArrayList<NewMembership_RegistrationDataHolder> MemberRegistration = new ArrayList<NewMembership_RegistrationDataHolder>();
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1001, "James", 000111, "james@gmail.com", "AC-01001","Full", "12-12-2020", 23));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1002, "Methew", 000112, "mathew@gmail.com", "AC-00021","Family","10-13-2020",20));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1003, "Nad", 000131, "nad@gmail.com", "AC-50002","Exercise","14-12-2020",13));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1004, "Zeeshan", 000141, "zee@gmail.com", "AC-00003","Casual","17-12-2020",63));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1005, "Larkda", 000151, "lara1@gmail.com", "AC-01004","Family","22-12-2020",33));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1006, "Larkda1", 000121, "lara2@gmail.com", "AC-01014","Casual","22-12-2020",33));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1007, "Larkda2", 000131, "lar3a@gmail.com", "AC-01234","Exercise","25-12-2020",33));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1008, "Larkda3", 000141, "lara4@gmail.com", "AC-01024","Full","29-12-2020",33));
				MemberRegistration.add(new NewMembership_RegistrationDataHolder(1009, "Larkda4", 000151, "lara5@gmail.com", "AC-01025","Family","30-12-2020",33));

				
				
		return MemberRegistration;
	}
// *************************for Facility registration Data
	public static ArrayList<FacilityClassDataHolder> getFacilitySampleData(){
		//*************************************** Facility 1===  swimming pool-
				//Creating array for swimming pool
				ArrayList<FacilityClassDataHolder> facilitylassDataHolders = new ArrayList<FacilityClassDataHolder>();
				
				
				
				// creating array for partcipant in facility
				ArrayList<ParticipantInfoDataHolder_Facility> participantDetailsForFacility = new ArrayList<ParticipantInfoDataHolder_Facility>();
				participantDetailsForFacility.add(new ParticipantInfoDataHolder_Facility(1001, "James", 000111, "james@gmail.com", "AC-01001","12-13-2020","Full","swimming",false, 23,15));
				participantDetailsForFacility.add(new ParticipantInfoDataHolder_Facility(1002, "Methew", 000112, "mathew@gmail.com", "AC-00021","10-13-2020","Family","swimming", true, 20,0));
				participantDetailsForFacility.add(new ParticipantInfoDataHolder_Facility(1003, "Nad", 000131, "nad@gmail.com", "AC-50002","14-13-2020","Exercise","swimming",true, 13,0));
				participantDetailsForFacility.add(new ParticipantInfoDataHolder_Facility(1004, "Zee", 000141, "zee@gmail.com", "AC-00003","17-13-2020", "Casual","swimming",false, 63,14));
				participantDetailsForFacility.add(new ParticipantInfoDataHolder_Facility(1005, "Lara", 000151, "lara@gmail.com", "AC-01004","22-13-2020","Swim","swimming",false, 33,12));
				
				// creating array for facility opening timing
				ArrayList<FacilityOpeningTimingsDataHolder> FacilityOpeningTiming = new ArrayList<FacilityOpeningTimingsDataHolder>();
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Monday","6am - 10am","Mr - A","2pm - 11pm","Mr - G"));
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Tuesday","6am - 10am","Mr - B","2pm - 11pm","Mr - T"));
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Wednesday","6am - 10am","Mr - G","2pm - 11pm","Mr - M"));
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Thursday","6am - 10am","Mr - H","2pm - 11pm","Mr - A"));
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Friday","6am - 10am","Mr - M","2pm - 11pm","Mr - D"));
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Saturday","7am - 7am","Mr - P","off","Mr - Q"));
				FacilityOpeningTiming.add(new FacilityOpeningTimingsDataHolder("Sunday","8am - 7am","Mr - P","off","Mr - Q"));
				
				
				// adding Data of Partcipants to Class
				facilitylassDataHolders.add(new FacilityClassDataHolder("Swimming pool",FacilityOpeningTiming,5,participantDetailsForFacility ));
				
		//*************************************** Facility 2===    sport hall-
				//Creating array for swimming pool
						
				ArrayList<ParticipantInfoDataHolder_Facility> participantDetailsForFacility2 = new ArrayList<ParticipantInfoDataHolder_Facility>();
				participantDetailsForFacility2.add(new ParticipantInfoDataHolder_Facility(1001, "James", 000111, "james@gmail.com", "AC-01001","12-13-2020","Full","Sports Hall - Half Hall",false, 23,33));
				participantDetailsForFacility2.add(new ParticipantInfoDataHolder_Facility(1002, "Methew", 000112, "mathew@gmail.com", "AC-00021","10-13-2020","Family","Sports Hall - Badminton per court, per hour", true, 20,0));
						
				// creating array for facility opening timing
				ArrayList<FacilityOpeningTimingsDataHolder> FacilityOpeningTiming1 = new ArrayList<FacilityOpeningTimingsDataHolder>();
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Monday","6am - 11am","Mr - C","2pm - 11pm","Mr - H"));
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Tuesday","6am - 11am","Mr - D","2pm - 11pm","Mr - K"));
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Wednesday","6am - 11am","Mr - I","2pm - 11pm","Mr - N"));
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Thursday","6am - 11am","Mr - J","2pm - 11pm","Mr - B"));
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Friday","6am - 11am","Mr - N","2pm - 11pm","Mr - E"));
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Saturday","7am - 7pm","Mr - R","off","Mr - S"));
				FacilityOpeningTiming1.add(new FacilityOpeningTimingsDataHolder("Sunday","7am - 7pm","Mr - R","off","Mr - S"));
				
				
				// adding Data of Partcipants to Class
				facilitylassDataHolders.add(new FacilityClassDataHolder("Sport Hall",FacilityOpeningTiming1,2,participantDetailsForFacility2 ));
		//*************************************** Facility 3===  Exercise studio-
				//Creating array for swimming pool
						
				ArrayList<ParticipantInfoDataHolder_Facility> participantDetailsForFacility3 = new ArrayList<ParticipantInfoDataHolder_Facility>();
				participantDetailsForFacility3.add(new ParticipantInfoDataHolder_Facility(1001, "James", 000111, "james@gmail.com", "AC-01001","12-13-2020","Full","Sports Hall - Half Hall",false, 23,7));
				participantDetailsForFacility3.add(new ParticipantInfoDataHolder_Facility(1002, "Methew", 000112, "mathew@gmail.com", "AC-00021","10-13-2020","Family","Sports Hall - Badminton per court, per hour", true, 20,0));
				participantDetailsForFacility3.add(new ParticipantInfoDataHolder_Facility(1003, "Nad", 000131, "nad@gmail.com", "AC-50002","14-13-2020","Exercise","Sports Hall - Tennis per court, per hour",true, 13,0));
				participantDetailsForFacility3.add(new ParticipantInfoDataHolder_Facility(1004, "Zee", 000141, "zee@gmail.com", "AC-00003","17-13-2020", "Casual","Sports Hall - Table Tennis per table, per hour",false, 63,21));
				participantDetailsForFacility3.add(new ParticipantInfoDataHolder_Facility(1005, "Lara", 000151, "lara@gmail.com", "AC-01004","22-13-2020","Swim","Sports Hall - Badminton per court, per hour",false, 33,22));
				
				// creating array for facility opening timing
				ArrayList<FacilityOpeningTimingsDataHolder> FacilityOpeningTiming2 = new ArrayList<FacilityOpeningTimingsDataHolder>();
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Monday","6am - 11am","Mr - E","2pm - 11pm","Mr - I"));
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Tuesday","6am - 11am","Mr - F","2pm - 11pm","Mr - T"));
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Wednesday","6am - 11am","Mr - K","2pm - 11pm","Mr - O"));
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Thursday","6am - 11am","Mr - L","2pm - 11pm","Mr - C"));
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Friday","6am - 11am","Mr - 0","2pm - 11pm","Mr - F"));
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Saturday","7am - 7pm","Mr - T","off","Mr - U"));
				FacilityOpeningTiming2.add(new FacilityOpeningTimingsDataHolder("Sunday","7am - 7pm","Mr - T","off","Mr - U"));
			
				// adding Data of Partcipants to Class
				facilitylassDataHolders.add(new FacilityClassDataHolder("Exercise Studio",FacilityOpeningTiming2,5,participantDetailsForFacility2 ));
	          
				
				
				
		return facilitylassDataHolders;
	}
	
	public static ArrayList<LifeGuardScheduleDataHolder> getLifeGuardSchedule(){
		//**************************Creating ArrayList For Members
		//LifeGuard Schedule
		ArrayList<LifeGuardScheduleDataHolder> Weeklychedule=new ArrayList<LifeGuardScheduleDataHolder>();
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - A","6am - 10am","-","-","2pm - 11pm","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - B","-","6am - 10am","-","2pm - 11pm","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - C","6am - 10am","-","-","2am - 11am","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - D","-","6am - 10am","-","-","2am - 11am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - E","6am - 10am","-","-","-","2am - 11am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - F","-","6am - 10am","-","-","2am - 11am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - G","2am - 11am","-","6am - 10am","-","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - H","2am - 11am","-","-","6am - 10am","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - I","2am - 11am","-","6am - 10am","-","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - J","-","2am - 11am","-","-","6am - 10am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - K","-","2am - 11am","6am - 10am","-","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - L","-","2am - 11am","-","6am - 10am","-","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - M","-","-","2am - 11am","-","6am - 10am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - N","-","-","2am - 11am","-","6am - 10am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - O","-","-","2am - 11am","-","6am - 10am","-","-"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - P","","","","","","7am - 7pm","7am - 7pm"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - Q","","","","","","7am - 7pm","7am - 7pm"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - R","","","","","","7am - 7pm","7am - 7pm"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - S","","","","","","7am - 7pm","7am - 7pm"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - T","","","","","","7am - 7pm","7am - 7pm"));
		Weeklychedule.add(new LifeGuardScheduleDataHolder("Mr - U","","","","","","7am - 7pm","7am - 7pm"));
		

				
		return Weeklychedule;
	}
	
	
	
	
}
