package com.jason;

import javafx.geometry.Pos;

import java.awt.event.ActionEvent;

//import com.teamdev.jxbrowser.chromium.Browser;
//import com.teamdev.jxbrowser.chromium.javafx.BrowserView;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainPage extends Application {
	
	Stage window;
	Scene scene1;
	Button btnStart;
	Button btnHelp;
	
	// Background Image
	private final Image backgroundImage = new Image("com/jason/resource/mainBackground.jpg");

	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Change scene name
		window = primaryStage;

		
		//Sets window title
			primaryStage.setTitle("Settlers of Catan");
		
		// Create new Game Instance
		Game game = new Game(primaryStage);
		
		// Create Buttons
		Button btnStart = new Button("Start Game");
		Button btnHelp = new Button("How to Play/Rules");
		
		// Create new Pane
		VBox vbox1 = new VBox();
		vbox1.getChildren().addAll(btnStart, btnHelp);
		
		//Group the buttons
		//Group buttonGroup = new Group();
		//buttonGroup.getChildren().addAll(btnStart, btnHelp);
		
		//Move buttons/grouping
		vbox1.setAlignment(Pos.CENTER);
		vbox1.setSpacing(20);
		

		// Set mainPane Background
		vbox1.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		
		// Place help and start buttons
		//mainPane.setBottom(btnStart);
		//mainPane.setTop(btnHelp);

		// Display start screen
		Scene scene = new Scene(vbox1, 600, 600);
		window.setScene(scene);
		window.show();
		
		
		
		//btnHelp.setOnMouseClicked(e ->{
			//Browser browser = new Browser();
			//BrowserView view = new BrowserView(browser);

			 

			Stage stage = new Stage();
			Pane pane = new HBox();
			//BorderPane aNewPane = new BorderPane(view);
			//Scene aNewScene = new Scene(aNewPane, 600, 600);
			//stage.setScene(aNewScene);
			//stage.show();
			
			//browser.loadURL("/com/jason/help.pdf");
			
			/*
			WebView browser = new WebView();
			WebEngine webEngine = browser.getEngine();

			webEngine.load(helpPDF);
			pane.getChildren().add(browser);
			Scene aScene = new Scene(pane);
			aScene.getStylesheets().add("webviewsample/BrowserToolbar.css");
			stage.setScene(aScene);
			stage.show();
			*/
			
		}
	

		
	
	{;
		//btnStart.setOnMouseClicked(e -> {
			//game.startGame();
		};
		

		
		
		
		
	}

