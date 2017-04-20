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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author jmora
 */
public class MenuServidorFXMLController implements Initializable {

    @FXML
    private ImageView btnPeliculas;
    @FXML
    private ImageView btnSalas;
    @FXML
    private ImageView btnComida;
    @FXML
    private ImageView btnReservaciones;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnPeliculas.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)
                -> {
            System.out.println("btnPeliculas");
        });
        btnSalas.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)
                -> {
            System.out.println("btnSalas");
        });
        btnComida.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)
                -> {
            System.out.println("btnComida");
        });
        btnReservaciones.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e)
                -> {
            System.out.println("btnReservaciones");
        });
    }

}
