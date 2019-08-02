package com.es.eoi.shop.entities;

public class User {

	private String Dni;
	private String UserName;
	private String Email;
	private String Adress;

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		this.Adress = adress;
	}

}
