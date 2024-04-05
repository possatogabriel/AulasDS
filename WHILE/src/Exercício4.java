/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        
        int alunos, valor;
        float nota, result, media; 
        
        valor = 0;
        result = 0;
        
        System.out.println("Escreva a quantidade de alunos: ");
        alunos = input.nextInt();
        
        while (valor != alunos) {
            valor ++;
            
            System.out.println("Escreva a nota: ");
            nota = input.nextFloat();
            
            result = (float) nota + result;
            
                media = (float) result / alunos;
                
                if (valor == alunos) {
                    System.out.println("A média aritmética da turma é: " + media);
                }
                
        }
         
    }
    
}
