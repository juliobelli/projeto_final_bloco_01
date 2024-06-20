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
                    + "\n            1 - Listar todos os jogos                "
                    + "\n            2 - Pesquisar por categoria              "
                    + "\n            3 - Adicionar jogo ao carrinho           "
                    + "\n            4 - Visualizar carrinho                  "
                    + "\n            5 - Criar um novo jogo                   "
                    + "\n            6 - Atualizar um jogo                    "
                    + "\n            7 - Deletar um jogo                      "
                    + "\n            8 - Sair                                 "
                    + "\n                                                     "
                    + "\n*****************************************************"
                    + "\nEntre com a opção desejada:                          "
                    + "\n                                                     ");
            op = sc.nextInt();

            if(op == 8){
                System.out.println("Finalizando o programa...");
                sobre();
                System.exit(0);
            }

            switch(op){
                case 1 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                    Todos os jogos                   "
                            + "\n*****************************************************");
                    System.out.print("Digite o gênero (1-Aventura, 2-Plataforma, 3-Sandbox, 4-RPG, 5-Esportes): ");
                    int genero = sc.nextInt();
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
                case 5 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                  Criar um novo jogo                 "
                            + "\n*****************************************************");
                    System.out.print("Digite o ID do jogo: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consuming the newline left-over
                    System.out.print("Digite o nome do jogo: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o gênero (1-Aventura, 2-Plataforma, 3-Sandbox, 4-RPG, 5-Esportes): ");
                    int genero = sc.nextInt();
                    System.out.print("Digite o preço do jogo: ");
                    float preco = sc.nextFloat();
                    Jogo novoJogo = new Jogo(id, nome, genero, preco);
                    keyPress();
                }
                case 6 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                 Atualizar um jogo                   "
                            + "\n*****************************************************");
                    System.out.print("Digite o ID do jogo a ser atualizado: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consuming the newline left-over
                    System.out.print("Digite o novo nome do jogo: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o novo gênero (1-Aventura, 2-Plataforma, 3-Sandbox, 4-RPG, 5-Esportes): ");
                    int genero = sc.nextInt();
                    System.out.print("Digite o novo preço do jogo: ");
                    float preco = sc.nextFloat();
                    keyPress();
                }
                case 7 -> {
                    System.out.println("\n*****************************************************"
                            + "\n                   Deletar um jogo                   "
                            + "\n*****************************************************");
                    System.out.print("Digite o ID do jogo a ser deletado: ");
                    int id = sc.nextInt();
                    keyPress()    
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
