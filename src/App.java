import java.net.URL;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private CalculadoraController controller = new CalculadoraController();
	
  @Override
  public void start(Stage stage) throws Exception {
	  
    URL fxml = getClass().getClassLoader()
                 .getResource("View.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxml);
    stage.setScene(new Scene(fxmlLoader.load()));
    stage.setTitle("CalculadoraFXML");
    stage.sizeToScene();
    stage.show();
    
    

  }
  
  public static void main(String[] args) {
      launch();
  }

}