/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício1;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        
        System.out.println("Digite o código: ");
        n1 = input.nextInt();
        
        switch(n1) {
            
            case 1: 
                System.out.println("A classificação do produto é: ALIMENTO NÃO-PERECÍVEL");
                break;
                
            case 2: 
                System.out.println("A classificação do produto é: ALIMENTO PERECÍVEL");
                break;
                
            case 3: 
                System.out.println("A classificação do produto é: ALIMENTO PERECÍVEL");
                break;
                
            case 4: 
                System.out.println("A classificação do produto é: ALIMENTO PERECÍVEL");
                break;
                
            case 5: 
                System.out.println("A classificação do produto é: VESTUÁRIO");
                break;
                
            case 6: 
                System.out.println("A classificação do produto é: VESTUÁRIO");
                break;
                
            case 7: 
                System.out.println("A classificação do produto é: HIGIENE PESSOAL");
                break;
                
            case 8: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            case 9: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");   
                break;
                
            case 10: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            case 11: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            case 12: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            case 13: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            case 14: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            case 15: 
                System.out.println("A classificação do produto é: LIMPEZA E UTENSÍLIOS DOMÉSTICOS");
                break;
                
            default:
                System.out.println("O código inserido é inválido. ");
                
        }
        
    }
    
}
