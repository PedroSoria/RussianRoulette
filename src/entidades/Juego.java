/* Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
    Revolver  */
package entidades;

import java.util.ArrayList;


public class Juego {
    
    
    //Atributos
    ArrayList<Jugador> Jugadores;
    Revolver revolver;
 

    
    //Constructor
    public Juego() {
        this.Jugadores = new ArrayList();
    }

    public Juego(ArrayList Jugadores, Revolver revolver) {
        this.Jugadores = Jugadores;
        this.revolver = revolver;
    }
    
    
    //Getter Setter
    public ArrayList getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

   
    

 
//    public void llenarJuego(Jugador jugadores, Revolver revolver) {
//          
//    }
//    
//    
//    public void ronda() {
//        revolver.llenarRevolver();
//    }
}
