/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.servidor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author jmora
 */
public class SalasController implements Initializable {

    //Declaracion de componentes de la ventana
    @FXML
    private ComboBox cmbSalas;
    @FXML
    private Label lblNumSala, lblCapacidadSala;
    @FXML
    private Button btnAgregarSala, btnQuitarCapacidad, btnAgregarCapacidad, btnEliminarSala, btnGuardar;

    private MainServidor application;

    public void setApp(MainServidor application) {
        this.application = application;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void actualizarSalas(ActionEvent event) {

    }

    @FXML
    public void agregarCapacidadASala(ActionEvent event) {

    }

    @FXML
    public void quitarCapacidadASala(ActionEvent event) {

    }

    @FXML
    public void guardarSala(ActionEvent event) {

    }

    @FXML
    public void agregarSala(ActionEvent event) {

    }

    @FXML
    public void eliminarSala(ActionEvent event) {

    }

}
