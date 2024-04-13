/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício2;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        int n[] = new int[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Escreva a nota: ");
            n[i] = input.nextInt();
                    
            System.out.println("");

                        int media = (n[0] + n[1]) / 2;
                        
                        if (i == 1) {
                            System.out.println("A média das notas é: " + media);
                            System.out.println("");
                            System.out.println("DESEJA REALIZAR UM NOVO CÁLCULO? (S/N)");
                            String escolha = input.next();
                                
                                if (escolha.equals("S")) {
                                    i = -1;
                                }
                                
                                else if (escolha.equals("N")) {
                                    break;
                                }
                                
                                else {
                                    System.out.println("VALOR INVÁLIDO! ");
                                }
                        
                        }
                
        }
    
    }
    
}
    
