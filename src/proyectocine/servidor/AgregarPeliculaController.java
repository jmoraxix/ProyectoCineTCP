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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import proyectocine.model.Clasificacion;
import proyectocine.model.Genero;
import proyectocine.model.Pelicula;
import proyectocine.model.Tanda;
import proyectocine.util.Util;

/**
 * FXML Controller class
 *
 * @author jmora
 */
public class AgregarPeliculaController implements Initializable {

    //Declaracion de componentes de la ventana
    @FXML
    private ComboBox cmbGenero, cmbClasificacion, cmbSalas;
    @FXML
    private TextField txtTitulo, txtDuracion, txtDia, txtHora;
    @FXML
    private TableView tablaTandas;
    @FXML
    private TableColumn colSala, colDia, colHora;

    private final ObservableList<Tanda> tandas = FXCollections.observableArrayList();
    private String selectedGenero = "";
    private String selectedClasificacion = "";
    private String selectedSala = "";

    private MainServidor application;

    public void setApp(MainServidor application) {
        this.application = application;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Setup comboboxes
        cmbGenero.getItems().addAll(Arrays.asList(Genero.values()));
//        cmbGenero.valueProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue ov, String t, String t1) {
//                selectedGenero = t1;
//            }
//        });
        cmbClasificacion.getItems().addAll(Arrays.asList(Clasificacion.values()));
//        cmbClasificacion.valueProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue ov, String t, String t1) {
//                selectedClasificacion = t1;
//            }
//        });

        cmbSalas.getItems().addAll(Util.getIDsSalas());
        cmbSalas.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String t, String t1) {
                selectedSala = t1;
            }
        });

        //Setup table columns
        tablaTandas.setItems(tandas);
        colSala.setCellValueFactory(
                new PropertyValueFactory<Tanda, Integer>("sala"));
        colDia.setCellValueFactory(
                new PropertyValueFactory<Tanda, String>("dia"));
        colHora.setCellValueFactory(
                new PropertyValueFactory<Tanda, String>("hora"));
    }

    @FXML
    public void guardarPelicula(ActionEvent event) {
        if (isInformationFilled()) {
            Pelicula pelicula = new Pelicula(txtTitulo.getText(),
                    Integer.valueOf(txtDuracion.getText()),
                    Genero.getGenero(cmbGenero.getValue().toString()),
                    Clasificacion.getClasificacion(cmbClasificacion.getValue().toString()));
            tandas.forEach(tanda -> pelicula.addTanda(tanda));
        } else {
            application.showNotification();
        }
    }

    @FXML
    public void cancelarPelicula(ActionEvent event) {
        application.gotoPeliculas();
    }

    @FXML
    public void agregarTanda(ActionEvent event) {
//        tandas.add(new Tanda(
//                Util.getSalas().get(Integer.valueOf(selectedSala))),
//                txtDia.getText(),
//                txtHora.getText());
    }

    private boolean isInformationFilled() {
        return !txtTitulo.getText().isEmpty()
                && txtDuracion.getText().isEmpty()
                && cmbGenero.getValue() != null
                && !cmbGenero.getValue().toString().isEmpty()
                && cmbClasificacion.getValue() != null
                && !cmbClasificacion.getValue().toString().isEmpty();
    }
}
