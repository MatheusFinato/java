import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        Palestrante objPalestrante = new Palestrante("123.456.789-11","Carlos Silva",75);
        objPalestrante.setAreaAtuacao("Segurança em redes de comp");
        
        Palestra objPalestra = new Palestra("15/06/2020","Segurança em rede de comp");
        objPalestra.setValor(600);
        objPalestra.setLocal("Auditorio Carlos Penha");
                
        Participante[] objParticipante = new Participante[3];
        objParticipante[0]=new Participante("121212122","Ana Beatriz",1);
        objParticipante[1]=new Participante("13131313","Fabio Souza",2);
        objParticipante[2]=new Participante("141414144","Marcos Silva",3);
              
        objParticipante[0].setEscolaridade("Ensino médio");
        objParticipante[1].setEscolaridade("Ensino médio");
        objParticipante[2].setEscolaridade("Ensino superior");
        
        int opcao;
        do{
            System.out.println("\n\n1 Exibir Palestras");
            System.out.println("2 Exibir Participantes");
            System.out.println("3 Sair");
            System.out.print("\nDigite a opção: ");
            opcao=entrada.nextInt();
            switch(opcao){
                case 1:
                    ((Palestrante)objPalestrante).listarPalestras();
                    System.out.print("\nData\t\tTema\t\t\t\tValor");
                    System.out.println("\n"+((Palestra)objPalestra).getData()+"\t"+
                            ((Palestra)objPalestra).getTema()+"\t"+
                            ((Palestra)objPalestra).getValor());
                    double total=((((Palestrante)objPalestrante).getTaxaCobranca())/100)*((Palestra)objPalestra).getValor()*3;
                    System.out.println("\nTotal: "+df.format(total));
                    break;
                case 2:
                    double totall2=0;
                    ((Palestra)objPalestra).emitirListaParticipantes();
                    System.out.println("Palestrante: "+((Palestrante)objPalestrante).getNome());
                    System.out.println("Data: "+((Palestra)objPalestra).getData());
                    System.out.println("Data: "+((Palestra)objPalestra).getLocal());
                    System.out.println("N° Participantes: "+objParticipante.length);
                    System.out.print("\nNome\t\tEscolaridade\t\tTipo");
                    for(int cont=0;cont<objParticipante.length;cont++){
                        if(((Participante)objParticipante[cont]).getTipo()==1){
                            String tipoParticipante="Comum";
                            System.out.print("\n"+((Participante)objParticipante[cont]).getNome()+"\t"+
                            ((Participante)objParticipante[cont]).getEscolaridade()+"\t\t"+
                            tipoParticipante);
                        } else if(((Participante)objParticipante[cont]).getTipo()==2){
                            String tipoParticipante="Estudante";
                            System.out.print("\n"+((Participante)objParticipante[cont]).getNome()+"\t"+
                            ((Participante)objParticipante[cont]).getEscolaridade()+"\t\t"+
                            tipoParticipante);
                        } else {
                            String tipoParticipante="Idoso";
                            System.out.print("\n"+((Participante)objParticipante[cont]).getNome()+"\t"+
                            ((Participante)objParticipante[cont]).getEscolaridade()+"\t\t"+
                            tipoParticipante);
                        }
                        totall2=(((Palestra)objPalestra).getValor())*3;
                    }
                    System.out.println("\nTotal: "+df.format(totall2));
                    break;
            }
        } while(opcao!=3);
    }
}
