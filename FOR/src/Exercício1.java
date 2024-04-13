/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício1;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        int n[] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Escreva um número: ");
            n[i] = input.nextInt();
                    
            System.out.println("");
                    
                    if (n[2] == 0) {
                        i = 1;
                        
                        System.out.println("VALOR INVÁLIDO!");
                    }
                    
                    else {
                        int div = n[0] / n[2];
                        
                        System.out.println("A divisão dos números são: " + div);
                    }
                
        }
    
    }
    
}
