package com.bicjo.javafx.login;

public class LoginBean {

	private String username;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		StringBuffer sf = new StringBuffer("[LoginBean]");
		sf.append(" username:").append(username);
		sf.append(" password:").append(password);
		return sf.toString();
	}

}
