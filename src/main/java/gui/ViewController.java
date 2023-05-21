package gui;

import java.util.Locale;

import dominio.Pergunta;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import servicoPergunta.ServicoPergunta;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	@FXML
	private TextField txtEnunciado;
	@FXML
	private Button btSalvar;
	
	@FXML
	public void onBtSalvarAction() {
		try {
			Locale.setDefault(Locale.US);
			Pergunta pergunta = new Pergunta(txtEnunciado.getText());
			ServicoPergunta.salvar(pergunta);
		} catch(Exception e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}

}
