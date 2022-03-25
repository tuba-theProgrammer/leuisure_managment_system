package ProjectClass;

public class ParticipantInfoDataHolder_Facility {

	String name, email, accountNumber, RegistrationType, registrationDate, Facility_subCategory;
	boolean paymentStatus;
	int memberShipId, mobileNumber;
	float PendingPayment, paidAmount;

	public ParticipantInfoDataHolder_Facility(int memberShipId, String name, int mobileNumber, String email, String accountNumber,
			String registrationDate, String RegistrationType, String Facility_subCategory, boolean paymentStatus,
			float paidAmount, float PendingPayment) {
		// TODO Auto-generated constructor stub
		this.memberShipId = memberShipId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.accountNumber = accountNumber;
		this.registrationDate = registrationDate;
		this.RegistrationType = RegistrationType;
		this.paymentStatus = paymentStatus;
		this.paidAmount = paidAmount;
		this.Facility_subCategory = Facility_subCategory;
		this.PendingPayment = PendingPayment;

	}
	/**
	 * getter method for MemberShip Id
	 * @return MemberShip Id
	 */
	public int getMemberShipId() {
		return memberShipId;
	}

	/**
	 * setter method for MemberShip Id
	 */
	public void setMemberShipId(int memberShipId) {
		this.memberShipId = memberShipId;
	}
	/**
	 * getter method for Member name
	 * @return Member name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter method for Member name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter method for mobile number
	 * @return mobile number
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * setter method for mobile number
	 */
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	/**
	 * getter method for email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	
	/**
	 * setter method for email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * getter method for account Number
	 * @return account Number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}


	/**
	 * setter method for account Number
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * getter method for Registration Date
	 * @return Registration Date
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * setter method for Registration Date
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * getter method for Payment Status
	 * @return  Payment Status
	 */
	public boolean getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * setter method for Payment Status
	 */

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/**
	 * getter method for Paid Amount
	 * @return Paid Amount
	 */
	public float getPaidAmount() {
		return paidAmount;
	}
	/**
	 * setter method for Paid Amount
	 */
	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	
	/**
	 * getter method for MemberShip Type
	 * @return MemberShip Type
	 */
	public String getRegistrationType() {
		return RegistrationType;
	}
	/**
	 * setter method for MemberShip Type

	 */
	public void setRegistrationType(String RegistrationType) {
		this.RegistrationType = RegistrationType;
	}

	
	/**
	 * getter method for Facility subCategory
	 * @return Facility subCategory
	 */
	public String getFacility_subCategory() {
		return Facility_subCategory;
	}
	/**
	 * setter method for Facility subCategory
	 */
	public void setFacility_subCategory(String Facility_subCategory) {
		this.Facility_subCategory = Facility_subCategory;
	}
	/**
	 * getter method for Pending Payment
	 * @return Pending Payment
	 */
	public float getPendingPayment() {
		return PendingPayment;
	}
	/**
	 * setter method for Pending Payment
	 */
	public void setPendingPayment(float PendingPayment) {
		this.PendingPayment = PendingPayment;
	}
}
