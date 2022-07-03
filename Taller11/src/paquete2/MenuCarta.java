/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class MenuCarta extends Menu {

    private double porcionGuarnicion;
    private double valorBebida;
    private double valorAdicional;

    public MenuCarta(String nombre, double valorI,
            double porcionG, double valorB, double valorA) {
        super(nombre, valorI);

        porcionGuarnicion = porcionG;
        valorBebida = valorB;
        valorAdicional = valorA;

    }

    public void establecerPorcionGuarnicion(double porcionG) {
        porcionGuarnicion = porcionG;

    }

    public void establecerValorBebida(double valorB) {
        valorBebida = valorB;

    }

    public void establecerValorAdicional(double valorA) {
        valorAdicional = valorA;

    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + porcionGuarnicion + valorBebida;
        valorMenu = valorMenu + ((valorAdicional * valorMenu) / 100);

    }

    //metodos obtener
    public double obtenerPorcionGuarnicion() {
        return porcionGuarnicion;

    }

    public double obtenerValorBebida() {
        return valorBebida;

    }

    public double obtenerValorAdicional() {
        return valorAdicional;

    }

    public double obtenerValorMenu() {
        return valorMenu;

    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Carta:\n%s",
                super.toString());
        cadena = String.format("%s"+ "\tPorcion Guarnicion: %.2f\n"
            + "\tValor bebida: %.2f\n"
            + "\tValor Adicional: %.2f\n"
            + "\tValor Menu: %.2f\n",
                cadena,
                obtenerPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerValorAdicional(),
                obtenerValorMenu());

        return cadena;
    }

}
