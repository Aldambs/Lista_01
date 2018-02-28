package Lista_01;

import java.util.Scanner;

public class Quest_11 {
    /**
     Marcela é uma pequena empreendedora que comprou um terreno próximo ao 
     shopping e o transformou em um estacionamento privativo com 42 vagas. 
     Para atrair mais clientes, ela cobra apenas R$ 1.75 por cada carro sem 
     limite de tempo. Ela está fazendo os cálculos de quanto pretende faturar 
     hoje e você pode ajudá-la escrevendo um programa que receba como entrada 
     a quantidade de veículos estacionados no momento, e exiba quanto ela ainda
     pode ganhar caso as vagas que estão disponíveis sejam ocupadas.
     */
    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
       
        System.out.println("Informe a quantidade de veículo:");
        int qtd_veic = ent.nextInt();
        
        double faturar = qtd_veic * 1.75;
       
        
        System.out.println("Valor a ganha é:\n" + faturar);
    }
    
}

