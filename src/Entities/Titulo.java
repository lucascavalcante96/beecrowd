package Entities;

public class Titulo {
    private String nome;
    private int duracao;
    private int anoDeLancamento;

    public Titulo() {
    }

    public Titulo(String nome, int duracao, int anoDeLancamento) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
}
