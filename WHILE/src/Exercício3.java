/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero, result, par, impar, numeromais1;
        
        System.out.println("Escreva um número: ");
        numero = input.nextInt();
        
        numeromais1 = numero + 1;
        
        result = numero % 2;
        
        if (result == 0) {
            
        System.out.println("PARES: ");
            while (numero > 2) {
                par = numero - 2;
                numero = par;

                System.out.println(par);
            }
            
        System.out.println("ÍMPARES: ");    
            while (numeromais1 > 1) {
                impar = numeromais1 - 2;
                numeromais1 = impar;

                System.out.println(impar);
            }
        }
        
        else if (result == 1) {
            
        System.out.println("ÍMPARES: ");
            while (numero > 1) {
                impar = numero - 2;
                numero = impar;

                System.out.println(impar);
            }
            
        System.out.println("PARES: ");
            while (numeromais1 > 2) {
                par = numeromais1 - 2;
                numeromais1 = par;
                
                System.out.println("PARES: ");
                System.out.println(par);
            }
        }
        
        else {
            System.out.println("Houve um erro. Tente novamente!");
        }
        
    }
    
}
