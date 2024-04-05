/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Gabriel Possato
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, result;
        
        numero = 99;
        
        System.out.println("NÚMEROS ÍMPARES ENTRE 0 E 100: ");
        
            while (numero > 1) {
                result = numero - 2;
                numero = result;

                System.out.println(numero);
            }
        
    }
    
}
