/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Menu;

/**
 *
 * @author SALA I
 */
public abstract class Cuenta {

    private String nombreCliente;
    private Menu listado;
    private double valorTotal;
    private double subTotal;
    private double iva;

    public Cuenta(String nombre, Menu lis, double valorT,
            double sub, double iv) {

        nombreCliente = nombre;
        listado = lis;
        valorTotal = valorT;
        subTotal = sub;
        iva = iv;
    }

    //metodos establecer
    public void establecerNombreCliente(String nombre) {
        nombreCliente = nombre;

    }

    public void establecerListado(Menu lis) {
        listado = lis;

    }

    public void establecerValorTotal(double valorT) {
        valorTotal = valorT;

    }

    public void establecerSubTotal(double sub) {
        subTotal = sub;

    }

    public void establecerIva(double iv) {
        iva = iv;

    }

    //metodos obtener
    public String obtenerNombreCliente() {
        return nombreCliente;

    }

    public Menu obtenerLista() {
        return listado;

    }

    public double obtenerValorTotal() {
        return valorTotal;

    }

    public double obtenerSubTotal() {
        return subTotal;

    }

    public double obtenerIva() {
        return iva;

    }
     
    @Override
    public String toString() {
        String cadena = String.format("Cuenta\n"
                + "%s\n"
                + "Nombre Cliente: %.2f\n"
                + "Listado: %.2f\n"
                + "Valor Inicial: %.2f\n",
                obtenerLista(),
                obtenerValorMenu(),
                obtenerValorInicial());

        return cadena;
    }


}

