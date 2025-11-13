package com.pro;

import java.util.logging.Logger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
	private static final Logger logger = Logger.getLogger(App.class.getName());

	@Override
	public void start(Stage primaryStage) {
		try {
			logger.info("----- Main | start -----");

			BorderPane root = new BorderPane();

			Label label = new Label("Case Study Steam Client JavaFX");
			root.setCenter(label);
			Scene scene = new Scene(root, 400, 400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setTitle("Case Study Steam Client JavaFX");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}