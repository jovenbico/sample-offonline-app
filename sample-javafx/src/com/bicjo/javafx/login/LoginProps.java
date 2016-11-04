package com.bicjo.javafx.login;

import javafx.beans.property.StringProperty;
import javafx.beans.property.adapter.JavaBeanStringPropertyBuilder;

public class LoginProps {

	private LoginBean bean = new LoginBean();

	private StringProperty usernameProp;
	private StringProperty passwordProp;

	public LoginProps() {
		try {
			usernameProp = JavaBeanStringPropertyBuilder.create().bean(bean).name("username").build();
			passwordProp = JavaBeanStringPropertyBuilder.create().bean(bean).name("password").build();
		} catch (NoSuchMethodException e) {
			System.err.println(e.getMessage());
		}
	}

	public LoginBean getBean() {
		return bean;
	}

	public StringProperty getUsernameProp() {
		return usernameProp;
	}

	public StringProperty getPasswordProp() {
		return passwordProp;
	}

}
