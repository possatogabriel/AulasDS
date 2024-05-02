/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício5;

/**
 *
 * @author Gabriel Possato
 */
public class Exercício5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int valor[] = new int[10];
        
            for (int i = 0; i < valor.length; i ++) {
                valor[i] = i;
                
                System.out.println("VALOR: " + i);
                
                if (valor[i] % 2 == 0) {
                    valor[i] = valor[i] * 5;
                    
                    System.out.println("VALOR PAR (MULTIPLICADO POR 5): " + valor[i]);
                    System.out.println("");
                }
                
                else {
                    valor[i] = valor[i] + 5;
                    
                    System.out.println("VALOR ÍMPAR (SOMADO POR 5): " + valor[i]);
                    System.out.println("");
                }
                
            }
    
    }
    
}
