import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class TextboxExample extends Application{
	public void start(Stage primaryStage){
		TextField inputField = new TextField();
		TextField outputField = new TextField();
		
		outputField.setEditable(false);
		
		Button SubmitButton = new Button("Submit");
		
		SubmitButton.setOnAction(e -> {
		String text = inputField.getText();
		outputField.setText(text);})
	
		VBox layout = new VBox(10, inputField, outputField, SubmitButton);
		Scene scene = new Scene(layout, 300,200);
		
		primaryStage.setTitle("Check This Out!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args){
		launch(args);
	}
}
		