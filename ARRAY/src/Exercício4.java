/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício4;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        int nota1[] = new int[20];
        int nota2[] = new int[20];
        int media[] = new int[20];
        int media_final = 0;
        int n = 0;
        
        int aluno = 1;
        
            for (int i = 0; i < nota1.length; i ++) {
                System.out.print("Escreva a primeira nota do aluno " + aluno + ": ");
                nota1[i] = input.nextInt();
                
                System.out.print("Escreva a segunda nota do aluno " + aluno + ": ");
                nota2[i] = input.nextInt();
                
                aluno ++;
            }
            
            for (int i2 = 0; i2 < nota1.length; i2 ++) {
                media[i2] = (nota1[i2]+ nota2[i2]) / 2;        
            }
            
            for (int j = 0; j < nota1.length; j ++) {
                media_final += media[j]; 
            }
            
                media_final = media_final / 20; 
            
            for (int j2 = 0; j2 < nota1.length; j2 ++) {
                if (media[j2] > media_final) {
                    n ++;
                }
                
                if (j2 == 19) {
                    System.out.println("MÉDIA DA SALA: " + media_final);
                    System.out.println("QUANTIDADE DE ALUNOS QUE OBTIVERAM MÉDIA ACIMA DA MÉDIA DA SALA: " + n);
                }
                
            }
        
    }
    
}
