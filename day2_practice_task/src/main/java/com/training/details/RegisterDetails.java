package com.training.details;

public class RegisterDetails {

	private String UserName;
	private String Name;
	private String Phone;
	private String Email;
	private String password;
	private int Age;
	private String Gender;
	private String ContactNumber;

	public RegisterDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterDetails(String userName, String name, String phone, String email, String password, int age,
			String gender, String ContactNumber) {
		super();
		this.UserName = userName;
		this.Name = name;
		this.Phone = phone;
		this.Email = email;
		this.password = password;
		this.Age = age;
		this.Gender = gender;
		this.ContactNumber = ContactNumber;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "RegisterDetails [UserName=" + UserName + ", Name=" + Name + ", Phone=" + Phone + ", Email=" + Email
				+ ", password=" + password + ", Age=" + Age + ", Gender=" + Gender + ", ContactNumber=" + ContactNumber
				+ "]";
	}

}
