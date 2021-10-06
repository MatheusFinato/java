
package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class Corretor extends Pessoa{
    private double taxaComissao;
    private double taxaLocacao;

    public Corretor(int identificacao, String nome, double taxaComissao) {
        super(identificacao, nome);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {//80%
        return taxaComissao;
    }

    public double getTaxaLocacao() {//800=1000*0.8
        return taxaLocacao;
    }
    
    public void calcTotalComissao(double totalCom){
        this.taxaLocacao=taxaLocacao+totalCom;
    }
}
