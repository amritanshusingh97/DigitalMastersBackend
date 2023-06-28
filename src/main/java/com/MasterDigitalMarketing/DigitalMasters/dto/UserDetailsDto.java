package com.MasterDigitalMarketing.DigitalMasters.dto;



public class UserDetailsDto {

    private Long id;

    private String email;

    private String password;
    private String contactNo;
    
    
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
    

}

