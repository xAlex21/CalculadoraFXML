package dad.calculadora;

import java.net.URL;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private CalculadoraController controller;

	@Override
	public void start(Stage stage) throws Exception {

		controller = new CalculadoraController();

		stage.setScene(new Scene(controller.getView()));
		stage.setTitle("CalculadoraFXML");
		stage.sizeToScene();
		stage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}