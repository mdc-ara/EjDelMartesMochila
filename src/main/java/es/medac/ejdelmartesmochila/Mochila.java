package es.medac.ejdelmartesmochila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asier.ruiz
 */
public abstract class Mochila {
    protected int pesoMaximo;
    protected List<Souvenir> souvenirs;
    
    public Mochila(int p){
        this.pesoMaximo=p;
        this.souvenirs=new ArrayList<>();
    }
    
    public abstract void addSouvenir(Souvenir souvenir);  
}
