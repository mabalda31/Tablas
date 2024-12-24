/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero maximo para las tablas de multiplicar (minimo 2): ");
        int maxNumero = scanner.nextInt();

        if (maxNumero < 2) {
            System.out.println("El numero debe ser mayor o igual a 2.");
            return;
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("\n MENU ");
            System.out.println("1. Tablas ascendentes\n2. Tablas descendentes\n3. Tablas invertidas\n4. Suma por tabla\n5. Suma total\n6. Salir");
            System.out.print("Seleccione una opcion: ");

            switch (scanner.nextInt()) {
                case 1 -> mostrarTablas(maxNumero, new TablaAscendente(0), "ascendente");
                case 2 -> mostrarTablas(maxNumero, new TablaDescendente(0), "descendente");
                case 3 -> mostrarTablas(maxNumero, new TablaInvertida(0), "invertida");
                case 4 -> sumarPorTabla(maxNumero);
                case 5 -> calcularSumaTotal(maxNumero);
                case 6 -> {
                    System.out.println("Saliendo del programa. ¡Adios!");
                    salir = true;
                }
                default -> System.out.println("Opcion no valida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }

    private static void mostrarTablas(int maxNumero, TablaMultiplicar plantilla, String tipo) {
        System.out.println("\n--- Tablas en orden " + tipo + " ---");
        for (int i = 2; i <= maxNumero; i++) {
            TablaMultiplicar tabla = plantilla instanceof TablaAscendente ? new TablaAscendente(i) :
                                    plantilla instanceof TablaDescendente ? new TablaDescendente(i) :
                                    new TablaInvertida(i);
            tabla.mostrarTabla();
        }
    }

    private static void sumarPorTabla(int maxNumero) {
        System.out.println("\n Suma de resultados por tabla ");
        for (int i = 2; i <= maxNumero; i++) {
            System.out.println("Suma de la tabla del " + i + ": " + new TablaAscendente(i).sumarResultados());
        }
    }

    private static void calcularSumaTotal(int maxNumero) {
        int sumaTotal = 0;
        for (int i = 2; i <= maxNumero; i++) {
            sumaTotal += new TablaAscendente(i).sumarResultados();
        }
        System.out.println("\nSuma total de todas las tablas: " + sumaTotal);
    }
}
