package org.example;


public class Especificacoes implements Cloneable {

    private String fabricante;
    private String modelo;
    private String tensao;

    public Especificacoes(String fabricante, String modelo, String tensao) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tensao = tensao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Especificacoes{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tensao='" + tensao + '\'' +
                '}';
    }
}

