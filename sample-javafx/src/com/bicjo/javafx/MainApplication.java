package com.bicjo.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

	public static void main(String[] args) {
		Application.launch(MainApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("login/LoginView.fxml"));

		Scene scene = new Scene(root, 800, 600);

		stage.setTitle("Welcome");
		stage.setScene(scene);
		stage.show();

	}

}
