module uy.edu.um.clientjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens uy.edu.um.clientjavafx to javafx.fxml;
    exports uy.edu.um.clientjavafx;
}