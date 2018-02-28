package Lista_01;

import java.util.Scanner;

public class Quest_01 {
    /**
      Faça um programa que leia um valor representando o gasto realizado por um
      cliente do restaurante COMABEM, bem como a percentual de serviço. Ao 
      final, o programa devera imprimir o valor total a ser pago, incluindo o 
      percentual do garçom.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float perc, gasto, pago;
        
        System.out.println("Entre com o valor gasto:");
        gasto = ler.nextFloat();
        
        perc = (gasto*10)/100;
        pago = gasto + perc;
        
        System.out.println("O valor a ser pago é:\n" +pago);
        
    }
    
}
