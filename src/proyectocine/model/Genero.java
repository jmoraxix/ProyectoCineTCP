/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ulacit
 */
public enum Genero {
    ACCION("Accion"),
    COMEDIA("Comedia"),
    TERROR("Terror"),
    SUSPENSO("Suspenso"),
    AVENTURA("Aventura"),
    ANIMADO("Animado"),
    ROMANTICO("Romantico");

    private final String titulo;

    private Genero(final String titulo) {
        this.titulo = titulo;
    }

    public static Genero getGenero(String strGenero) {
        List<Genero> listaGeneros = Arrays.asList(Genero.values());
        return listaGeneros.stream().filter(g -> strGenero.equals(g.toString())).collect(Collectors.toList()).get(0);
    }

    @Override
    public String toString() {
        return titulo;
    }
}
