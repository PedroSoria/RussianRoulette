/* Clase Jugador: esta clase posee los siguientes atributos: 
id (representa el número del
jugador), 
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y 
mojado (indica
si está mojado o no el jugador). 
El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
package entidades;


public class Jugador {
    
    
    //Atributos
    String nombre;
    int id;
    boolean muerto;
     
    
    
    //Constructor
    public Jugador() {
        this.muerto = false;
    }

    public Jugador(String nombre, int id, boolean muerto) {
        this.nombre = nombre;
        this.id = id;
        this.muerto = false;
    }
    
    //Getter Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", muerto=" + muerto + '}';
    }


 
}
