package repository;

import model.Jogo;

public interface JogoRepository {

    void listarTodosJogos();
    void pesquisarGenero(int genero);
    void adicionarCarrinho() throws Jogo.JogoNaoEncontradoException;
    void visualizarCarrinho() throws Jogo.CarrinhoVazioException;
    void criarJogo(Jogo jogo);
    void atualizarJogo(int id, Jogo jogo) throws Jogo.JogoNaoEncontradoException;
    void deletarJogo(int id) throws Jogo.JogoNaoEncontradoException;

}
