
public class FitnessParticipent_RegistrationInfoDataHolder {

	 String name,email,accountNumber,registrationDate;
	 boolean paymentStatus;
	 int memberShipId,mobileNumber;
	 float paidAmount,pendingAmount;
	public FitnessParticipent_RegistrationInfoDataHolder(int memberShipId,String name,int mobileNumber,String  email,String accountNumber,String registrationDate,boolean paymentStatus,float paidAmount,float pendingAmount
	) {
		// TODO Auto-generated constructor stub
		this.memberShipId=memberShipId;
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.email=email;
		this.accountNumber=accountNumber;
		this.registrationDate=registrationDate;
		this.paymentStatus=paymentStatus;
		this.paidAmount=paidAmount;
	    this.pendingAmount=pendingAmount;
		
	}
	
	/**
	 * getter method for MemberShipId
	 * @return MemberShipId
	 */
	public int getMemberShipId() {
		return memberShipId;
	}
	/**
	 * setter method for MemberShipId
	 */
	public void setMemberShipId(int memberShipId) {
		this.memberShipId = memberShipId;
	}
	
	/**
	 * getter method for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter method for name
	 */
	public void setName(String name) {
		this.name = name;
	}
	

	/**
	 * getter method for Mobile Number
	 * @return Mobile Number
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * setter method for Mobile Number
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
	 * getter method for Account Number
	 * @return Account Number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * setter method for Account Number
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
	 * getter method for Paid amount
	 * @return  Paid amount
	 */
	public float getPaidAmount() {
		return paidAmount;
	}
	/**
	 * setter method for Paid amount
	 */
	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	/**
	 * getter method for pending Amount
	 * @return   pending Amount
	 */
	public float getpendingAmount() {
		return pendingAmount;
	}

	/**
	 * setter method for pending Amount
	 */
	public void setpendingAmount(float pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	
		
}
