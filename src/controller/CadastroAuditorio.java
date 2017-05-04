package controller;

import DAO.BlocoDao;
import Model.CadastroBloco;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CadastroAuditorio implements Initializable{

	@FXML
	private Pane painelPrincipal;
	
	
	@FXML
	private TextField txtNumero;

	@FXML
	private TextField txtCapacidade;
	
	@FXML
	private ComboBox<String> comboBloco;
	
	@FXML
	private ComboBox<String> comboUnidade;
	
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnCancelar;
	@FXML
	private javafx.scene.control.TextArea txtareaDescricao;

	BlocoDao blocos = new BlocoDao ();
	CadastroBloco blocoM =  new CadastroBloco();
	public CadastroAuditorio() throws SQLException {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		preencherComboUnidade();
		preencherComboBloco();
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

	public void preencherComboUnidade(){
		comboUnidade.getItems().add("Faculdade Alves Faria Bueno");
		comboUnidade.getItems().add("Faculdade Alves Faria Perimetral");
		comboUnidade.getItems().add("Faculdade Alves Faria SSP");
	}
	public void preencherComboBloco(){

		List<CadastroBloco> bL = new ArrayList<CadastroBloco>();
		bL=blocos.listarClientes();

		if(bL.isEmpty()){

			String teste = "";
		teste = blocoM.getNome();
		comboBloco.getItems().add(teste);
}
	}



		}



