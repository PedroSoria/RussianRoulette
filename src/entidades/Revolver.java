/* Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.  */
package entidades;

public class Revolver {
    
    int posicioRecamara;
    int posicionBala;

    public Revolver() {
    }

    public Revolver(int posicioRecamara, int posicionBala) {
        this.posicioRecamara = posicioRecamara;
        this.posicionBala = posicionBala;
    }

    public int getPosicioRecamara() {
        return posicioRecamara;
    }

    public void setPosicioRecamara(int posicioRecamara) {
        this.posicioRecamara = posicioRecamara;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicioRecamara=" + posicioRecamara + ", posicionBala=" + posicionBala + '}';
    }
    
    
    

    
    


}
