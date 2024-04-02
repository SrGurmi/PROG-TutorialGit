import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce un numerito");

    int askedNumber = scanner.nextInt();

    System.out.println("¡Hola Mundo! Tu numero es: " + askedNumber);

    scanner.close();
}

}