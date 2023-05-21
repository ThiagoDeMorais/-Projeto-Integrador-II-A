module ProjetoIntegradorFX {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires java.sql;

    opens controle to javafx.fxml;
    exports controle;
    
    opens gui to javafx.fxml;
    exports gui;
}
