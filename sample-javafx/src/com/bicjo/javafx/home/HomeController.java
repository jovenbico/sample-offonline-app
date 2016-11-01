package com.bicjo.javafx.home;

import java.net.URL;
import java.util.ResourceBundle;

import com.bicjo.javafx.MainStageManager;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class HomeController implements Initializable {

	@FXML
	private Button backBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("home-controller initialize");

		backBtn.setOnAction(event -> {
			MainStageManager.getInstance().change(getClass().getResource("../login/LoginView.fxml"));
		});
	}

}
