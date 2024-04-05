/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício3;
import java.util.Scanner;
/**
 *
 * @author Gabriel Possato
 */
public class Exercício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float n1, n2, media, sub, mult, div;
        int escolha;
        
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextFloat();
        
        System.out.println("Digite o segundo número: ");
        n2 = input.nextFloat();
        
        System.out.println("Escolha uma opção: ");
        System.out.println("MÉDIA - 1");
        System.out.println("DIFERENÇA - 2");
        System.out.println("PRODUTO - 3");
        System.out.println("DIVISÃO - 4");
        
        escolha = input.nextInt();
        
            media = (n1 + n2) / 2;
            sub = n1 - n2;
            mult = n1 * n2;
            div = n1 / n2;
       
        switch (escolha) {
            
            case 1:
                System.out.println("O resultado da opção escolhida (MÉDIA) é: " + media);
                break;
                
            case 2:
                System.out.println("O resultado da opção escolhida (DIFERENÇA) é: " + sub);
                break;
                
            case 3:
                System.out.println("O resultado da opção escolhida (PRODUTO) é: " + mult);
                break;
                
            case 4:
                System.out.println("O resultado da opção escolhida (DIVISÃO) é: " + div);
                break;
                
            default:
                System.out.println("O valor inserido é inválido. ");
        }
    }
    
}
