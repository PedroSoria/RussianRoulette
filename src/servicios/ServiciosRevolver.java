/* Métodos:

    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.

    • mojar(): devuelve true si la posición del agua coincide con la posición actual

    • siguienteChorro(): cambia a la siguiente posición del tambor

    • toString(): muestra información del revolver (posición actual y donde está el agua)  */
package servicios;

import entidades.Revolver;

public class ServiciosRevolver {
    
    Revolver revolver = new Revolver();
    
    public void llenarRevolver() {
        revolver.setPosicioRecamara((int) (Math.random() * 5));
        revolver.setPosicionBala((int) (Math.random() * 5));
    }
    
    public boolean gatillar() {
        giraTambor();
        return revolver.getPosicioRecamara() == revolver.getPosicionBala();
        
    }
    
    public void giraTambor() {
        revolver.setPosicioRecamara(revolver.getPosicioRecamara() + 1);
        if (revolver.getPosicioRecamara() > 5) {
            revolver.setPosicioRecamara(0);
        }
    }
}
