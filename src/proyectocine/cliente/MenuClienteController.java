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
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author jmora
 */
public class MenuClienteController implements Initializable {

    @FXML
    private ImageView btnPeliculas;
    @FXML
    private ImageView btnSalas;
    @FXML
    private ImageView btnComida;
    @FXML
    private ImageView btnReservaciones;

    private MainCliente application;

    public void setApp(MainCliente application) {
        this.application = application;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
