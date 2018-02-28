package Lista_01;

import java.util.Scanner;

public class Quest_07 {
    /**Faça um programa que leia o número de um funcionário, seu número de 
    horas trabalhadas, o valor que recebe por hora e calcula o salário desse 
    funcionário. A seguir, mostre o número e o salário do funcionário.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o número de funcionário:");
        int num = ler.nextInt();
        System.out.println("Entre com o número de horas trabalhadas:");
        int hora = ler.nextInt();
        System.out.println("Entre com o valor/hora do funcionário:");
        int valor_hora = ler.nextInt();
        
        float salario = hora * valor_hora;
        
        System.out.println("O salário é:\n" +salario);
        
    }
    
}
