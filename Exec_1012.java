import java.util.Scanner;
public class Exec_1012{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A=teclado.nextDouble();
        B=teclado.nextDouble();
        C=teclado.nextDouble(); 

        triangulo = (A*C/2);
        circulo = 3.14159f*C*C;
        trapezio=((A+B)*C)/2;
        quadrado=B*B;
        retangulo=A*B;

        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);

    }
}
