/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.POJO;

/**
 *
 * @author ulacit
 */
public class Sala {
    
    //Variables
    private int iD;
    private int capacidad;

    //Constructor
    public Sala(int iD, int capacidad) {
        this.iD = iD;
        this.capacidad = capacidad;
    }

    //Getters & setters
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
