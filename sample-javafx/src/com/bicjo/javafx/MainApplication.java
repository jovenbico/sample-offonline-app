package com.bicjo.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {

	public static void main(String[] args) {
		Application.launch(MainApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		MainStageManager.getInstance().initialize(stage).change(getClass().getResource("login/LoginView.fxml"));

	}

}
