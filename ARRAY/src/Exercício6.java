/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício6;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("Escreva o tamanho dos vetores: ");
        int n = input.nextInt();
        
        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        int soma[] = new int[n];
        
           for (int i = 0; i < vetorA.length; i ++) {
               System.out.println("");
               System.out.print("Escreva o primeiro valor: ");
               vetorA[i] = input.nextInt();
               
               System.out.print("Escreva o segundo valor: ");
               vetorB[i] = input.nextInt();
           }
           
           for (int j = 0; j < vetorA.length; j ++) {
               soma[j] = vetorA[j] + vetorB[j];
               
               System.out.println("");
               System.out.println("SOMA " + (j + 1) + ": " + soma[j]);
           }
    
    }
    
}
