/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício8;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Escreva um valor: ");
        int tabuada = input.nextInt();
        
        System.out.println("");
        
            for (int n = 0; n <= 10; n++) {
                int mult = tabuada * n;
                
                System.out.println(tabuada + " x " + n + " = " + mult);
            }
            
    }
    
}
