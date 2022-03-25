package ProjectClass;
import java.util.ArrayList;

public class FitnessClass_InfoDataHolder {

	 String classGrade,classInstructorName,startTime,endTime;
	 ArrayList<FitnessParticipent_RegistrationInfoDataHolder> participantDetails;
	 int numberOfPeople;
	public FitnessClass_InfoDataHolder(String classGrade,String classInstructorName,String startTime,String endTime,int numberOfPeople,ArrayList<FitnessParticipent_RegistrationInfoDataHolder>participantDetails) {
		// TODO Auto-generated constructor stub
		this.classGrade=classGrade;
		this.classInstructorName=classInstructorName;
		this.startTime=startTime;
		this.endTime=endTime;
		
		this.participantDetails=participantDetails;
		this.numberOfPeople=numberOfPeople;
	}

	/**
	 * getter method for class grade 
	 * @return class grade
	 */
	public String getClassGrade() {
		return classGrade;
	}
	/**
	 * setter method for class grade 
	 * 
	 */
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}

	
	/**
	 * getter method for class instructor name 
	 * @return class instructor name
	 */
	public String getClassInstructorName() {
		return classInstructorName;
	}


	/**
	 * setter method for class instructor name 
	 */
	public void setClassInstructorName(String classInstructorName) {
		this.classInstructorName = classInstructorName;
	}


	/**
	 * getter method for class Start Time
	 * @return class class Start Time
	 */
	public String getStartTime() {
		return startTime;
	}

	

	/**
	 * setter method for class Start Time
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	/**
	 * getter method for class end Time
	 * @return class class end Time
	 */
	public String getEndTime() {
		return endTime;
	}


	/**
	 * setter method for class end Time
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	

	/**
	 * getter method for ParticipantDetails array
	 * @return ParticipantDetails array
	 */
	public ArrayList<FitnessParticipent_RegistrationInfoDataHolder> getParticipantDetails() {
		return participantDetails;
	}

	/**
	 * setter method for ParticipantDetails array
	 */
	public void setParticipantDetails(ArrayList<FitnessParticipent_RegistrationInfoDataHolder> participantDetails) {
		this.participantDetails = participantDetails;
	}
	

	/**
	 * getter method for each class Number Of People
	 * @return each class Number Of People
	 */
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	
	/**
	 * getter method for each class Number Of People
	 */
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
		
}
