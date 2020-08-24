import java.util.Scanner;
public class Exec_1005{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float A, B, X;

        A=;
        B=teclado.nextFloat();
        X=((A*0.35f)+(B*0.75f))/1.1f;

        System.out.printf("MEDIA = %.5f\n", X);   
    }
} 