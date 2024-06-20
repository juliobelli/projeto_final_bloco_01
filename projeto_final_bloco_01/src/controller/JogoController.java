package controller;

import model.Jogo;
import repository.JogoRepository;

import java.util.*;


public class JogoController implements JogoRepository {

    private List<Jogo> jogosLista;
    private Map<Integer, Jogo> carrinho;

    public JogoController() {
        jogosLista = new ArrayList<>();
        carrinho = new HashMap<>();

        inicializarJogos();
    }

    private void inicializarJogos() {
        jogosLista.add(new Jogo(1, "The Legend of Zelda: Breath of the Wild", 1, 299.99f));
        jogosLista.add(new Jogo(2, "Super Mario Odyssey", 2, 249.99f));
        jogosLista.add(new Jogo(3, "Minecraft", 3, 99.99f));
        jogosLista.add(new Jogo(4, "The Witcher 3: Wild Hunt", 4, 199.99f));
        jogosLista.add(new Jogo(5, "FIFA 23", 5, 249.99f));
    }

    @Override
    public void listarTodosJogos() {
        for (Jogo jogo : jogosLista) {
            jogo.visualizar();
        }
    }

    @Override
    public void pesquisarGenero(int genero) {
        for (Jogo jogo : jogosLista) {
            if (jogo.getGenero() == genero) {
                jogo.visualizar();
            }
        }
    }

    @Override
    public void adicionarCarrinho() throws Jogo.JogoNaoEncontradoException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do jogo para adicionar ao carrinho: ");
        int id = sc.nextInt();
        boolean encontrado = false;

        for (Jogo jogo : jogosLista) {
            if (jogo.getId() == id) {
                carrinho.put(id, jogo);
                encontrado = true;
                System.out.println(jogo.getNome() + " foi adicionado ao carrinho.");
                break;
            }
        }

        if (!encontrado) {
            throw new Jogo.JogoNaoEncontradoException("Jogo com ID " + id + " não encontrado.");
        }
    }

    @Override
    public void visualizarCarrinho() throws Jogo.CarrinhoVazioException {
        float total = 0.0f;

        if (carrinho.isEmpty()) {
            throw new Jogo.CarrinhoVazioException("Seu carrinho está vazio.");
        } else {
            for (Jogo jogo : carrinho.values()) {
                jogo.visualizar();
                total += jogo.getPreco();
            }
            System.out.println("Total: R$" + total);

            Scanner sc = new Scanner(System.in);
            System.out.print("Deseja proceder com o pagamento? (s/n): ");
            String confirmacao = sc.nextLine();
            if (confirmacao.equalsIgnoreCase("s")) {
                processarPagamento(total);
            } else {
                System.out.println("Pagamento cancelado.");
            }
        }
    }

    @Override
    public void criarJogo(Jogo jogo) {
        jogosLista.add(jogo);
        System.out.println("Jogo " + jogo.getNome() + " foi adicionado.");
    }

    @Override
    public void atualizarJogo(int id, Jogo jogo) throws Jogo.JogoNaoEncontradoException {
        boolean encontrado = false;

        for (int i = 0; i < jogosLista.size(); i++) {
            if (jogosLista.get(i).getId() == id) {
                jogosLista.set(i, jogo);
                encontrado = true;
                System.out.println("Jogo com ID " + id + " foi atualizado.");
                break;
            }
        }

        if (!encontrado) {
            throw new Jogo.JogoNaoEncontradoException("Jogo com ID " + id + " não encontrado.");
        }
    }

    @Override
    public void deletarJogo(int id) throws Jogo.JogoNaoEncontradoException {
        boolean encontrado = false;

        for (int i = 0; i < jogosLista.size(); i++) {
            if (jogosLista.get(i).getId() == id) {
                jogosLista.remove(i);
                encontrado = true;
                System.out.println("Jogo com ID " + id + " foi removido.");
                break;
            }
        }

        if (!encontrado) {
            throw new Jogo.JogoNaoEncontradoException("Jogo com ID " + id + " não encontrado.");
        }
    }

    private void processarPagamento(float valor) {
        System.out.println("Processando pagamento de R$" + valor + "...");
        System.out.println("Pagamento realizado com sucesso!");
        carrinho.clear();
    }
}
