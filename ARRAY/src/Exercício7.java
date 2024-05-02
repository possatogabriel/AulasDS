/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício7;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        float temp_media_dia[] = new float[365];
        
        float maior = 0;
        float menor = 70;
        
        int n = 0;
        
            for (int i = 0; i < temp_media_dia.length; i ++) {
                System.out.print("Escreva a temperatura média: ");
                temp_media_dia[i] = input.nextFloat();
            }
            
            for (int j = 0; j < temp_media_dia.length; j ++) {
                float temp_media_anual = temp_media_dia[j] / temp_media_dia.length;
                
                if (temp_media_dia[j] < temp_media_anual) {
                    n ++;
                }
                
                    if (temp_media_dia[j] > maior) {
                        maior = temp_media_dia[j];
                    }

                    else if (temp_media_dia[j] < menor && temp_media_dia[j] < maior) {
                        menor = temp_media_dia[j];
                    }
                    
                        if (j == temp_media_dia.length - 1) {
                            System.out.println("MENOR TEMPERATURA DO ANO: " + menor);
                            System.out.println("");
                            System.out.println("MAIOR TEMPERATURA DO ANO: " + maior);
                            System.out.println("");
                            System.out.println("TEMPERATURA MÉDIA ANUAL: " + temp_media_anual);
                            System.out.println("");
                            System.out.println("QUANTIDADE DE DIAS EM QUE A TEMPERATURA MÉDIA É INFERIOR A TEMPERATURA MÉDIA ANUAL: " + n);
                        }
                
            }
        
    }
    
}
