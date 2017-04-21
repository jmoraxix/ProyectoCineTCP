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
import java.util.Date;

/**
 *
 * @author ulacit
 */
public class Util {

    public static int WIDTH = 650;
    public static int HEIGHT = 550;

    private static Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
//        gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());
        return gsonBuilder.create();
    }
}
