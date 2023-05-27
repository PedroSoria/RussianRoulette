/* Métodos:

    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
    devuelve true, sino false.   */
package servicios;

import entidades.Jugador;
import java.util.ArrayList;

public class ServiciosJugador {
    
    ArrayList<Jugador> jugadores = new ArrayList();
    
    public ArrayList<Jugador> creaJugador(int n) {
        for (int i = 0; i < n; i++) {
            jugadores.add(new Jugador("" ,i , false));
        }
        return jugadores;
    }
    
    public boolean disparar(Jugador jugador, ServiciosRevolver serviciosrevolver) {
        jugador.setMuerto(serviciosrevolver.gatillar());
        return jugador.isMuerto();
    }  
}
