import java.util.ArrayList;

public class FacilityClassDataHolder {

	 String FacilityName;
	 ArrayList<ParticipantInfoDataHolder_Facility> participantDetails;
	 ArrayList<FacilityOpeningTimingsDataHolder> OpeningTiming;
	 int numberOfPeople;
	 
	 
	public FacilityClassDataHolder(String FacilityName,ArrayList<FacilityOpeningTimingsDataHolder> OpeningTiming,int numberOfPeople,ArrayList<ParticipantInfoDataHolder_Facility>participantDetails) {
		// TODO Auto-generated constructor stub
		this.FacilityName=FacilityName;
		this.OpeningTiming=OpeningTiming;
		this.participantDetails=participantDetails;
		this.numberOfPeople=numberOfPeople;
	}

	/**
	 * getter method for facility name
	 * @return facility name
	 */
	public String getFacilityName() {
		return FacilityName;
	}
	/**
	 * setter method for facility name
	 */
	public void setFacilityName(String FacilityName) {
		this.FacilityName = FacilityName;
	}

	/**
	 * getter method for participant array
	 * @return array of participant details
	 */
	public ArrayList<ParticipantInfoDataHolder_Facility> getParticipantDetails() {
		return participantDetails;
	}

	/**
	 * setter method for participant array
	 */
	public void setParticipantDetails(ArrayList<ParticipantInfoDataHolder_Facility> participantDetails) {
		this.participantDetails = participantDetails;
	}
	
	
	/**
	 * getter method for facility opening timings array
	 * @return array of facility opening timings array
	 */
	public ArrayList<FacilityOpeningTimingsDataHolder> getOpeningTiming() {
		return OpeningTiming;
	}

	
	/**
	 * setter method for facility opening timings array
	 */
	public void setOpeningTiming(ArrayList<FacilityOpeningTimingsDataHolder> OpeningTiming) {
		this.OpeningTiming = OpeningTiming;
	}
	
	/**
	 * getter method for number of people
	 * @return number of people
	 */
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	
	/**
	 * setter method for number of people
	 * 
	 */
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
		
}
