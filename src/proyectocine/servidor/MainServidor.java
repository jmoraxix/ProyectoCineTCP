/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.servidor;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import proyectocine.model.Usuario;
import proyectocine.util.Util;

/**
 * MainServidor Application. This class handles navigation and user session.
 */
public class MainServidor extends Application {

    private Stage stage;
    private final double WINDOW_WIDTH = Util.WIDTH;
    private final double WINDOW_HEIGHT = Util.HEIGHT;

    //Variables de la aplicacion del servidor.
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(MainServidor.class, (java.lang.String[]) null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            stage.setTitle("Cine");
            stage.setMinWidth(WINDOW_WIDTH);
            stage.setMinHeight(WINDOW_HEIGHT);
            gotoMenu();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(MainServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario getLoggedUser() {
        return Util.CURRENT_USER;
    }

    public boolean iniciarSesion(Usuario usuario) {
        List<Usuario> usuariosEncontrados = usuarios.stream().filter(u -> u.getUsuario().equals(usuario.getUsuario())).collect(Collectors.toList());
        if (usuariosEncontrados.size() == 1) {
            Util.CURRENT_USER = usuario;
            return true;
        } else {
            return false;
        }
    }

    void userLogout() {
//        loggedUser = null;
//        gotoLogin();
    }

    private void gotoMenu() {
        try {
            MenuServidorController menu = (MenuServidorController) replaceSceneContent("MenuServidor.fxml");
            menu.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(MainServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoSalas() {
        try {
            SalasController salas = (SalasController) replaceSceneContent("Salas.fxml");
            salas.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(MainServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = MainServidor.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(MainServidor.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
