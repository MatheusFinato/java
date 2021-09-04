package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class ContaCorrente {
    private int numeroConta;
    private double saldoConta;

    public ContaCorrente(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public int getNumero() {
        return numeroConta;
    }
    
    public void setNumero(int n){
        numeroConta=n;
    }

    public double getSaldo() {
        return saldoConta;
    }
    
    public void setSaldo(double s){
        saldoConta=s;
    }
    
//    public void sacar(double saque){//metodos que são feitos pelo ""Banco"", não pela Conta
//        saldoConta -= saque; //saldo = saldo - saque
//    }
//    
//    public void depositar(double deposito){//metodos que são feitos pelo ""Banco"", não pela Conta
//         saldoConta += deposito; //saldo = saldo + deposito
//    }
}
