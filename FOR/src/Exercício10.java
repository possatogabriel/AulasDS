/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício10;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Escreva um valor: ");
        int n = input.nextInt();
        
        
        System.out.println("");
        
        int valor1 = 1;
        int valor2 = 0;
        int valor3 = 0;
        
        System.out.println("SÉRIE DE FIBONACCI: ");
        
        for (int i = 0; i < n; i++) {
            valor3 = valor1 + valor2;
            valor1 = valor2;
            valor2 = valor3;
            
            System.out.println(valor3);
        }
            
    }
    
}
