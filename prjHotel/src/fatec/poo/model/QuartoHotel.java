package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class QuartoHotel {
    private int numRG;
    private int qtdDias;
    private int numeroQuarto;
    private double valorDiaria;
    private boolean situacao=false;
    
    public QuartoHotel(int numeroQuarto, boolean situacao){
        this.numRG=0;
        this.numeroQuarto=numeroQuarto;
        this.situacao=situacao;
        this.qtdDias=0;
        this.valorDiaria=0;
    }
    
    public int getNumeroRG(){
        return numRG;
    }
    
    public void setNumeroRG(int RG){
        numRG=RG;
    }
    
    public int getNumeroQuarto(){
        return numeroQuarto;
    }
    
    public void setNumeroQuarto(int n){
        numeroQuarto=n;
    }
    
    public double getValorDiaria(){
        return valorDiaria;
    }
    
    public void setValorDiaria(double v){
        valorDiaria=v;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void setSituacao(boolean s){
        situacao=s;
    }
    
    public double getTotalDias(){
        return qtdDias;
    }
    
    public void setTotalDias(int d){
        qtdDias=d;
    }
    
    public double getTotalQuarto(){
        return qtdDias*valorDiaria;
    }
}
