package com.pro.scene;

import java.util.logging.Logger;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NewScene {
	private static final Logger logger = Logger.getLogger(HomeScene.class.getName());

	private Stage primaryStage;
	private MenuBar menuBar;
	private Scene scene;

	public NewScene(Stage primaryStage, MenuBar menuBar) {
		logger.info("----- NewScene | Constructor -----");
		this.primaryStage = primaryStage;
		this.menuBar = menuBar;
		init();
	}

	private void init() {
		logger.info("----- NewScene | init -----");
		Label mainLabel = new Label("NEW SCENE!");

		BorderPane pane = new BorderPane();
		pane.setTop(menuBar);
		pane.setCenter(mainLabel);

		scene = new Scene(pane, 400, 400);

//		primaryStage.setTitle("New Title");
	}

	public Scene getScene() {
		return scene;
	}

	public void changeToScene() {
		primaryStage.setScene(scene);
	}
}
