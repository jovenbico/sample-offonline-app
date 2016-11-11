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

	private LoginBean loginBean = new LoginBean();

	@FXML
	private TextField usernameText;

	@FXML
	private PasswordField passwordText;

	@FXML
	private Button loginBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		usernameText.textProperty().bindBidirectional(loginBean.getUsername());
		passwordText.textProperty().bindBidirectional(loginBean.getPassword());

		loginBtn.setOnAction(event -> {
			System.out.println(loginBean.getModel().toString());

			MainStageManager.getInstance().change(getClass().getResource("../home/HomeView.fxml"));

		});

	}

}
