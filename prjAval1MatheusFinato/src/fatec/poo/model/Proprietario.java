
package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class Proprietario extends Pessoa{
    private String telefone;
    private double valorAluguel;

    public Proprietario(int identificacao, String nome, String telefone) {
        super(identificacao, nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
