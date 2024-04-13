/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício11;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Escreva um valor: ");
        int n = input.nextInt();
        
        int valor1 = 1;

            for (int i = 1; i <= n; i++) {
                valor1 = valor1 * i;
                
                System.out.println(i);
                
                    if (i >= n) {
                        System.out.println("");
                        System.out.println("RESULTADO DA FATORIAL: " + valor1); 
                    }
                          
            }
            
    }
    
}
