package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if (contador > 0) {
			label.getStyleClass().add("verde");
		}else if(contador < 0) {
			label.getStyleClass().add("vermelho");
		}
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Label labelTitulo = new Label("Contador");
		//inserindo a classe CSS "titulo" na Vbox
		labelTitulo.getStyleClass().add("titulo");
		
		
		Label labelNumero = new Label("0");
		//inserindo a classe CSS "numero" na Vbox
		labelNumero.getStyleClass().add("numero");
		
		
		Button botaoDecremento = new Button("-");
		//inserindo a classe CSS "botoes" na Vbox
		botaoDecremento.getStyleClass().add("botoes");
		
		//aplicando o decremento via lambda
		botaoDecremento.setOnAction(e ->{
			contador --;
			atualizarLabelNumero(labelNumero);
			
		});
		
		Button botaoIncremento = new Button("+");
		//inserindo a classe CSS "botoes" na Vbox
		botaoIncremento.getStyleClass().add("botoes");
		
		//aplicando o incremento via lambda
		botaoIncremento.setOnAction(e ->{
			contador ++;
			atualizarLabelNumero(labelNumero);
			
			
		});
		
		
		//configurando botoes de incremento e decremento
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox BoxConteudo = new VBox();
		
		//inserindo a classe CSS na Vbox
		BoxConteudo.getStyleClass().add("conteudo");
		
		BoxConteudo.setSpacing(10);
		BoxConteudo.setAlignment(Pos.CENTER);
		BoxConteudo.getChildren().add(labelTitulo);
		BoxConteudo.getChildren().add(labelNumero);	
		BoxConteudo.getChildren().add(boxBotoes);
		
		
		//importando arquivo CSS para o JavaFX
		String caminhoDoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		
		Scene cenaPrincipal = new Scene(BoxConteudo, 400 ,400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	
	
	
	
	
	
	}
}
