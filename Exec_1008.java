import java.util.Scanner;
public class Exec_1008{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int numfunc, horastrabalhadas;
        float salario_hora, slario_final;

        numfunc=teclado.nextInt();
        horastrabalhadas=teclado.nextInt();
        salario_hora=teclado.nextFloat();

        slario_final = salario_hora*horastrabalhadas;

        System.out.println("NUMBER = "+numfunc);
        System.out.printf("SALARY = U$ %.2f\n",slario_final);
    }
}