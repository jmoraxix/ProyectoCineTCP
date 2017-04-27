/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import proyectocine.model.Pelicula;
import proyectocine.model.Sala;
import proyectocine.model.Usuario;

/**
 *
 * @author ulacit
 */
public class Util {

    //Variables de las ventanas
    public static int WIDTH = 650;
    public static int HEIGHT = 550;

    //Variables de TCP
    public static int SERVER_PORT = 2356;
    public static String SERVER_IP = "localhost";

    public static Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
//        gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());
        return gsonBuilder.create();
    }

    //Variables globales de la aplicación
    public static Usuario CURRENT_USER = null;
    public static ArrayList<Usuario> LISTA_USURIOS = new ArrayList<>();
    public static ArrayList<Pelicula> LISTA_PELICULAS = new ArrayList<>();
    public static ObservableList<Sala> LISTA_SALAS = FXCollections.observableArrayList();

    public static ObservableList<Sala> getSalas() {
        Util.LISTA_SALAS.add(new Sala(1, 50));
        Util.LISTA_SALAS.add(new Sala(2, 50));
        Util.LISTA_SALAS.add(new Sala(3, 75));
        Util.LISTA_SALAS.add(new Sala(4, 255));

        return Util.LISTA_SALAS;
    }

    public static ObservableList<String> getIDsSalas() {
        ObservableList<String> salas = FXCollections.observableArrayList();

        getSalas().forEach(sala -> salas.add(String.valueOf(sala.getiD())));

        System.out.println(salas);
        return salas;
    }

}

//class DepartmentInstanceCreator implements InstanceCreator<Reservacion> {
//
//    public Reservacion createInstance(Type type) {
//        return new Reservacion();
//    }
//}
