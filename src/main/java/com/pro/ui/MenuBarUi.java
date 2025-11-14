package com.pro.ui;

import java.util.logging.Logger;

import com.pro.controller.MenuBarController;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

public class MenuBarUi {
	private static final Logger logger = Logger.getLogger(MenuBarUi.class.getName());
	private Stage stage;
	private MenuBar menuBar;
	private SeparatorMenuItem separator;
	private MenuBarController menuBarController;

	public MenuBarUi(Stage stage) {
		logger.info("----- MenuBarConfiguration | Constructor -----");
		this.stage = stage;
		init();
	}

	private void init() {
		logger.info("----- MenuBarConfiguration | init -----");
		this.menuBar = new MenuBar();
		this.separator = new SeparatorMenuItem();
		this.menuBarController = new MenuBarController(stage, menuBar);

		Menu menuFile = createFileMenu();
		Menu menuEdit = createEditMenu();

		menuBar.getMenus().addAll(menuFile, menuEdit);
		menuBar.getStylesheets().add(getClass().getResource("menubarui.css").toExternalForm());
	}

	private Menu createFileMenu() {
		MenuItem menuItemHome = new MenuItem("Home");
//		menuItemHome.setOnAction(e -> showNewAction("Home"));
//		menuItemHome.setOnAction(e -> new MenuBarController(stage, menuBar).changeToHomeScene());
		menuItemHome.setOnAction(e -> menuBarController.changeToHomeScene());

		MenuItem menuItemNew = new MenuItem("New");
//		menuItemNew.setOnAction(e -> showNewAction("New"));
//		menuItemNew.setOnAction(e -> new NewScene(stage, menuBar).changeToScene());
		menuItemNew.setOnAction(e -> menuBarController.changeToNewScene());

		MenuItem menuItemOpen = new MenuItem("Open");
//		menuItemOpen.setOnAction(e -> showNewAction("Open"));
//		menuItemOpen.setOnAction(e -> new OpenScene(stage, menuBar).changeToScene());
		menuItemOpen.setOnAction(e -> menuBarController.changeToOpenScene());

		MenuItem menuItemExit = new MenuItem("Exit");
		menuItemExit.setOnAction(e -> stage.close());

		Menu menuFile = new Menu("File");
		menuFile.getItems().addAll(menuItemHome, menuItemNew, menuItemOpen, separator, menuItemExit);
		return menuFile;
	}

	private Menu createEditMenu() {
		Menu menuEdit = new Menu("Edit");
		return menuEdit;
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

//	private void showNewAction(String locale) {
//		Alert alert = new Alert(AlertType.INFORMATION);
//		alert.setTitle("Ação " + locale);
//		alert.setHeaderText(locale);
//		alert.setContentText("Você clicou em " + locale);
//		alert.showAndWait(); // Exibe o popup até o usuário fechar
//	}
}