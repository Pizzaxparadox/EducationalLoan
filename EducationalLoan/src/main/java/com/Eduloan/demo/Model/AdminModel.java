package com.Eduloan.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdminModel {

	@Id
	private String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserrole() {
		return Userrole;
	}
	public void setUserrole(String userrole) {
		Userrole = userrole;
	}
	private String Password;
	private String MobileNumber;
	private String Userrole;
}
