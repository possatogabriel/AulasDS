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
    
        String[] nome = new String[10];
        int encerrar = 0;
        
        for (int i = 0; i < 10; i ++) {
            System.out.println("Escreva o " + (i + 1) + "º nome: ");
            nome[i] = input.next();        
        }
        
        System.out.println("Escreva um nome para confirmar que está na lista: ");
        String confirma = input.next();
        
            for (int j = 0; j < 10; j ++) {
                encerrar ++;
                if (confirma.equals(nome[j])) {
                    System.out.println("NOME ENCONTRADO! :D ");
                    return;
                }
                
                else if (encerrar == 9) {
                    System.out.println("NOME NÃO ENCONTRADO! :/ ");
                    return;
                }
                
            }
                
    }
        
}
    

