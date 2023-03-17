package fxml;

import org.controlsfx.control.Notifications;


import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@123.com.br");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		if (senhaValida && emailValido) {
			Notifications.create()
				.position(Pos.CENTER)
				.title("Login FXML")
				.text("Login Efetuado com sucesso!")
				.showInformation();
		}else {
			Notifications.create()
			.position(Pos.CENTER)
			.title("Login FXML")
			.text("Usuario/Senha inválidos!")
			.showError();
		}
	}
}
