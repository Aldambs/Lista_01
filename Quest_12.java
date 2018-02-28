package Lista_01;

import java.util.Scanner;

public class Quest_12 {
    /**
     * Soraia foi fazer compras no supermercado de seu bairro e tomou um susto! 
     * A dúzia de laranjas está caríssima, custando R$ 8,35! Faça um programa 
     * que receba como entrada a quantidade total de laranjas que Soraia deseja 
     * comprar, e exiba quantas dúzias ela vai adquirir e o valor total necessário 
     * para realizar a compra. (Dica: uma dúzia corresponde a 12 laranjas, mas 
     * cada laranja também pode ser vendida separadamente)
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de laranja:");
        int qtd_laranja = ent.nextInt();
   
        double qts_duzia = qtd_laranja / 12;
        double valor_total = qts_duzia * 8.35;
                
        System.out.println("Número de duzia desejada é:\n" + qts_duzia);
        System.out.println("O valor total é:\n" +valor_total);
        
    }
    
}
