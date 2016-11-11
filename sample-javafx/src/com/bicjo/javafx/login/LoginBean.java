package com.bicjo.javafx.login;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginBean {

	private StringProperty username;
	private StringProperty password;

	public LoginBean() {
		username = new SimpleStringProperty(this, "username");
		password = new SimpleStringProperty(this, "password");
	}

	public LoginModel getModel() {
		LoginModel bean = new LoginModel();
		bean.setUsername(username.getValue());
		bean.setPassword(password.getValue());
		return bean;
	}

	public StringProperty getUsername() {
		return username;
	}

	public StringProperty getPassword() {
		return password;
	}

}
