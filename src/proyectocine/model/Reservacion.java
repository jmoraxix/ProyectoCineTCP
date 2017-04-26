/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.model;

/**
 *
 * @author jmora
 */
public class Reservacion {

    private Pelicula pelicula;
    private Tanda tanda;

    public Reservacion() {
    }

    public Reservacion(Pelicula pelicula, Tanda tanda) {
        this.pelicula = pelicula;
        this.tanda = tanda;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Tanda getTanda() {
        return tanda;
    }

    public void setTanda(Tanda tanda) {
        this.tanda = tanda;
    }

}
