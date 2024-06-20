package model;

public abstract class Jogo {
    private int id;
    private String nome;
    private int genero;
    private float preco;

    public Jogo(int id, String nome, int genero, float preco) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void visualizar(){

        String genero = "";
        switch (this.genero){
            case 1 -> { genero = "Aventura";}
            case 2 -> { genero = "Plataforma";}
            case 3 -> { genero = "Sandbox";}
            case 4 -> { genero = "RPG";}
            case 5 -> { genero = "Esportes";}
        }

        System.out.println("\n\n*****************************************************"
                + "\nDados do Jogo"
                + "\n*****************************************************"
                + "\nID: " + this.id
                + "\nNome: " + this.nome
                + "\nGênero: " + genero
                + "\nSaldo: " + this.preco
        );
    }
}
