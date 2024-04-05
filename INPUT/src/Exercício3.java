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
        
            String nome;
            float salario_fixo, vendas, comissao, salario_final;
            
                System.out.println("Escreva o nome do vendedor: ");
                nome = input.next();
                        
                System.out.println("");
                
                System.out.println("Digite o salário fixo: ");
                salario_fixo = input.nextFloat();
                
                System.out.println("");
                
                System.out.println("Digite o número de vendas por mês (em dinheiro): ");
                vendas = input.nextFloat();
                
                    comissao = vendas * (float) 0.15;
                    
                    salario_final = salario_fixo + comissao;
                    
                    System.out.println("");
                    
                    System.out.println("Nome do vendedor: " + nome);
                    System.out.println("Salário fixo: " + salario_fixo);
                    System.out.println("Salário final: " + salario_final);
                    
    }
    
}
