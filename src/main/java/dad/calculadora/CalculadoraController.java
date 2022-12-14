package dad.calculadora;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



public class CalculadoraController implements Initializable {


	
	private CalculadoraModel model = new CalculadoraModel();
	
	
    @FXML
    private TextField pantalla;
    
    @FXML
    private GridPane view;
	

    public CalculadoraController() throws IOException {

    	URL fxml = getClass().getResource("/fxml/View.fxml");
    	FXMLLoader fxmlLoader = new FXMLLoader(fxml);
    	fxmlLoader.setController(this);
    	fxmlLoader.load();
    	
	}
    
    public GridPane getView() {
		return view;
	}

    @FXML
    void borrar(ActionEvent event) {
    	
    	model.borrar();
    	actualizarPantalla();
    	
    }

    @FXML
    void borrarTodo(ActionEvent event) {
    	
    	model.borrarTodo();
    	actualizarPantalla();
    	
    }

    @FXML
    void insertar(ActionEvent event) {
    	
    	String[] parts = event.toString().split("'");
    	char introducido = (parts[1]).charAt(0);
    	model.insertar(introducido);
    	actualizarPantalla();
    	
    }

    @FXML
    void insertarComa(ActionEvent event) {
    	
    	model.insertarComa();
    	actualizarPantalla();
    	
    }

    @FXML
    void operar(ActionEvent event) {
    	
    	String[] parts = event.toString().split("'");
    	char introducido = (parts[1]).charAt(0);
    	model.operar(introducido);
    	actualizarPantalla();
    	
    }
    
    public void actualizarPantalla() {
    	
    	pantalla.setText(model.getPantalla());
    	
    }

	



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
