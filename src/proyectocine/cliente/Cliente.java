/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.cliente;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectocine.model.Notificacion;
import proyectocine.model.Usuario;
import proyectocine.util.Util;

/**
 *
 * @author jmora
 */
public class Cliente extends Thread {

    protected static String SERVER_IP;
    protected static int SERVER_PORT = 2356;
    protected ObjectOutputStream out;
    protected ObjectInputStream in;
    protected Socket socket;
    private MainCliente application;

    /**
     * Declara un nuevo cliente. Crea la conexion con el servidor y define los
     * streams
     *
     * @param application Recibe la aplicación principal para interactuar con el
     * usuario
     */
    public Cliente(MainCliente application) {
        this.application = application;

        try {
            System.out.println(SERVER_IP);
            if (SERVER_IP.equals("localhost")) {
                socket = new Socket(InetAddress.getLocalHost(), SERVER_PORT);
            } else {
                socket = new Socket(SERVER_IP, SERVER_PORT);
            }
            createStream();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
            //TODO Arreglar notificacion
            //JOptionPane.showInputDialog(this, "No se ha podido conectarse con el servidor", "Error al conectarse con el servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Recibe un dato de entrada
                String entrada = in.readUTF();
                System.out.println(entrada);
                String[] datos = entrada.split(";"); // Divide los datos de la entrada en cada ';'

                switch (Notificacion.convertirValor(Integer.parseInt(datos[0]))) {
                    case CREA_USUARIO_RESULTADO:
                        break;
                    case INICIA_SESION_RESULTADO:
                        break;
                    case ENVIA_RESERVACIONES:
                        break;
                    case ENVIA_PELICULA:
                        break;
                    case ENVIA_HORARIOS:
                        break;
                    case ENVIA_COMIDA:
                        break;
                    case RESERVACION_COMPLETADA:
                        break;
                    default:
                        break;
                }
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Metodos de TCP
    private void createStream() {
        try {
            in = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearUsuario(Usuario usuario) {
        Gson gson = Util.getGson();

        try {
            System.out.println("Creando usuario");
            System.out.println(gson.toJson(usuario));
            out.writeUTF(Notificacion.CREA_USUARIO.getValor() + ";" + gson.toJson(usuario));
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // GETTERS & SETTERS
    /**
     *
     * @return SERVER_IP
     */
    public static String getSERVER_IP() {
        return SERVER_IP;
    }

    /**
     *
     * @param SERVER_IP
     */
    public static void setSERVER_IP(String SERVER_IP) {
        Cliente.SERVER_IP = SERVER_IP;
    }
}
