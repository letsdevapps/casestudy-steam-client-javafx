package com.pro;

import java.util.logging.Logger;

import com.pro.ui.MenuBarUi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
//			btn.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			btn.setOnAction(e -> {
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("Título do Alerta");
	            alert.setHeaderText("Cabeçalho do Alerta");
	            alert.setContentText("Este é o conteúdo do alerta.");
	            alert.showAndWait();
	        });
			root.setBottom(btn);

			Label label = new Label("Case Study Steam Client JavaFX");
			root.setCenter(label);
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			scene.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
//			scene.getStylesheets().add(getClass().getResource("buttons.css").toExternalForm());
//			scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());

			MenuBarUi menuBarUi = new MenuBarUi(primaryStage);
			root.setTop(menuBarUi.getMenuBar());

			primaryStage.setTitle("Case Study Steam Client JavaFX");
			primaryStage.setScene(scene);
			primaryStage.setHeight(800);
			primaryStage.setWidth(800);
			primaryStage.centerOnScreen(); //centralizar a janela
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}