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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class CancelarReservaAdm implements Initializable {
	@FXML
	private Pane painelPrincipal;
	@FXML
	private TextArea txtareaMotivo;
	
	@FXML
	private ComboBox<String> comboNome;
	@FXML
	private Button btnCancelarReserva;
	
	@FXML
	private Button btnCancelar;
	
	
	@FXML
	private TableView TabelaPrincipal;
	
	@FXML
	private TableColumn<CadastroUsuario, String> reservaCTebela;
	
	@FXML
	private TableColumn<CadastroUsuario, String> dataTabela;
	@FXML
	private TableColumn<CadastroUsuario, String> horarioTabela;
	@FXML
	private TableColumn<CadastroUsuario, String> periodoTabela;
	
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
	
	
	public void btnCancelarReserva(){
		
	}
}
