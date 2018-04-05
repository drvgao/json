package org.igt.jentity;

public class PlayerRegistrationEntity {

	private Integer testCaseId;

	private String deposit_promo;

	private String location;

	private String email;

	private String confirm_email;

	private String password;

	private String tempPassword;

	private String firstname;

	private String middlename;

	private String house_street_number;

	private String last_name;

	private String zipcode;

	private String gender;

	private String dob;

	private String country;

	private String town;

	private String state;

	private String citizenship;

	private String phonenumber;

	private String ssn;
	private String security_question;

	private String security_answer;

	private String username;

	private String friend_promo_code;

	private String language;

	private String currency;

	private String optInMobileNo;

	private String groupName;

	public Integer getTestCaseId() {
		return testCaseId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirm_email() {
		return confirm_email;
	}

	public void setConfirm_email(String confirm_email) {
		this.confirm_email = confirm_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getHouse_street_number() {
		return house_street_number;
	}

	public void setHouse_street_number(String house_street_number) {
		this.house_street_number = house_street_number;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTown() {
		return town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSecurity_question() {
		return security_question;
	}

	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}

	public String getSecurity_answer() {
		return security_answer;
	}

	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFriend_promo_code() {
		return friend_promo_code;
	}

	public void setFriend_promo_code(String friend_promo_code) {
		this.friend_promo_code = friend_promo_code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOptInMobileNo() {
		return optInMobileNo;
	}

	public void setOptInMobileNo(String optInMobileNo) {
		this.optInMobileNo = optInMobileNo;
	}

	public void setTestCaseId(Integer testCaseId) {
		this.testCaseId = testCaseId;
	}

	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 */

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setGroupName(String grpName) {
		this.groupName = grpName;
	}

	public String getGroupName() {
		return groupName;
	}

	private String depositAmount;

	// string to int
	public String getDepositAmount() {
		return depositAmount;
	}

	public void setDeposit_amount(String depoAmount) {
		this.depositAmount = depoAmount;
	}

	public String getDeposit_promo() {
		return deposit_promo;
	}

	public void setDeposit_promo(String deposit_promo) {
		this.deposit_promo = deposit_promo;
	}

	public String getTempPassword() {
		return tempPassword;
	}

	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
}
