/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public abstract class Menu {

    private String nombrePlato;
    double valorMenu;
    double valorInicial;

    public Menu(String nombre, double valorI) {

        nombrePlato = nombre;
        valorInicial = valorI;
    }

    //metodos establecer
    public void establecerNombrePlato(String nombre) {
        nombrePlato = nombre;

    }

    public abstract void establecerValorMenu();

    public void establecerValorInicial(double valorI) {
        valorInicial = valorI;

    }

    //metodos obtener
    public String obtenerNombrePlato() {
        return nombrePlato;

    }

    public double obtenerValorInicial() {
        return valorInicial;

    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tNombre Plato: %s\n"
                + "\tValor Inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial());

        return cadena;
    }

}
