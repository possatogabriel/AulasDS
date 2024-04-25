/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício2;

/**
 *
 * @author Gabriel Possato
 */
public class Exercício2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int var[] = new int[51];
        
            for (int i = 0; i < 51; i++) {
                var[i] = i;
            }
            
            for (int j = 50; j > 0; j --) {
                System.out.println(var[j]);
            }
            
    }
    
}
