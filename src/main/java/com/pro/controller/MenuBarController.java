package com.pro.controller;

import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuBarController {

	private Stage stage;
	private Scene scene;
	private MenuBar menuBar;

	public MenuBarController() {
		init();
	}

	private void init() {
		stage.show();
	}

	public void navigateToHome() {
		stage.setScene(new Scene(new Pane(), 800, 600));
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}
}