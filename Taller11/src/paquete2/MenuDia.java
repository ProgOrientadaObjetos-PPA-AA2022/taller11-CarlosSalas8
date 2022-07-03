/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;
    
    public MenuDia(String nombre, double valorI,
            double valorP, double valorB){
        super(nombre,valorI);
        
        valorPostre = valorP;
        valorBebida = valorB;
    
    }

    public void establecerValorPostre(double valorP) {
        valorPostre = valorP;

    }

    public void establecerValorBebida(double valorB) {
        valorBebida = valorB;

    }
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + valorPostre + valorBebida;
        
    }

    public double obtenerValorPostre() {
        return valorPostre;

    }

    public double obtenerValorBebida() {
        return valorBebida;

    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Dia:\n%s",
                super.toString());
                cadena = String.format("%s"+"\tValor Postre: %.2f\n"
                + "\tValor Bebida: %.2f\n"
                + "\tValor Menu: %.2f\n",
                cadena,
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenerValorMenu());

        return cadena;
    }

}
