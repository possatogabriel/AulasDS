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
        
        int escolha;
        
        System.out.println("Digite o código do produto: ");
        System.out.println("");
        System.out.println("100 - CACHORRO QUENTE");
        System.out.println("101 - BAURU SIMPLES");
        System.out.println("102 - BAURU COM OVO");
        System.out.println("103 - HAMBÚRGUER");
        System.out.println("104 - CHEESEBURGUER");
        System.out.println("105 - REFRIGERANTE");
        
        escolha = input.nextInt();
        
        switch (escolha){
            
            case 100:
                System.out.println("O valor a pagar será: R$ 1,70");
                break;
                
            case 101:
                System.out.println("O valor a pagar será: R$ 2,30");
                break;
                
            case 102:
                System.out.println("O valor a pagar será: R$ 2,60");
                break;
                
            case 103:
                System.out.println("O valor a pagar será: R$ 2,40");
                break;
                
            case 104:
                System.out.println("O valor a pagar será: R$ 2,50");
                break;
                
            case 105:
                System.out.println("O valor a pagar será: R$ 1,00");
                break;    
                
            default:
                System.out.println("O valor inserido é inválido. ");
                break;
        }
        
    }
    
}
