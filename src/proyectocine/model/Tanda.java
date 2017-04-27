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
 * @author jdmoralo
 */
public class Tanda {

    private Sala sala;
    private String time;
    private String date;
    //LocalTime time = LocalTime.parse("10:15:30");

    public Tanda(Sala sala, String time, String date) {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sala: " + sala + "/n"
                + "Fecha: " + date + "/n"
                + "Hora: " + time;
    }

}
