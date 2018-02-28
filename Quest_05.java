package Lista_01;

import java.util.Scanner;

public class Quest_05 {
    /**
     * Faça um programa que calcule e mostre o valor de uma prestação em atraso, 
     * utilizando a fórmula: p = v + (v * (j/100) * t), onde P é o valor da 
     * prestação, V é o valor da compra, J é a taxa e T é o tempo.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra:");
        float v = ent.nextFloat();
        System.out.println("Digite a taxa de juro:");
        float j = ent.nextFloat();
        System.out.println("Digite o tempo:");
        int t = ent.nextInt();
        
        float p = v + (v * (j/100) * t);
        System.out.println("O valor da prestação em atraso é:\n" +p);
        
        
    }
    
}
