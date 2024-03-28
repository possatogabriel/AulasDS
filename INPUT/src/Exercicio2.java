/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;
import java.util.Scanner;

/**
 *
 * @author Gabriel Possato
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        float dist, comb, consumo;
        
        System.out.println("Digite a distância percorrida: ");
        dist = input.nextFloat();
        
        System.out.println("");
        
        System.out.println("Digite a quantidade de combustível consumida: ");
        comb = input.nextFloat();
        
        consumo = dist / comb;
        
        System.out.println("");
        
        System.out.println("O consumo médio do automóvel é: " + consumo);
        
    }
    
}
