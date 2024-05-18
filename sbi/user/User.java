package com.sbi.user;

public class User {
	// Private variables to store user information
    private String fullName;
	
	private String gender;
	
	private String mobileNumber;
	
	private String dob;
	
	private String password;
	
	private Integer accountNumber;
	
	private Integer accountBalance;
	// Getters and setters for the private variables

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}
	// Constructor to initialize the User object with provided information
	public User(String fullName, String gender, String mobileNumber, String dob, String password, Integer accountNumber,
			Integer accountBalance) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.password = password;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	// Empty constructor

	public User() {
		
	}
    // toString() method to convert the object to a string representation
	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", dob=" + dob
				+ ", password=" + password + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ "]";
	}
	// hashCode() method to generate a hash code for the object

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		// Calculate the hash code for the accountBalance variable and add it to the result.
        // If accountBalance is null, use 0 instead.
		result = prime * result + ((accountBalance == null) ? 0 : accountBalance.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	// equals() method to compare two objects for equality
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (accountBalance == null) {
			if (other.accountBalance != null)
				return false;
		} else if (!accountBalance.equals(other.accountBalance))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
