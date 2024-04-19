/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício12;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
        int maior = 0;
        int menor = 1001;
        
            System.out.print("Digite a quantidade de números inseridos: ");
            int n = input.nextInt();
            int loop = n;
            
            System.out.println("");
            
                for (int i = 0; i < loop; i++) {
                    System.out.print("Digite o número: ");
                    int n1 = input.nextInt();
                        if (n1 < 0 || n1 > 1000) {
                            i --;
                        }
                            
                        else if (n1 < menor){
                            menor = n1;
                        }
                            
                        else {
                            if (n1 > maior) {
                                maior = n1;
                            }   
                        }
                            
                            if (i == loop - 1) {
                                int soma = maior + menor;
                                System.out.println("MENOR NÚMERO: " + menor);
                                System.out.println("");
                                System.out.println("MAIOR NÚMERO: " + maior);
                                System.out.println("");
                                System.out.println("SOMA DOS NÚMEROS: " + soma);
                            }
                                
                                
                }
                  
    }
    
}