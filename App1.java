
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
                switch(opcao){
                    case 1-> cadastrar();
                    case 2-> localizar();
                    
                }
            } while(opcao != 0);
    }
  
    static void localizar(){
      
    }
  
    static void cadastrar(){
        System.out.println("Nome: ");
        var nome = scanner.nextLine();
        clientes.add(nome);
    }
}
