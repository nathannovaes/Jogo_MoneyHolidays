
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
public class Dado {
    Random aleatorio;
    int valorDado;
    
    int jogarDado(){
        aleatorio = new Random();
        valorDado = aleatorio.nextInt(6) + 1;
        return valorDado;
    }
    
    int DadoEsquerda(){
        int valorEsquerda = jogarDado();
        
        return valorEsquerda;
    }
    
    int DadoDireita(){
        int valorDireita = jogarDado();
        
        return valorDireita;
    }
      
    /*int SaidaDado(int valorEsquerda, int valorDireita){
        int valorFinal = valorDireita + valorEsquerda;
        
        return valorFinal;
    }*/
     
}
