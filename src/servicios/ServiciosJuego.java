/* Métodos:

• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego. */
package servicios;

import entidades.Juego;
import entidades.Jugador;
import java.util.ArrayList;

public class ServiciosJuego {

    Juego juego = new Juego();
    ServiciosJugador serviciosjugador = new ServiciosJugador();
    ServiciosRevolver serviciosrevolver = new ServiciosRevolver();

    public  void llenarJuego(int n) {
        serviciosrevolver.llenarRevolver();
        ronda(serviciosjugador.creaJugador(n));
    }

    public void ronda(ArrayList<Jugador> jugadores) {
        do {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println("Turno de Jgador id: " + jugadores.get(i).getId());
                if (serviciosjugador.disparar(jugadores.get(i), serviciosrevolver)) {
                    System.out.println(jugadores.remove(i).toString());
                    System.out.println(jugadores.toString());
                    serviciosrevolver.llenarRevolver();
                    ultimoEnLaRonda(jugadores, i);
                    break;
                }
            }
        } while (jugadores.size() > 1);
    }
    
    public void ultimoEnLaRonda(ArrayList<Jugador> jugadores, int n) { 
        ArrayList<Jugador> nuevoOrden = new ArrayList();
        for (int i = 0; i < jugadores.size(); i++) {
            if (n >= jugadores.size()) {
                n = 0;
            }
            nuevoOrden.add(jugadores.get(n));
            n++;
        }
        jugadores.clear();
        jugadores.addAll(nuevoOrden);
    }
}
