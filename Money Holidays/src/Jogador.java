/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
public class Jogador {
    private int id;
    private String nome;
    private double dinheiro;
    private int posicao;
    private int propriedades;


    public Jogador(int id, String nome, int posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = 0;
        this.dinheiro = 200;
    }

    
    void mudarPosicao(int valorEntrada, int valorDado){
        if(valorEntrada + valorDado >= 40){
            this.setPosicao(valorEntrada + valorDado - 40);
        }
    }
    
    
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
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

    public int getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(int propriedades) {
        this.propriedades = propriedades;
    }

    
    
}
