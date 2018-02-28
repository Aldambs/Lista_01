package Lista_01;

import java.util.Scanner;

public class Quest_13 {
    /**
     O custo ao consumidor de um carro novo é a soma do custo de fábrica com 
     a percentagem do distribuidor e dos impostos (somados ao custo de fábrica)
     Supondo que a percentagem do distribuidor seja de 28% e os impostos de 
     45%, faça um programa que leia o custo de fábrica de um carro e exiba ao 
     final o custo do carro para o consumidor, o percentual que o distribuidor 
     recebe e o valor pago em impostos.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double custo, porc, cust;
        
        System.out.println("Entre com o custo de fábrica do carro:");
        custo = ent.nextDouble();
        porc = (custo * 0.28) + custo;
        cust = (porc * 0.45) + porc;
        
        System.out.println("O valor do automóvel para o cosumo é:\n" +cust);
        
        
    }
    
}

