package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class CadastraEquipamento implements Initializable {
	
	@FXML
	private TextField txtTipo;
	
	@FXML
	private TextField txtMarca;
	
	@FXML
	private TextField txtModelo;
	
	@FXML
	private Pane painelPrincipal;
	
	@FXML
	private TextArea txtareaDescricao;
	
	@FXML
	private Button btnSalvar;
	
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
	
	
			public void btnSalvar(){
		
	}

}
