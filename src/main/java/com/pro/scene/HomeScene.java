package com.pro.scene;

import java.util.logging.Logger;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HomeScene {
	private static final Logger logger = Logger.getLogger(HomeScene.class.getName());

	private Stage primaryStage;
	private MenuBar menuBar;
	private Scene scene;

	public HomeScene(Stage primaryStage, MenuBar menuBar) {
		logger.info("----- HomeScene | Constructor -----");
		this.primaryStage = primaryStage;
		this.menuBar = menuBar;
		init();
	}

	private void init() {
		logger.info("----- HomeScene | init -----");
		Label mainLabel = new Label("HOME SCENE!");

		BorderPane pane = new BorderPane();
		pane.setTop(menuBar);
		pane.setCenter(mainLabel);

		scene = new Scene(pane, 400, 400);

		primaryStage.setTitle("Home Title88");
	}

//	public Parent getPanel() {
//		BorderPane pane = new BorderPane();
//		pane.setTop(menuBar);
//		pane.setCenter(new Label("HOME SCENE3333333333!"));
//		return pane;
//	}

	public Scene getScene() {
		return scene;
	}

	public void changeToScene() {
		primaryStage.setScene(scene);
	}
}
