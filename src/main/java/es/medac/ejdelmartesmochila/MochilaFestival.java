package es.medac.ejdelmartesmochila;

import java.util.List;

/**
 *
 * @author asier.ruiz
 */
public class MochilaFestival extends Mochila implements Seleccionable {

    public MochilaFestival(int p) {
        super(p);
    }
   
    @Override
    public void addSouvenir(Souvenir souvenir) {
        this.souvenirs.add(souvenir);
    }

    @Override
    public List<Souvenir> seleccionarSouvernirs(List<Souvenir> s, int pM) {
        return(s);
    }
    
}
