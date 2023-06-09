package controle;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    	try {
	    	Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
	        Scene scene = new Scene(parent);
	        stage.setScene(scene);
	        stage.show();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    public static void main(String[] args) {
        launch(args);
    }
}
