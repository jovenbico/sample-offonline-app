package com.bicjo.javafx.login;

import java.net.URL;
import java.util.ResourceBundle;

import com.bicjo.javafx.MainStageManager;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

	@FXML
	private TextField usernameText;

	@FXML
	private PasswordField passwordText;

	@FXML
	private Button loginBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("login-controller initialize");
		loginBtn.setOnAction(event -> {
			System.out.println(usernameText.getText() + " " + passwordText.getText());

			MainStageManager.getInstance().change(getClass().getResource("../home/HomeView.fxml"));

		});

	}

}
