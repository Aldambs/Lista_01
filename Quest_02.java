package Lista_01;

import java.util.Scanner;

public class Quest_02 {
    /**
     * Desenvolva um programa que leia um número inteiro e exiba o resultado do 
     * quadrado deste número.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double num = ler.nextDouble();
        double n = 2;
        double resul = Math.pow(num,n);
        
        System.out.println("O resultado é: \n" +resul);
    }
    
}
