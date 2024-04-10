
package es.medac.ejdelmartesmochila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asier.ruiz
 */
public class EjDelMartesMochila {

    public static void main(String[] args) {
        MochilaFestival mochila = new MochilaFestival(11);
        
        List<Souvenir> souvenirs = new ArrayList<>(); // Souvenirs ofrecidos por el festival
        List<Souvenir> sSeleccionados; // Souvenirs seleccionados
        
        int p, ve, pesoT, veT;
        
        // Souvenirs con KG y €
        souvenirs.add(new Souvenir(1,1));
        souvenirs.add(new Souvenir(3,8));
        souvenirs.add(new Souvenir(5,18));
        souvenirs.add(new Souvenir(6,22));
        souvenirs.add(new Souvenir(7,28));
        
        sSeleccionados = mochila.seleccionarSouvernirs(souvenirs, 11);
        
        System.out.println("Souvenirs seleccionados:");
        pesoT=veT=0;
        for(Souvenir s:sSeleccionados){
            pesoT+=p=s.getPeso();
            veT+=ve=s.getValorEc();
            System.out.println("Peso: " + p + " valor económico: " + ve );            
        }
        System.out.println("Peso Total: " + pesoT + " valor económico Total: " + veT);
    }
}
