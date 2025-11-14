package com.pro.configuration;

import java.util.logging.Logger;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

public class MenuBarConfiguration {
	private static final Logger logger = Logger.getLogger(MenuBarConfiguration.class.getName());
	private Stage stage;
	private MenuBar menuBar;
	private SeparatorMenuItem separator;

	public MenuBarConfiguration(Stage stage) {
		logger.info("----- MenuBarConfiguration | Constructor -----");
		this.stage = stage;
		init();
	}

	private void init() {
		logger.info("----- MenuBarConfiguration | init -----");
		menuBar = new MenuBar();
		separator = new SeparatorMenuItem();

		Menu menuFile = createFileMenu();
		Menu menuEdit = createEditMenu();

		menuBar.getMenus().addAll(menuFile, menuEdit);
		menuBar.getStylesheets().add(getClass().getResource("configuration.css").toExternalForm());
	}

	private Menu createFileMenu() {
		MenuItem menuItemHome = new MenuItem("Home");
		menuItemHome.setOnAction(e -> showNewAction("Home"));

		MenuItem menuItemNew = new MenuItem("New");
		menuItemNew.setOnAction(e -> showNewAction("New"));

		MenuItem menuItemOpen = new MenuItem("Open");
		menuItemOpen.setOnAction(e -> showNewAction("Open"));

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

	private void showNewAction(String locale) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Ação "+ locale);
		alert.setHeaderText(locale);
		alert.setContentText("Você clicou em " + locale);
		alert.showAndWait(); // Exibe o popup até o usuário fechar
	}
}