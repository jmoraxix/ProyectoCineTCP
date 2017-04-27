/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.cliente;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import proyectocine.model.Clasificacion;
import proyectocine.model.Genero;

/**
 * FXML Controller class
 *
 * @author jmora
 */
public class VerPeliculasController implements Initializable {

    //Declaracion de componentes de la ventana
    @FXML
    private ComboBox cmbPeliculas, cmbGenero, cmbClasificacion;
    @FXML
    private TextField txtTitulo;
    @FXML
    private ScrollPane scrollPane;

    private MainCliente application;

    public void setApp(MainCliente application) {
        this.application = application;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        application.getCliente().pedirPeliculas();

        cmbGenero.getItems().addAll(Arrays.asList(Genero.values()));
        cmbClasificacion.getItems().addAll(Arrays.asList(Clasificacion.values()));
    }

    @FXML
    public void goBack(ActionEvent event) {
        application.gotoMenu();
    }

    @FXML
    public void irReservarPelicula(ActionEvent event) {

    }
}
