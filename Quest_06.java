package Lista_01;

import java.util.Scanner;

public class Quest_06 {
    /**
     * Faça um programa que leia as três notas de um aluno e calcule a média 
     * final deste aluno. Considerar que a média é ponderada (a média ponderada
     * é calculada através do somatório das multiplicações entre valores e pesos
     * divididos pelo somatório dos pesos) e que o peso das notas é: 2, 3 e 5, 
     * respectivamente. Exemplo: Digamos que um aluno obteve as notas 7.5, 6.0 
     * e 8.0, respectivamente. A média ponderada deste aluno será: M = ((7,5∗2)+
     * (6,0∗3)+(8,0∗5))/ 2+3+5 = 7,3
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int not1, not2, not3;
        float med;
        System.out.println("Digite a 1° nota:");
        not1 = ler.nextInt();
        System.out.println("Digite a 2° nota:");
        not2 = ler.nextInt();
        System.out.println("Digite a 3° nota:");
        not3 = ler.nextInt();
        
        med = ((not1*2) + (not2*3) + (not3 * 5))/2 + 3 + 5;
        
        System.out.println("Média do aluno é:\n" +med);
    }
    
}

