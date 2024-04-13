/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício9;

/**
 *
 * @author Gabriel Possato
 */
public class Exercício9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int result1 = 80000;
        int result2 = 200000;
        
        float taxa1 = 80000 * 0.03f;
        float taxa2 = 200000 * 0.015f;
        
        int anos = 0;
        int valor = 0;
        
            for (int i = 1; i > valor; i++) {
                result1 = (int) (result1 + taxa1);
                result2 = (int) (result2 + taxa2); 
                
                anos ++; 
                
                System.out.println("VALOR DO PAÍS A: " + result1);
                System.out.println("VALOR DO PAÍS B: " + result2);
                System.out.println("ANO: " + anos);
                System.out.println("");
                
                    if (result1 >= result2) {
                        
                        System.out.println("O número de anos necessários para a população A atingir a B é: " + anos);
                        break;
                    }
                    
            }
            
    }
    
}
