package com.pro.scene;

import java.util.logging.Logger;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class OpenScene {
	private static final Logger logger = Logger.getLogger(OpenScene.class.getName());

	private Stage primaryStage;
	private Scene scene;
	private MenuBar menuBar;
	private BorderPane pane;
	private Label mainLabel;

	public OpenScene(Stage primaryStage, MenuBar menuBar) {
		logger.info("----- OpenScene | Constructor -----");
		this.primaryStage = primaryStage;
		this.mainLabel = new Label("OpenScene");
		this.pane = new BorderPane();
		this.menuBar = menuBar;
		this.scene = new Scene(pane, 400, 400);
		init();
	}

	private void init() {
		logger.info("----- OpenScene | init -----");
		pane.setTop(menuBar);
		pane.setCenter(mainLabel);
	}

	public Scene getScene() {
		return scene;
	}

	public void changeToScene() {
		primaryStage.setScene(scene);
	}
}
