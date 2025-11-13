package com.pro;

import java.util.logging.Logger;

import com.pro.configuration.MenuBarConfiguration;
import com.pro.controller.MenuBarController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
			
			Button btn = new Button("Clique aqui");
			btn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.setBottom(btn);

			Label label = new Label("Case Study Steam Client JavaFX");
			root.setCenter(label);
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			scene.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
//			scene.getStylesheets().add(getClass().getResource("buttons.css").toExternalForm());
//			scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
			
			MenuBarConfiguration menuBarConfiguration = new MenuBarConfiguration(primaryStage);
			root.setTop(menuBarConfiguration.getMenuBar());

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