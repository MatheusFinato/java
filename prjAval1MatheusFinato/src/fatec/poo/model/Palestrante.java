
package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class Palestrante extends Pessoa{
    private String areaAtuacao;
    private double taxaCobranca;

    public Palestrante(String cpf, String nome, double taxaCobranca) {
        super(cpf, nome);
        this.taxaCobranca = taxaCobranca;
    }   

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void listarPalestras(){
        System.out.println("\n\nCPF: "+this.getCpf());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Area: "+this.getAreaAtuacao());
        System.out.println("Taxa cobrança: "+this.getTaxaCobranca()+"%");
    } 
}
