import Utilities.ScannerManager;

import java.util.Scanner;

public class ImprmieEnConsola {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);


        final var edad = ScannerManager.leerInt(scanner, "Ingresa la Edad:");
        final var nombre = ScannerManager.leerString(scanner, "Ingresa la nombre:");
        final var estatura = ScannerManager.leerDouble(scanner, "Ingresa la estatura:");

        scanner.close();

        imprimirResultado(nombre, edad, estatura);


    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("el nombre es %s Tiene la edad de %d la estatura es %.2fcm%n", nombre, edad, estatura);
    }

}
