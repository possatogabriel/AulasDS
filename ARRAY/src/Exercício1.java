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
    
        int var[] = new int[10];
        
            for (int i = 0; i < 10; i ++) {
                System.out.println("Escreva o número: ");
                
                var[i] = input.nextInt();
            }
            
            System.out.println("");
            
            for (int j = 9; j > -1; j --) {
                System.out.println(var[j]);
            }     
 
    }
    
}
