/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Jose David Mora Loria
 * Adrian Ruiz Porras
 * Carlos Rodriguez Otoya
 * 
 */
package proyectocine.POJO;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author jdmoralo
 */
public class Tanda {
    private Sala sala;
    private LocalTime time;
    private LocalDate date;
    //LocalTime time = LocalTime.parse("10:15:30");

    public Tanda(Sala sala, LocalTime time, LocalDate date) {
        this.sala = sala;
        this.time = time;
        this.date = date;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sala: " + sala  + "/n"
                + "Fecha: " + date + "/n"
                + "Hora: " + time;
    }
    
    
}
