import java.util.ArrayList;

public class FacilityOpeningTimingsDataHolder {

	 String weekDay,shift1_timing,shift2_timing,shift1_instructor,shift2_instructor;
	
	public FacilityOpeningTimingsDataHolder(String weekDay,String shift1_timing,String shift1_instructor,String shift2_timing,String shift2_instructor) {
		// TODO Auto-generated constructor stub
		this.weekDay=weekDay;
		this.shift1_timing=shift1_timing;
		this.shift2_timing=shift2_timing;
		this.shift1_instructor=shift1_instructor;
		this.shift2_instructor=shift2_instructor;
		
	}
	/**
	 * getter method for weekDay name
	 * @return weekDay name
	 */
	
	public String getweekDay() {
		return weekDay;
	}
	/**
	 * setter method for weekDay name
	 */
	public void setweekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	/**
	 * getter method for shift1 timing
	 * @return shift1 timing
	 */
	public String getshift1_timing() {
		return shift1_timing;
	}

	/**
	 * setter method for shift1 timing
	 */
	public void setshift1_timing(String shift1_timing) {
		this.shift1_timing = shift1_timing;
	}

	

	/**
	 * getter method for shift2 timing
	 * @return shift2 timing
	 */
	
	public String getshift2_timing() {
		return shift2_timing;
	}
	/**
	 * setter method for shift2 timing
	 */
	public void setshift2_timing(String shift2_timing) {
		this.shift2_timing = shift2_timing;
	}


	/**
	 * getter method for shift1 instructor
	 * @return shift1 instructor
	 */
	public String getshift1_instructor() {
		return shift1_instructor;
	}

	/**
	 * setter method for shift1 instructor
	 *
	 */
	public void setshift1_instructor(String shift1_instructor) {
		this.shift1_instructor = shift1_instructor;
	}
	/**
	 * getter method for shift2 instructor
	 * @return shift2 instructor
	 */
	
	public String getshift2_instructor() {
		return shift2_instructor;
	}
	/**
	 * setter method for shift1 instructor
	 *
	 */

	public void setshif2_instructor(String shift2_instructor) {
		this.shift2_instructor = shift2_instructor;
	}

	
}
