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
 * @author ulacit
 */
public class Pelicula {

    //Variables
    private String titulo;
    private int duracion;
    private Genero genero;
    private Clasificacion clasificacion;
    private ArrayList<Tanda> tandas = new ArrayList<>();

    //Constructor
    public Pelicula(String titulo, int duracion, Genero genero, Clasificacion clasificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    //Getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public ArrayList<Tanda> getTandas() {
        return tandas;
    }

    public void addTanda(Tanda tanda) {
        this.tandas.add(tanda);
    }

}
