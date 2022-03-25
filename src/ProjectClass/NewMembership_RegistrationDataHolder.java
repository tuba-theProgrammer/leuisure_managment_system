package ProjectClass;

public class NewMembership_RegistrationDataHolder {

	 String name,email,accountNumber,registrationDate,MemberShipType;
	 int memberShipId,mobileNumber,paidAmount;
	public NewMembership_RegistrationDataHolder(int memberShipId,String name,int mobileNumber,String  email,String accountNumber,String MemberShipType,String registrationDate ,int paidAmount
	) {
		// TODO Auto-generated constructor stub
		this.memberShipId=memberShipId;
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.email=email;
		this.accountNumber=accountNumber;
		this.registrationDate=registrationDate;
		this.paidAmount=paidAmount;
		this.MemberShipType=MemberShipType;
		
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
	 * getter method for Paid Amount
	 * @return Paid Amount
	 */
	public int getPaidAmount() {
		return paidAmount;
	}
	
	/**
	 * setter method for Paid Amount
	 */
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	/**
	 * getter method for MemberShip Type
	 * @return MemberShip Type
	 */
	public String getMemberShipType() {
		return MemberShipType;
	}
	/**
	 * setter method for MemberShip Type
	 */
	public void setMemberShipType(String MemberShipType) {
		this.MemberShipType = MemberShipType;
	}
		
}
