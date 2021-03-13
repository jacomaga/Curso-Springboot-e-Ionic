package br.com.fiap.revisao.bean;

public class Veiculo {


    private int ano;
    private String cor;
    private float peso;
    private String modelo;

    public int getAno(){
        return ano;
    }
    public void andar(){
        System.out.println("veiculo andando");
    }
    public void andar(float velocidade){
        System.out.println("Veiculo à " + velocidade);
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo(int ano, String cor, float peso, String modelo) {
        super();
        this.ano = ano;
        this.cor = cor;
        this.peso = peso;
        this.modelo = modelo;
    }
    public Veiculo(){

    }

    public Veiculo(int ano, String modelo){
        this.ano = ano;
        this.modelo = modelo;
    }
}

