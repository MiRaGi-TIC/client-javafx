package um.edu.uy.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

@Component
public class Registro implements Initializable {

    @FXML
    private Button botonCrearCuenta;

    @FXML
    private ChoiceBox<String> choiceBoxTipoUsuario;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordVerification;

    @FXML
    private Label textoBienvenida;

    @FXML
    private TextField username;

    @FXML
    void crearCuenta(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<String> userTypes = new ArrayList<>();
        userTypes.add("Cliente");userTypes.add("Aeropuerto");userTypes.add("Aerolinea");
        ObservableList<String> list = FXCollections.observableArrayList(userTypes);
        choiceBoxTipoUsuario.setItems(list);
    }
}
