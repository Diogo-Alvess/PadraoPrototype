package org.example;

public class Produto implements Cloneable {

    private int codigo;
    private String nome;
    private Especificacoes especificacoes;
    private double preco;

    public Produto(int codigo, String nome, Especificacoes especificacoes, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especificacoes getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(Especificacoes especificacoes) {
        this.especificacoes = especificacoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.especificacoes = (Especificacoes) especificacoes.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", especificacoes=" + especificacoes +
                ", preco=" + preco +
                '}';
    }
}