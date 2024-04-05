/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        float n1, n2, soma, sub, mult, div;
        
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextFloat();

            System.out.println("");

            System.out.println("Digite o segundo número: ");
            n2 = input.nextFloat();

                soma = n1 + n2;
                sub = n1 - n2;
                mult = n1 * n2;
                div = n1 / n2;

            System.out.println("");

            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + sub);
            System.out.println("Multiplicação: " + mult);
            System.out.println("Divisão: " + div);
        
    }
    
}
