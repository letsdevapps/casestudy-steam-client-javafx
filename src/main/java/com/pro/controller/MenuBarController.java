package com.pro.controller;

import java.util.logging.Logger;

import com.pro.scene.HomeScene;
import com.pro.scene.NewScene;
import com.pro.scene.OpenScene;

import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

public class MenuBarController {
	private static final Logger logger = Logger.getLogger(MenuBarController.class.getName());
	private Stage stage;
	private MenuBar menuBar;

	public MenuBarController(Stage primaryStage, MenuBar menuBar) {
		logger.info("----- MenuBarController | Constructor -----");
		this.stage = primaryStage;
		this.menuBar = menuBar;
		primaryStage.show();
	}

	public void changeToHomeScene() {
		stage.setScene(new HomeScene(stage, menuBar).getScene());
	}

	public void changeToNewScene() {
		stage.setScene(new NewScene(stage, menuBar).getScene());
	}

	public void changeToOpenScene() {
		stage.setScene(new OpenScene(stage, menuBar).getScene());
	}
}