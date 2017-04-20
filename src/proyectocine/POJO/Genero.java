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

    @Override
    public String toString() {
        return titulo;
    }
    
}
