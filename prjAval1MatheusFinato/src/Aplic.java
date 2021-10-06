
import fatec.poo.model.Corretor;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Proprietario;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Matheus
 */
public class Aplic {
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        Pessoa[] cadCorPro = new Pessoa[20];
        int opcao, cont=0, id;
        String nome, telefone;
        double comissao, valorAluguel;
        
        do{
            System.out.println("\n1 Cadastrar corretor");
            System.out.println("2 Cadastrar proprietario");
            System.out.println("3 Listar corretores");
            System.out.println("4 Sair");
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1: 
                    if(cont<cadCorPro.length){
                        System.out.print("\nDigite a identificação: ");
                        id=entrada.nextInt();
                        System.out.print("Digite o nome: ");
                        nome=entrada.next();
                        System.out.print("Digite a taxa de comissão(%): ");
                        comissao=(entrada.nextDouble())/100;
                        
                        cadCorPro[cont]=new Corretor(id,nome,comissao);
                        cont++;
                    }else{
                        System.out.println("\n\t\t------------------");
                        System.out.println("\t\tLimite de matriz atingido");
                        System.out.println("\t\t------------------");
                    }
                    break;
                case 2: 
                    boolean corretorEncontrado=false;
                    if(cont<cadCorPro.length){
                        System.out.print("Digite a id do corretor: ");
                        id=entrada.nextInt();
                        for(int cont2=0;cont2<20;cont2++){
                            if(cadCorPro[cont2] instanceof Corretor && ((Corretor)cadCorPro[cont2]).getIdentificacao()==id){
                                corretorEncontrado=true;
                                System.out.print("\nDigite a identificação: ");
                                id=entrada.nextInt();
                                System.out.print("Digite o nome: ");
                                nome=entrada.next();
                                System.out.print("Digite o telefone: ");
                                telefone=entrada.next();
                                System.out.print("Digite o valor do aluguel: ");
                                valorAluguel=entrada.nextDouble();
                                                                
                                cadCorPro[cont]=new Proprietario(id,nome,telefone);
                                ((Proprietario)cadCorPro[cont]).setValorAluguel(valorAluguel);
                                ((Corretor)cadCorPro[cont2]).calcTotalComissao(valorAluguel*((Corretor)cadCorPro[cont2]).getTaxaComissao());
                                cont++;
                                break;
                            }
                        }
                        if(corretorEncontrado==false){
                            System.out.println("Corretor não cadastrado");
                        }
                    }else{
                        System.out.println("\n\t\t------------------");
                        System.out.println("\t\tLimite de matriz atingido");
                        System.out.println("\t\t------------------");
                    }
                    break;
                case 3: 
                    if(cont>0){
                        System.out.print("\nId\tNome\tTaxa\tTotal");
                        for(int cont3=0;cont3<cont;cont3++){
                            if(cadCorPro[cont3] instanceof Corretor){
                                System.out.print("\n"+((Corretor)cadCorPro[cont3]).getIdentificacao()+"\t"+((Corretor)cadCorPro[cont3]).getNome()+"\t"+
                                df.format((((Corretor)cadCorPro[cont3]).getTaxaComissao())*100)+"\t"+df.format(((Corretor)cadCorPro[cont3]).getTaxaLocacao()));
                            }
                        }
                    }else{
                        System.out.println("\n\t\t-------------------------");
                        System.out.println("\t\tNão existem dados para listar");
                        System.out.println("\t\t-------------------------");
                    }
                    break;
            }
        }while(opcao!=4);
    }  
}
