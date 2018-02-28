package Lista_01;

import java.text.DecimalFormat;
import java.util.*;

public class Quest_15 {

    /**
     * Joãozinho quer calcular e mostrar a quantidade de litros de combustível
     * gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para
     * isso, ele gostaria que você o auxiliasse através de um simples programa.
     * Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em
     * horas) e a velocidade média durante a mesma (em km/h). Assim pode-se
     * obter distância percorrida e em seguida calcular quantos litros seriam
     * necessários. Mostre o valor com três casas decimais após o ponto.
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
       
        System.out.println("Entre com o tempo gasto:");
        int tm = ent.nextInt();
        System.out.println("Entre com a velocidade gasta:");
        int vm = ent.nextInt();
        
        int dist = tm * vm;
        float litro = (dist * 1) / 12;
        
        System.out.println("Litros gasto é:\n" +df.format(litro));
    }

}
