/* Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:  */
package ruletaruza;

import servicios.ServiciosJuego;

public class RuletaRuza {

    public static void main(String[] args) {
        ServiciosJuego sj = new ServiciosJuego();
        sj.llenarJuego(6);
    }
}
