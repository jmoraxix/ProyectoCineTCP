/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.servidor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import proyectocine.util.Util;

/**
 *
 * @author jmora
 */
public class Servidor extends Application {

//    //Variables de TCP
//    private static int SERVER_PORT = 2356;
//    private ServerSocket serverSocket;
//    private Socket socket;
//    private ExecutorService service;
//    private ListaEnlazadaClientes clientes;
//
//    //Variables para manejo de la interfaz
//    private String txtLog = new String();
//
//    /**
//     * Creates new form Servidor
//     */
//    public Servidor() {
//        new GenerarValores(this);
//        initComponents();
//
//        //Inicializa la lista enlazada para almacenar clientes
//        clientes = new ListaEnlazadaClientes();
//        txtCajaLog.setText(txtLog);
//
//        try {
//            agregarLog("Inicia servidor");
//            //System.out.println("Inicia servidor");
//            service = Executors.newCachedThreadPool();
//            serverSocket = new ServerSocket(SERVER_PORT);
//            service.submit(this);
//        } catch (IOException ex) {
//            agregarError(ex.toString());
//            //Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
////        new Thread(this);
//    }
//
//    @Override
//    public void run() {
//        agregarClientes();
//    }
//
//    private void agregarClientes() {
//        try {
//            while (true) {
//                socket = serverSocket.accept();
//                agregarLog("Cliente entrante");
//                //System.out.println("Cliente entrante");
//                ClienteServidor client = new ClienteServidor(this, socket);
//                service.submit(client);
//                this.clientes.insertarCliente(client);
//                agregarLog("Cliente agregado");
//                //System.out.println("Cliente agregado");
//            }
//        } catch (IOException ex) {
//            agregarError(ex.toString());
//            //Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    //Metodos de TCP
//    /**
//     * Envia una notificacion de actualizacion de cola a todos los clientes
//     *
//     * @param notificacion Tipo de notificacion
//     * @param cantidad Nueva cantidad de personas en la cola
//     */
//    public void notificarCambioCola(Notificacion notificacion, final String cantidad) {
//        clientes.notificarCambioCola(notificacion, cantidad);
//    }
//
//    public void notificarUsuarioAMonitores(String secuencia, Persona persona, final String caja) {
//        clientes.notificarUsuarioAMonitores(secuencia, persona, caja);
//    }
//
//    public synchronized String insertarUsuarioEnCola(String idCola, Persona persona) {
//        return arbol.insertarUsuario(idCola, persona);
//    }
//
//    public synchronized NodoColaSecuencias siguienteUsuario() {
//        return arbol.siguienteUsuario();
//    }
//
//    //Metodos para manejo de la interfaz
//    /**
//     * Agrega un log a la consola y/o interfaz
//     *
//     * @param msj Mensaje a mostrar
//     */
//    public synchronized void agregarLog(String msj) {
//        Date fecha = new Date(System.currentTimeMillis());
//        this.txtLog = fecha.toString() + " - " + msj + "\n" + txtLog;
//        this.txtCajaLog.setText(txtLog);
//        //System.out.println(fecha.toString() + " - " + msj + "\n");
//    }
//
//    /**
//     *
//     * @param msj
//     */
//    public synchronized void agregarError(String msj) {
//        Date fecha = new Date(System.currentTimeMillis());
//        this.txtLog = fecha.toString() + " - " + "ERROR: " + msj + "\n" + txtLog;
//        this.txtCajaLog.setText(txtLog);
//        //System.out.println(fecha.toString() + " - " + "ERROR: " + msj + "\n");
//    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuServidorFXML.fxml"));

        Scene scene = new Scene(root, Util.WIDTH, Util.HEIGHT);
        stage.setTitle("Servidor Cine");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
