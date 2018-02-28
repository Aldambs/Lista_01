package Lista_01;

import java.util.Scanner;

public class Quest_10 {
    /**
      Construa um programa que faça a leitura de quatros números e mostre o 
      resultado dois a dois da adição e multiplicação, baseando-se na utilização
      da propriedade distributiva para combinar os números informados. Exemplo:
      se forem lidos os números 2, 3, 5 e 8, devem ser somados e multiplicados 
      2 com 3, 2 com 5 e 2 com 8, depois 3 com 5, 3 com 8 e por fim 5 com 8. 
      (Observação: será necessário definir seis operações para cada tipo de operação)
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n1, n2, n3, n4, adi, mult;
        System.out.println("Informe o 1° número:");
        n1 = ent.nextInt();
        System.out.println("Informe o 2° número:");
        n2 = ent.nextInt();
        System.out.println("Informe o 3° número:");
        n3 = ent.nextInt();
        System.out.println("Informe o 4° número:");
        n4 = ent.nextInt();
        
        adi = (n1 + n2) + (n1 + n3) + (n1 + n4) + (n2 + n3) + (n2 + n4) + (n3 + n4);
        mult = (n1 * n2) + (n1 * n3) + (n1 * n4) + (n2 * n3) + (n2 * n4) + (n3 * n4);
        
        System.out.println("Resultado da adição:\n" +adi);
        System.out.println("Resultado da multiplicação:\n" +mult);
    }
    
}
