/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablas;

public abstract class TablaMultiplicar {
    protected int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarTabla();

    public int sumarResultados() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }
}