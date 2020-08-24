import java.util.Scanner;
public class Exec_1018{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int reais, notas_cem, notas_vinte, notas_cinque, resto_cinque, notas_dez, resto_dez, notas_cinco, resto, notas_dois;

        reais = teclado.nextInt();

        System.out.println(reais);

        notas_cem = reais / 100;
        System.out.println(notas_cem + " nota(s) de R$ 100,00");

    
        resto = reais % 100;
        notas_cinque = resto / 50;
        System.out.println(notas_cinque + " nota(s) de R$ 50,00");

        resto = resto % 50;
        notas_vinte = resto / 20;
        System.out.println(notas_vinte+ " nota(s) de R$ 20,00");

        resto = resto % 20;
        notas_dez = resto / 10;
        System.out.println(notas_dez + " nota(s) de R$ 10,00");

        resto = resto % 10;
        notas_cinco = resto / 5;
        System.out.println(notas_cinco + " nota(s) de R$ 5,00");

        resto = resto % 5;
        notas_dois = resto / 2;
        System.out.println(notas_dois + " nota(s) de R$ 2,00");

        resto = resto % 2;
        System.out.println(resto + " nota(s) de R$ 1,00");    
        

    }
}