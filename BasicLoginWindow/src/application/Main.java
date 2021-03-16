package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class Main extends Application {
	
	Stage window;
	
	
	public static void main(String[] args) {
		launch(args);
	
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("My Stage");
		
	
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		//Create Account Button
		Button createAccountButton = new Button("Create Account");
		createAccountButton.setOnAction( e -> CreateAccount.createStage());
		
		GridPane.setConstraints(createAccountButton, 14, 25);
		
		Button loginButton = new Button("Login");
		loginButton.setOnAction( e -> Login.loginStage());
		
		GridPane.setConstraints(loginButton, 14, 26);
		
		grid.getChildren().addAll(createAccountButton, loginButton);
		
		Scene scene = new Scene(grid, 400, 500);
		window.setScene(scene);
		window.show();
		
		
	}
	
	

}














