package Lista_01;

import java.util.Scanner;

public class Quest_08 {
    /**
     * Construa um programa que calcule o consumo médio de um automóvel sendo 
     * fornecidos a distância total percorrida (em Km) e o total de combustível
     * gasto (em litros).
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double dist, comb, cons;
        
        System.out.println("Digite a distância pecorrida:");
        dist = ent.nextDouble();
        System.out.println("Digite o gasto de combustivel:");
        comb = ent.nextDouble();
        
        cons = dist / comb;
        System.out.println("O consumo médio é:\n" +cons);
    }
    
}

