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
        int N=s.size();
        // Máximos € que se pueden obtener con i souvenires y w peso máximo
        int[][]dp=new int[N+1][pM+1];
        int peSouv;
        int veSouv;
        
        for(int i=0;i<=N;i++){
            for(int w=0;w<=pM;w++){
                if(i==0||w==0){ // Primera fila o columna
                    dp[i][0]=0; // Casos base: sin items o peso 0
                    continue;
                }
                peSouv=s.get(i-1).getPeso();
                veSouv=s.get(i-1).getValorEc();
                if(peSouv>w){ // Si el peso del souvenir es mayor de lo que indica la columna
                    dp[i][w]=dp[i-1][w]; // Se deja los €s que estaban en la fila anterior
                }
            }
        }
        return(s);
    }
    
}
