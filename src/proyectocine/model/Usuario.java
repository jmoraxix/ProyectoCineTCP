/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.model;

import java.util.ArrayList;

/**
 *
 * @author jmora
 */
public class Usuario {

    //Variables
    private String usuario;
    private String passwd;
    private ArrayList<Reservacion> reservaciones = new ArrayList<>();

    //Constructor
    public Usuario(String usuario, String passwd) {
        this.usuario = usuario;
        this.passwd = passwd;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public ArrayList<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void addReservacion(Reservacion reservacion) {
        this.reservaciones.add(reservacion);
    }

}
