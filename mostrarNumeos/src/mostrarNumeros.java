
import java.util.Scanner;



public class mostrarNumerosefsd {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Por favor, ingresa el primer número:");

        double numero1 = scanner.nextDouble();



        System.out.println("Ahora, ingresa el segundo número:");

        double numero2 = scanner.nextDouble();



        System.out.println("Los números ingresados son:");

        System.out.println("Número 1: " + numero1);

        System.out.println("Número 2: " + numero2);



        scanner.close();

    }

}