import java.util.Scanner;
public class combustivel{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        float tmpviajem, velocidade, distancia, consumo;

        System.out.println("Digite o Tempo de viagem: ");
        tmpviajem=teclado.nextFloat();
        System.out.println("Digite a velocidade média: ");
        velocidade=teclado.nextFloat();

        distancia = tmpviajem * velocidade;

        consumo = distancia / 12;

        System.out.println("Consumo foi de: " + consumo + " Litros");
    }
}