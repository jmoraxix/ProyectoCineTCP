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
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import proyectocine.model.Clasificacion;
import proyectocine.model.Genero;
import proyectocine.model.Tanda;

/**
 * FXML Controller class
 *
 * @author jmora
 */
public class AgregarPeliculaController implements Initializable {

    //Declaracion de componentes de la ventana
    @FXML
    private ComboBox cmbGenero, cmbClasificacion;
    @FXML
    private TextField txtTitulo, txtDuracion, txtSala, txtDia, txtHora;
    @FXML
    private Button btnAgregarTanda, btnGuardar;
    @FXML
    private TableView tablaTandas;
    @FXML
    private TableColumn colSala, colDia, colHora;

    private final ObservableList<Tanda> tandas = FXCollections.observableArrayList();

    private MainServidor application;

    public void setApp(MainServidor application) {
        this.application = application;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Setup comboboxes
        cmbGenero.getItems().addAll(Arrays.asList(Genero.values()));
        cmbClasificacion.getItems().addAll(Arrays.asList(Clasificacion.values()));

        //Setup table columns
        colSala.setCellValueFactory(
                new PropertyValueFactory<Tanda, String>("sala"));
        colSala.setCellValueFactory(
                new PropertyValueFactory<Tanda, String>("dia"));
        colSala.setCellValueFactory(
                new PropertyValueFactory<Tanda, String>("hora"));
    }

    @FXML
    public void guardarPelicula(ActionEvent event) {

    }

    @FXML
    public void cancelarPelicula(ActionEvent event) {
        application.gotoPeliculas();
    }

    @FXML
    public void agregarTanda(ActionEvent event) {
        Tanda tanda = new Tanda(txtSala.getText(), txtDia.getText(), txtHora.getText());
    }
}
