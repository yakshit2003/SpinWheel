package com.SpinModule.entity;



public class UserDetails {


	
	
	private String name;
	
	
	private String email;
	
	
	private String phone;
	
	
	private String state;
	private String district;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String name, String email, String phone, String state, String district) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.state = state;
		this.district=district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", email=" + email + ", phone=" + phone + ", state=" + state
				+ "]";
	}
	
	
	

}
