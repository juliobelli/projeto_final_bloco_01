import java.io.IOException;
import java.util.*;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        while(true){
            System.out.println("\n*****************************************************"
                            + "\n                                                     "
                            + "\n                       PLAYHUB                       "
                            + "\n                                                     "
                            + "\n*****************************************************"
                            + "\n                                                     "
                            + "\n            1 - Visualizar todos os jogos            "
                            + "\n            2 - Pesquisar por categoria              "
                            + "\n            3 - Adicionar jogo ao carrinho           "
                            + "\n            4 - Visualizar carrinho                  "
                            + "\n            5 - Sair                                 "
                            + "\n                                                     "
                            + "\n*****************************************************"
                            + "\nEntre com a opção desejada:                          "
                            + "\n                                                     ");
            op = sc.nextInt();

            if(op == 5){
                System.out.println("Finalizando o programa...");
                sobre();
                System.exit(0);
            }

            switch(op){
                case 1 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                    Todos os jogos                   "
                            + "\n*****************************************************");
                    keyPress();
                }
                case 2 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                Pesquisa por categoria               "
                            + "\n*****************************************************");
                    keyPress();
                }
                case 3 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                Adicionar ao carrinho                "
                            + "\n*****************************************************");
                    keyPress();
                }
                case 4 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                 Visualizar carrinho                 "
                            + "\n*****************************************************");
                    keyPress();
                }
                default -> {
                    System.out.println("\nOpção inválida!\n");
                    keyPress();
                }
            }
        }
    }
    public static void sobre(){
        System.out.println("\n*****************************************************"
                + "\nProjeto Desenvolvido por: "
                + "\nJulio Bellini - contatojubelli@gmail.com"
                + "\ngithub.com/juliobelli "
                + "\n*****************************************************");
    }

    public static void keyPress() {

        try {

            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}
