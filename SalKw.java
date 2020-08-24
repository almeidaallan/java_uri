import java.util.Scanner;
public class SalKw{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double salario, kw, valkw, consumokw, valordesconto;

        System.out.println("Digite salario Minimo: ");
        salario=teclado.nextFloat();
        System.out.println("Digite o consumo de KW: ");
        kw=teclado.nextFloat();

        valkw = ((salario/7)/100);
        consumokw = kw * valkw;
        valordesconto = (consumokw * 0.9);

        System.out.println("Valores do KW: " + valkw + " Reais");
        System.out.println("Valor a ser pago: " + consumokw + " Reais");
        System.out.println("Valores com desconto: " + valordesconto + " Reais");
    }
}