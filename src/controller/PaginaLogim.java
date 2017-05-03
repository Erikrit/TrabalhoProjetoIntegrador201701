package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class PaginaLogim implements Initializable{

	
	
	@FXML
	private TextField txtUsuario;
	@FXML
	private TextField txtSenha;
	@FXML
	private Button btnAvancar;
	@FXML
	private Button btnFechar;
	@FXML
	private Pane panel;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	public void Fechar(){
		
	}
	public void avancar() {
		
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/View/PaginaPrincipal.fxml");
			Parent fxmlParent;
			try {
				fxmlParent = FXMLLoader.load(arquivoFXML);
				panel.getChildren().clear();
				panel.getChildren().add(fxmlParent);
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
	
	}
		
		
	
	
	

