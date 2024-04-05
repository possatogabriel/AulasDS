/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int numero, numero2, valor;
        
        valor = 0;
        numero2 = 0;
        
        while (valor < 10) {
            valor ++;
            
            System.out.println("Escreva o valor " + valor + ": ");
            numero = input.nextInt();
            
                if (numero > numero2) {
                    numero2 = numero;
                }
                
                if (valor == 10) {
                    System.out.println("O maior número dentre os escritos é: " + numero2);
                }
        }
        
        
    }
    
}
