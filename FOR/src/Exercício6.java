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
        
        System.out.println("Escreva o valor: ");
        int valor = input.nextInt();
        
            if (valor == 0) {
                while (valor == 0) {
                    System.out.println("Escreva um novo valor: ");
                    int valor2 = input.nextInt();
                    valor = valor2;
                }
                
            }
        
        int valormais1 = valor + 1;
        
        System.out.println("");
        
        for (int i = 1; i < valormais1; i++) {
            System.out.println(i);
        }
        
    }
    
}
