package ProjectClass;
public class LifeGuardScheduleDataHolder {

	String LifeGuardName;
	String Monday;
	String Tuesday;
	String Wed;
	String Thurs;
	String Fri;
	String Sat;
	String Sunday;
	
	public LifeGuardScheduleDataHolder(String LifeGuardName,String Monday,String Tuesday,String Wed,String Thurs,String Fri,String Sat,String Sunday) {
		// TODO Auto-generated constructor stub
		this.LifeGuardName=LifeGuardName;
		this.Monday=Monday;
		this.Tuesday=Tuesday;
		this.Wed=Wed;
		this.Thurs=Thurs;
		this.Fri=Fri;
		this.Sat=Sat;
		this.Sunday=Sunday;
	}


	/**
	 * getter method for lifeGuard Name
	 * @return  lifeGuard Name
	 */
	public String getLifeGuardName() {
		return LifeGuardName;
	}
	/**
	 * setter method for lifeGuard Name
	 */
	public void setLifeGuardName(String LifeGuardName) {
		this.LifeGuardName = LifeGuardName;
	}

	/**
	 * getter method for Monday
	 * @return Monday
	 */
	public String getMonday() {
		return Monday;
	}

	/**
	 * getter method for Monday
	 */
	public void setMonday(String Monday) {
		this.Monday = Monday;
	}

	/**
	 * getter method for Tuesday
	 * @return Tuesday
	 */
	public String getTuesday() {
		return Tuesday;
	}
	/**
	 * setter method for Tuesday
	 	 */
	public void setTuesday(String Tuesday) {
		this.Tuesday = Tuesday;
	}
	/**
	 * getter method for wednesday
	 * @return wednesday
	 */
	public String getWed() {
		return Wed;
	}
	/**
	 * setter method for wednesday
	 */
	public void setWed(String Wed) {
		this.Wed = Wed;
	}

	/**
	 * getter method for thursday
	 * @return thursday
	 */
	public String getThurs() {
		return Thurs;
	}
	/**
	 * setter method for thursday
	 */
	public void setThurs(String Thurs) {
		this.Thurs = Thurs;
	}
	
	/**
	 * getter method for friday
	 * @return friday
	 */
	public String getFri() {
		return Fri;
	}
	/**
	 * setter method for friday
	 */
	public void setFri(String Fri) {
		this.Fri = Fri;
	}

	/**
	 * getter method for saturday
	 * @return saturday
	 */
	public String getSat() {
		return Sat;
	}

	/**
	 * setter method for saturday
	 */
	public void setSat(String Sat) {
		this.Sat = Sat;
	}
	

	/**
	 * getter method for sunday
	 * @return sunday
	 */
	public String getSunday() {
		return Sunday;
	}
	/**
	 * setter method for sunday
	 	 */
	public void setSunday(String Sunday) {
		this.Sunday = Sunday;
	}

	
}
