/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablas;

public class TablaAscendente extends TablaMultiplicar {

    public TablaAscendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        System.out.println("Tabla del " + numero + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}