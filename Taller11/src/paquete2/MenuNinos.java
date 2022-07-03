/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public class MenuNinos extends Menu {

    private double porcionHelado;
    private double porcionPastel;

    public MenuNinos(String nombre, double valorI,
            double porcionH, double porcionP) {
        super(nombre, valorI);

        porcionHelado = porcionH;
        porcionPastel = porcionP;

    }

    public void establecerPorcionHelado(double porcionH) {
        porcionHelado = porcionH;

    }

    public void establecerPorcionPastel(double porcionP) {
        porcionPastel = porcionP;

    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + porcionHelado + porcionPastel;

    }

    public double obtenerPorcionHelado() {
        return porcionHelado;

    }

    public double obtenerPorcionPastel() {
        return porcionPastel;

    }

    public double obtenerValorMenu() {
        return valorMenu;

    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Niños:\n%s",
                super.toString());
        cadena = String.format("%s"+"\tPorcion Helados: %.2f\n"
                + "\tPorcion Pastel: %.2f\n"
                +"\tValor Menu: %.2f\n",
                cadena,
                obtenerPorcionHelado(),
                obtenerPorcionPastel(),
                obtenerValorMenu());

        return cadena;
    }
}
