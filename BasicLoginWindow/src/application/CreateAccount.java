package application;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class CreateAccount {
	
	public static void createStage() {
		Stage window = new Stage();
		window.setTitle("Create Account");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		//Name Label
		Label firstNameLabel = new Label("First Name: ");
		GridPane.setConstraints(firstNameLabel, 0, 0);
		
		//First Name Input
		TextField firstNameInput = new TextField();
		firstNameInput.setPromptText("first name");
		GridPane.setConstraints(firstNameInput, 0, 1);
		
		//Last Name Label
		Label lastNameLabel = new Label("Last Name: ");
		GridPane.setConstraints(lastNameLabel, 1, 0);
		
		//Last Name Input
		TextField lastNameInput = new TextField();
		lastNameInput.setPromptText("last name");
		GridPane.setConstraints(lastNameInput, 1, 1);
		
		//UserName label
		Label usernameLabel = new Label("Create Username: ");
		GridPane.setConstraints(usernameLabel, 0, 3);
		
		//UserName Input
		TextField usernameInput = new TextField();
		usernameInput.setPromptText("username");
		GridPane.setConstraints(usernameInput, 0, 4);
		
		//Email Label
		Label emailLabel = new Label("Email: ");
		GridPane.setConstraints(emailLabel, 0, 6);
		
		//Email Input
		TextField emailInput = new TextField();
		emailInput.setPromptText("email");
		GridPane.setConstraints(emailInput, 0, 7);
		
		//Password
		Label passLabel = new Label("Create Password: ");
		GridPane.setConstraints(passLabel, 0, 9);
		
		//Password Input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 0, 10);
		
		Button createAccountButton = new Button("Create Account");
		
		
		GridPane.setConstraints(createAccountButton, 0, 11);
		
		grid.getChildren().addAll(firstNameLabel, firstNameInput, lastNameLabel, lastNameInput, usernameLabel, emailLabel, emailInput, usernameInput, passLabel, passInput, createAccountButton);
		
		Scene scene = new Scene(grid, 400, 500);
		window.setScene(scene);
		window.show();
	
	
	}
	
	
}
