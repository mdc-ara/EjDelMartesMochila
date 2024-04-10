package es.medac.ejdelmartesmochila;

/**
 *
 * @author asier.ruiz
 */
public class Souvenir {
    private int peso;
    private int valorEc;

    public Souvenir(int peso, int valorEc) {
        this.peso = peso;
        this.valorEc = valorEc;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getValorEc() {
        return valorEc;
    }

    public void setValorEc(int valorEc) {
        this.valorEc = valorEc;
    }    
}
