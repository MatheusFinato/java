
package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class Pessoa {
    private int identificacao;
    private String nome;

    public Pessoa(int identificacao, String nome) {
        this.identificacao = identificacao;
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getNome() {
        return nome;
    }
}
