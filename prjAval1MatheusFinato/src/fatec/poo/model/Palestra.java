
package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class Palestra {
    private String data;
    private String tema;
    private String local;
    private double valor;
    private double totalArrecadado;

    public Palestra(String data, String tema) {
        this.data = data;
        this.tema = tema;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }

    public String getLocal() {
        return local;
    }

    public double getValor() {
        return valor;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }
    
    public void emitirListaParticipantes(){
        System.out.println("Tema: "+this.getTema());
    }
}
