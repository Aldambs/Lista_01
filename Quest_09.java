package Lista_01;

import java.util.Scanner;

public class Quest_09 {
    /**
     * Desenvolva um programa que leia um valor inteiro correspondente à idade 
     * de uma pessoa em dias e informe-a em anos, meses e dias. (Observação: 
     * apenas para facilitar o cálculo, considere todo ano com 365 dias e todo 
     * mês com 30 dias)
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia, mes, ano, id_dia = 0;
        
        System.out.println("Informe o dia:");
        dia = ent.nextInt();
        System.out.println("Informe o mes:");
        mes = ent.nextInt();
        System.out.println("Informe o ano:");
        ano = ent.nextInt();
        
        id_dia = id_dia + dia;
        id_dia = id_dia + (mes * 30);
        id_dia = id_dia + (ano * 365);
        
        System.out.println("Você tem:\n" +id_dia);
    }
    
}


