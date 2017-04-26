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

    public static Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
//        gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());
        return gsonBuilder.create();
    }

    //Variables globales de la aplicación
    public static Usuario CURRENT_USER = null;
}

//class DepartmentInstanceCreator implements InstanceCreator<Reservacion> {
//
//    public Reservacion createInstance(Type type) {
//        return new Reservacion();
//    }
//}
