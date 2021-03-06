package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ReservarSala implements Initializable {
	@FXML
	private Pane painelPrincipal;
		
	@FXML
	private TextArea textAriaDescricao;
	
	@FXML
	private ComboBox<String> comboBloca;
	@FXML
	private ComboBox<String> comboTurma;
	@FXML
	private ComboBox<String> comboSala;
	@FXML
	private ComboBox<String>  comboUnidade;
	
	@FXML
	private DatePicker dateInicio;
	@FXML
	private DatePicker dateFim;
	
	@FXML
	private TextField horaIncio;

	@FXML
	private TextField horaFim;
	
	@FXML
	private Button btcSalvar;
	
	@FXML
	private Button btnCancelar;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public void btnCancelar(){
		
		URL arquivoFXML;
		arquivoFXML = getClass().getResource("/View/PaginaPrincipal.fxml");
		Parent fxmlParent;
		try {
			fxmlParent = FXMLLoader.load(arquivoFXML);
			painelPrincipal.getChildren().clear();
			painelPrincipal.getChildren().add(fxmlParent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	

	public void btcSalvar(){
		
	}
}
