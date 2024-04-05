/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int lados, valor1, valor2;
        
        valor1 = 0;
        valor2 = 0;
        
        System.out.println("Escreva o número de lados do quadrado: ");
        lados = input.nextInt();
        
        while (valor1 != lados) {
            valor1  ++;
            
            System.out.print("*");
            
                if (valor1 == lados) {
                    valor1 = 0;
                    valor2 ++;
                    
                    System.out.println("");
                }
                
                if (valor2 == lados) {
                    break;
                }
                
        }
        
    }
    
}
