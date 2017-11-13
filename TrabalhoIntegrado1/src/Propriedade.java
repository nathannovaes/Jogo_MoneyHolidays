
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
public class Propriedade {
    private int id;
    private String nome;
    private double precoCompra;
    private double precoVenda;
    private double precoAluguel;
    private int x;
    private int y;
    private int dono;

    public Propriedade(int id, String nome, double precoCompra, double precoVenda, double precoAluguel, int x, int y, int dono) {
        this.id = id;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.precoAluguel = precoAluguel;
        this.x = x;
        this.y = y;
        this.dono = dono;
    }

    
    int Comprar(double dinheiroJogador, double valorPropriedade, String nomePropriedade){
        int retorno;
        int perguntaComprar = JOptionPane.showConfirmDialog(null, "Propriedade: "+ nomePropriedade +"\nValor: "+ valorPropriedade +"\nDeseja comprar?");
        if(perguntaComprar == 0) {
          if(dinheiroJogador >= valorPropriedade){
              retorno = 0;
          }
          else{
              retorno = 1;
          }  
        }
        else{
           retorno = 2; 
        }
        
        return retorno;
    }
    
    int Vender(double valorVenda){
        int retorno;
        int perguntaVender = JOptionPane.showConfirmDialog(null, "Essa propriedade vale R$" + valorVenda +"\nDeseja vender?");
        if(perguntaVender == 0){
            retorno = 0;
        }else{
            retorno = 1;
        }
        
        return retorno;
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

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(int precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(int precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(int precoAluguel) {
        this.precoAluguel = precoAluguel;
    }
    
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDono() {
        if(dono == 1){
            System.out.println("Dono Jogador Azul");
        }
        else if(dono == 2){
            System.out.println("Dono Jogador Vermelho");
            
        }
        else{
            System.out.println("Não tem dono.");
        }
        return dono;
    } 
    
    public void setDono(int dono) {
        this.dono = dono;
    }    

    
    
}
