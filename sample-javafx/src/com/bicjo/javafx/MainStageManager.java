package com.bicjo.javafx;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainStageManager {

	private static MainStageManager INSTANCE;
	private Stage mainStage;

	private MainStageManager() {
	}

	public static MainStageManager getInstance() {

		if (INSTANCE == null)
			INSTANCE = new MainStageManager();

		return INSTANCE;
	}

	public MainStageManager initialize(Stage stage) {
		INSTANCE.mainStage = stage;
		return INSTANCE;
	}

	public void change(URL fxmlUrl) {
		try {

			Parent root = FXMLLoader.load(fxmlUrl);
			Scene scene = new Scene(root, 800, 600);

			mainStage.setTitle("Welcome");
			mainStage.setScene(scene);
			mainStage.show();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
