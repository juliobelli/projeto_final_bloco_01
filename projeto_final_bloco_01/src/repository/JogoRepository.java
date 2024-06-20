package repository;

import model.Jogo;

public interface JogoRepository {

    void listarTodosJogos();
    void pesquisarGenero(int genero);
    void adicionarCarrinho();
    void visualizarCarrinho();
    void criarJogo(Jogo jogo);
    void atualizarJogo(int id, Jogo jogo);
    void deletarJogo(int id);

}
