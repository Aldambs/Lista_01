package Lista_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest_14 {
    /**
     Catarina trabalha na empresa Kids Play e vende jogos educativos de porta 
     em porta. Cada jogo custa R$ 19.90 e ela recebe como salário 50% do valor
     total de suas vendas no mês. Além disso, a cada 15 jogos vendidos, ela 
     recebe um bônus de 8% do total de vendas. Desenvolva um programa que receba
     como entrada a quantidade de jogos vendidos esse mês por Catarina e exiba
     três valores: o valor total arrecadado em vendas, o valor ganho como bônus,
     e o valor total que Catarina receberá no mês.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite a quantidade de jogos vendidos:");
        int jogos_ven = ent.nextInt();
        float v_total, v_ganho, v_recebe;
        
        v_total = (float) (jogos_ven * 19.90);
        v_ganho = v_total + (8/100) + 15;
        v_recebe = v_total + (50/100) + v_ganho;
        
        System.out.println("O valor total é:\n" +df.format(v_total));
        System.out.println("O valor ganho é:\n" +df.format(v_ganho));
        System.out.println("O valor a receber é:\n" +df.format(v_recebe));
    }  
}
