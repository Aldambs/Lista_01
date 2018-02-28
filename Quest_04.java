package Lista_01;

import java.util.Scanner;

public class Quest_04 {
    /**
     * Uma loja de animais precisa de um programa para calcular os custos de 
     * criação de coelhos. O custo é calculado com a fórmula:  c = q ∗ 0,70/18+10·, 
     * onde C é o custo e Q é a quantidade de coelhos. Construa um programa que 
     * calcule e mostre o custo para criar a quantidade de coelhos que foi informada.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
       
        System.out.println("Digite a quantiade de coelhos:");
        int q = ent.nextInt();
        
        double c = (q * 0.70)/ (18 + 10);
        
        System.out.println("O custo é:\n" +c);
    }
    
}
