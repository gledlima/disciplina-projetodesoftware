import java.util.Scanner;
//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Iterator;

public class Main {
    

    public static void main(String[] args)
    {

    String name;
    String address;
    String district;

    int typeofEmployee;
    int matricula = 0;
    int opção = 0;
    int i = 0;
    int reserva1 = 0;
    float reserva2 = 0;

    String reserva;

    //int contador = 1;

    ArrayList<empregado> folhaPagamento = null; // INICIALIZANDO O ARRAY
    folhaPagamento = new ArrayList<empregado>(); 

    do
    {

        System.out.println("====================");
        Scanner numScanner = new Scanner(System.in); //INSTALAR UM OBJETO SCANNER PARA LER O NÚMERO
        System.out.println("Digite o número que corresponde a sua opção:");
        System.out.println("1 - Adicionar Funcionário");
        System.out.println("2 - Remover Empregado");
        System.out.println("3 - Lançar um Cartão de Ponto");
        System.out.println("4 - Lançar um Resultado Venda");
        System.out.println("5 - Lançar uma Taxa de Serviço");
        System.out.println("6 - Apresentar uma tabela com todas pessoas cadastradas");
        System.out.println("0 - Sair das opições e fechar a página");
        opção = numScanner.nextInt();
        numScanner.nextLine(); //PARA LIMPAR O BUFFER

        Scanner Ler = new Scanner(System.in); 
        
        int tamanho = folhaPagamento.size();

        //ArrayList<empregado> folhaPagamento = null; // INICIALIZANDO O ARRAY

        switch(opção)
        {
            case 0:
            break;
        }   
        if(opção == 1)
        {
            System.out.println("Digite seu nome: "); 
            name = Ler.nextLine(); //Para ler um texto digitado (string), podemos usar o método nextLine()

            System.out.println("Digite sua cidade: "); // PARA LER NOMES SEPARADOS TEM QUE TER O Line
            address = Ler.nextLine();

            System.out.println("Digite seu bairro e quadra:");
            district = Ler.nextLine();

            System.out.println("Digite o tipo de vinculo com a empresa:");
            System.out.println(
                "1 - ASSALARIADO;" +
                "2 - HORISTA:" + 
                "3 - COMISSIONADO;");

            typeofEmployee = numScanner.nextInt();

            /*System.out.println("\n");
            System.out.println("====================================");
            System.out.println("\n");*/
            matricula = gerarMatricula.getProxMatricula(); //GERANDO UM NUMERO DE MATRICULA

            //ArrayList<empregado> folhaPagamento = new ArrayList<empregado>(); //INICIALIZANDO O ARRAY USANDO O CONSTRUTOR "EMPREGADO"
            //folhaPagamento = new ArrayList<empregado>();
            empregado Empregado1 = new empregado(name, address, district, typeofEmployee, matricula); // eu já crio o objeto e inicializo ele

            folhaPagamento.add(Empregado1);

            /*for(empregado Array : folhaPagamento)
            {    
            System.out.println(Array);
            //System.out.println(Array.address);
            }*/
        }
        else if(opção == 2)
        {
            //Iterator<empregado> itr = folhaPagamento.iterator();

            System.out.println("Digite a matricula do contato que você quer remover:");
            //reserva = Ler.nextLine();
            reserva1 = numScanner.nextInt();
            numScanner.nextLine();


            /*for(i = 0; i < tamanho; i++)
            {
                empregado p = folhaPagamento.get(i);
                if(p.getName().equals(reserva))
                {
                    folhaPagamento.remove(p);

                    break;
                }
            }*/

            for(i = 0; i < tamanho; i++)
            {
                empregado p = folhaPagamento.get(i);
                if(p.getmatricula() == reserva1)
                {
                    folhaPagamento.remove(p);

                    break;
                }
            }
        }
        else if(opção == 3)
        {
            System.out.println("Digite o seu número de matrícula:");
            reserva1 = numScanner.nextInt();
            numScanner.nextLine();

            System.out.println("Digite o número de horas trabalhadas:");
            reserva2 = numScanner.nextFloat();
            ///////////////////////////////////////////////////////////////////////////

            
        }
        else if(opção == 6)
        {
            System.out.println("======== TABELA DE CONTATOS CADRASTADOS: =========");

            for(empregado Array : folhaPagamento)
            {    
            System.out.println("Nome: " + Array.name + " - " + "Endereço: " + Array.address + " - " + "Bairro ou Quadra: " + Array.district + " - " + "Tipo de Vinculo: " + Array.typeofEmployee + " - " + "Matrícula: " + Array.matricula );
            //System.out.println(Array.address);
            }
            if(folhaPagamento.isEmpty())
            {
                System.out.println("Não existe cadastro adicionado!");
            }
            /*System.out.println("Pessoas cadastradas:\n");

            for(i = 0; i < tamanho; i++)
            {
                System.out.println(folhaPagamento.get(i).getName() + "\n");
            }*/


        }
        //numScanner.close();
        //Ler.close();

    }
    while(opção != 0);
    

    }
}

