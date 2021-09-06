import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Aplic {  
    
    QuartoHotel[] quartos = new QuartoHotel[10];
    
    public static void main(String[] args) {
        Aplic app = new Aplic();
        app.criarQuartos();
        app.exibirMenu();
    }//ok
    
    private void criarQuartos() {
        for (int i = 0; i < 10; i++) {
            quartos[i] = new QuartoHotel(i,false);
        }
    }//ok
    
    private void exibirMenu() {
        System.out.println("\n1.Consultar Quarto\n2.Reservar Quarto\n3.Liberar Quarto\n4.Faturamento Quarto\n5.Faturamento Hotel\n6.Sair\n7.Listar");
        System.out.print("Digite a opção desejada: ");
        Scanner scan = new Scanner(System.in);
        try {
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    consultarQuarto();
                    break;
                case 2:
                    reservarQuarto();
                    break;
                case 3:
                    liberarQuarto();
                    break;
                case 4:
                    faturamentoQuarto();
                    break;
                case 5:
                    faturamentoHotel();
                    break;
                case 6:
                    System.exit(0);
                case 7: 
                    listarQuartos();
                    break;
            
                default:
                    System.out.println("Opção inválida!!\n");
                    exibirMenu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida!!\n");
                exibirMenu();
        }
    }//ok

    private void consultarQuarto(){
        System.out.print("Digite o quarto para consultar: ");
        Scanner scan = new Scanner(System.in);
        int numeroQuarto = scan.nextInt();
        if(pesquisaQuarto(numeroQuarto)!=null){
            QuartoHotel situacaoQuarto=pesquisaQuarto(numeroQuarto);
            if(situacaoQuarto.getSituacao()==false){
                System.out.println("Quarto livre!");
                exibirMenu();
            } else {
                System.out.println("Quarto ocupado!");
                exibirMenu();
            }
        }
    }//ok
    
    private void reservarQuarto(){
        System.out.print("Digite o quarto para reservar: ");
        Scanner scan = new Scanner(System.in);
        int numeroQuarto = scan.nextInt();
        QuartoHotel reservado=pesquisaQuarto(numeroQuarto);
        if (reservado==null){
            System.out.println("Quarto não encontrado");
            exibirMenu();   
            return;
        }
        if  (reservado.getSituacao() == false) {
            System.out.print("Digite o RG: ");
            int numeroRG = scan.nextInt();
            System.out.print("Digite o valor da diária: ");
            double valorDiaria = scan.nextDouble();
            System.out.print("Digite a qtd de dias: ");
            int qtdDias = scan.nextInt();
            reservado.setTotalDias(qtdDias);
            reservado.setValorDiaria(valorDiaria);
            reservado.setNumeroRG(numeroRG);
            reservado.setSituacao(true);
            exibirMenu();
        } else {
            System.out.println("O quarto ja esta reservado");
            exibirMenu();
        }
    }//ok
    
    private void liberarQuarto(){
        System.out.println("Digite o quarto para liberar: ");
        Scanner scan = new Scanner(System.in);
        int numeroQuarto = scan.nextInt();
        if(pesquisaQuarto(numeroQuarto) != null) {
            if(pesquisaQuarto(numeroQuarto).getSituacao()==false){
                System.out.println("O quarto ja está livre!\n");
                exibirMenu();
            } else {
                System.out.println("Quarto liberado com sucesso!");
                pesquisaQuarto(numeroQuarto).setSituacao(false);
                pesquisaQuarto(numeroQuarto).setNumeroRG(0);
                exibirMenu();
            }
        } else {
            System.out.println("Quarto não encontrado!\n");
            exibirMenu();
        }
    }//ok
    
    private void faturamentoQuarto(){
        System.out.println("Digite o numero do quarto: ");
        Scanner scan = new Scanner(System.in);
        int numeroQuarto=scan.nextInt();
        for(QuartoHotel quarto:quartos){
            if(quarto.getNumeroQuarto()==numeroQuarto){
                System.out.println("Total: "+quarto.getTotalQuarto());
                exibirMenu();
            }
        }
    }//ok
    
    private void faturamentoHotel(){
        double totalHotel=0;
        for(QuartoHotel quartoHotel:quartos){
            totalHotel+=quartoHotel.getTotalQuarto();
        }        
        System.out.println("Total do hotel: "+totalHotel);
        exibirMenu();
    }//ok
    
    private QuartoHotel pesquisaQuarto(int numeroQuarto){
        for(QuartoHotel quarto:quartos){
            if(quarto.getNumeroQuarto()==numeroQuarto){
                QuartoHotel quartoEncontrado=quarto;
                return quartoEncontrado;
            }
        }
        System.out.println("Quarto não encontrado!\n");
        return null;
    }//ok
    
    private void listarQuartos(){
        System.out.println("\nQuarto\tSituação\tTotal\tRG");
        for(QuartoHotel quartoHotel:quartos){
            System.out.println(quartoHotel.getNumeroQuarto()+"\t"
                    +quartoHotel.getSituacao()+"\t\t"+quartoHotel.getTotalQuarto()+"\t"+quartoHotel.getNumeroRG());
        }
        exibirMenu();
    }//ok
}
