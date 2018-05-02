package com.socgen.recovery.resource.data;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String loginAD;
	private String country;

	// Must have no-argument constructor
	public Student() {

	}

	public Student(int id, String fname, String lname, String email,
			String loginAd, String country) {
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
		this.loginAD = loginAd;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginAD() {
		return loginAD;
	}

	public void setLoginAD(String loginAD) {
		this.loginAD = loginAD;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return new StringBuffer(" ID : ").append(this.id)
				.append(" First Name : ").append(this.firstName)
				.append(" Last Name : ").append(this.lastName)
				.append(" Email : ").append(this.email).append(" LoginAD : ")
				.append(this.loginAD).append(" Country : ")
				.append(this.country).toString();
	}

}
