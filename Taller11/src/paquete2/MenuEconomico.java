/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombre, double valorI,
            double porcentajeD) {
        super(nombre, valorI);

        porcentajeDescuento = porcentajeD;

    }

    public void establecerPorcentajeDescuento(double porcentajeD) {
        porcentajeDescuento = porcentajeD;

    }

    public void establecerValorMenu() {
        valorMenu = valorInicial - (porcentajeDescuento * valorInicial)/100;

    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;

    }

    public double obtenerValorMenu() {
        return valorMenu;

    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico:\n%s",
                super.toString());
        cadena = String.format("%s"+"\tPorcenaje Descuento: %.2f\n"
                + "\tValor Menu: %.2f\n",                
                cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }

}
