/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        int lados, valor1, valor2, valor3, valor4, valor5, valor6, valor7, meio, ladosmenos2;
        
        valor1 = 0;
        valor2 = 0;
        valor3 = 0;
        valor4 = 0;
        valor5 = 0;   
        valor6 = 0;
        valor7 = 0;
        
        System.out.println("Escreva o número de lados do quadrado: ");
        lados = input.nextInt();
        
        meio = lados - 2;
        ladosmenos2 = lados - 2;
        
            while (valor1 != lados) {
                valor1 ++;
                
                System.out.print("*");
            }
            
                if (valor1 == lados) {
                    valor2 ++;
                    
                    System.out.println("");
                }
                
                if (valor2 > 0) {
                    while (valor6 != meio) {
                        while (valor3 != 1) {
                            valor3 ++;
                            
                            System.out.print("*");
                        }
                        
                        if (valor3 == 1) {
                                while (valor4 != ladosmenos2) {
                                    valor4 ++;
                                    
                                    System.out.print(".");
                                }
                                
                                if (valor4 == ladosmenos2) {
                                        while (valor5 != 1) {
                                            valor5 ++;
                                            
                                            System.out.print("*");   
                                        }
                                        
                                            if (valor5 == 1) {
                                                System.out.println("");
                                                
                                                valor3 = 0;
                                                valor4 = 0;
                                                valor5 = 0;
                                                
                                                valor6 ++;
                                            }
                                            
                                }
                                        
                        }
                                
                    }
                    
                    if (valor6 == meio) {
                        while (valor7 != lados) {
                        valor7 ++;
                                                    
                        System.out.print("*");
                                                    
                            if (valor7 == lados) {
                                break;
                            }
                            
                        }
                
                    }
                    
                }     
            
    }
    
}