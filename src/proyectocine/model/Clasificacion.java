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
public enum Clasificacion {
    TP("Todo publico"),
    STP("Todo publico, niños acompañados de un adulto"),
    E12("Mayores de 12 años"),
    E14("Mayores de 14 años"),
    E18("Mayores de 18 años");

    private final String clasificacion;

    private Clasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public static Clasificacion getClasificacion(String strClasificacion) {
        List<Clasificacion> listaClasificaciones = Arrays.asList(Clasificacion.values());
        return listaClasificaciones.stream().filter(g -> strClasificacion.equals(g.toString())).collect(Collectors.toList()).get(0);
    }

    @Override
    public String toString() {
        return clasificacion;
    }
}
