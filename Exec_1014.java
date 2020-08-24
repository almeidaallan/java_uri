import java.util.Scanner;
public class Exec_1014{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int distancia;
        float consumo, km;


        distancia=teclado.nextInt();
        km=teclado.nextFloat();
        

        consumo = distancia / km;

        System.out.printf("%.3f km/l\n",consumo);
    }
}

