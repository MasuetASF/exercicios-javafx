package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoA.setOnAction(e -> {System.out.println("A");});
		botaoB.setOnAction(e -> {System.out.println("B");});
		botaoC.setOnAction(e -> {System.exit(0);});
		
		
		HBox box = new HBox();
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene Unicacena = new Scene(box, 150, 200);		
		
		primaryStage.setScene(Unicacena);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
}
