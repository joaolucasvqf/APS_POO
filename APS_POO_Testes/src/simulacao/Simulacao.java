/*package simulacao;

import java.util.ArrayList;
import java.util.List;

public class Simulacao extends Pessoas{
    private int nPessoas, pratos, carboidratos, proteinas, saladas, sucos, tMin, tMax, tTotal = 0, tMedio;
    private List<Pessoas> pessoas;

    public Simulacao(int nPessoas, int pratos, int carboidratos, int proteinas, int saladas, int sucos, int tMin, int tMax, int tTotal, int tMedio) {
        this.nPessoas = nPessoas;
        this.pratos = pratos;
        this.carboidratos = carboidratos;
        this.proteinas = proteinas;
        this.saladas = saladas;
        this.sucos = sucos;
        this.tMin = tMin;
        this.tMax = tMax;
        this.tTotal = tTotal;
        this.tMedio = tMedio;
        pessoas  = new ArrayList<Pessoas>();
        setPessoas();
    }
    
    private void setPessoas(){
        for(int i = 0; i < nPessoas; i++){
        pessoas.add(new Pessoas(tMin, tMax));
    }
    }
    
    
}
*/