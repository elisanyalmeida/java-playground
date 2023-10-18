
import java.util.*;

public class App1{
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<String> clientes = new LinkedList<>();
    public static void main(String args[]){
       
        var menu =
            """
            1 - Cadastrar cliente
            2 - Localizar cliente
            0 - Sair do programa
            Digite uma opção:  
            """;

            int opcao;
            
            do{
                System.out.println(menu);
                opcao = scanner.nextInt();
                scanner.nextLine(); //pega o enter pressionado depois da opcao e descarta
                switch(opcao){
                    case 1-> cadastrar();
                    case 2-> localizar();
                    
                }
            } while(opcao != 0);
    }
  
    static void localizar(){
        System.out.println("Nome pra localizar: ");
        var nomeProcurado = scanner.nextLine();

        String nomeAchado = "";
        for (String nome : clientes) {
            if(nome.contains(nomeProcurado))
             nomeAchado = nome;
             break;
        }
        
        if(nomeAchado.isBlank())
            System.out.println("Cliente nao cadastrado"); 
        else System.out.println("Cliente encontrado: " + nomeAchado); 
    }
  
    static void cadastrar(){
        System.out.println("Nome pra cadastrar: ");
        var nome = scanner.nextLine();
        clientes.add(nome);
    }
}
