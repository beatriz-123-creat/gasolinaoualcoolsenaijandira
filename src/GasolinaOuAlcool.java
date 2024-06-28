import java.util.Scanner;

public class GasolinaOuAlcool {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço da gasolina: ");
        double valorGasolina = leitor.nextDouble();

        System.out.print("Digite o preço do álcool: ");
        double valorAlcool = leitor.nextDouble();

        double calculo1 = valorGasolina * 0.7;

        System.out.println("******************************************");
        System.out.println("             GASOLINA OU ÁLCOOL           ");
        System.out.println("******************************************");
        System.out.println();
        System.out.println("Preço da gasolina: " + valorGasolina);
        System.out.println("Preço do Álcool: " + valorAlcool);
        System.out.println("Valor proporcional a gasolina em relação ao álcool: " + calculo1);
        System.out.println();
        System.out.println();
        System.out.println("******************************************");
        if (calculo1 >= valorAlcool) {
            System.out.println("No momento é mais vantajoso utilizar a GASOLINA");
        }else {
            System.out.println("No momento é mais vantajoso utilizar o ÁLCOOL!");
        }
    }
}
