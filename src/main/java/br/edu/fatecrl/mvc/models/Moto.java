package br.edu.fatecrl.mvc.models;

public class Moto {
    private String modelos;
    private String marca;
    private int ano;
    private float valor;

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Moto(String modelos, String marca, int ano, float valor) {
        this.modelos = modelos;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }
}
