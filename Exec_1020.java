import java.util.Scanner;
public class Exec_1020{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int dias_vividos, ano, mes, dias;


        dias_vividos=teclado.nextInt();


        ano=dias_vividos/365;
        mes=(dias_vividos%365)/30;
        dias=(dias_vividos%365)%30;


        System.out.println(ano + " ano(s)") ;
        System.out.println(mes + " mes(es)") ;
        System.out.println(dias + " dia(s)") ;


    }
}
