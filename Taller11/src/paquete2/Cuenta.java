/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import java.util.ArrayList;


/**
 *
 * @author SALA I
 */
public class Cuenta {

    private String nombreCliente;
    ArrayList<Menu> listado = new ArrayList<>();
    private double valorTotal;
    private double subTotal;
    private double iva;

    public Cuenta(String nombre, ArrayList<Menu> lis, double iv) {

        nombreCliente = nombre;
        listado = lis;
        iva = iv;
    }

    //metodos establecer
    public void establecerNombreCliente(String nombre) {
        nombreCliente = nombre;

    }

    public void establecerListado(ArrayList<Menu> lis) {
        listado = lis;

    }

    public void establecerValorTotal() {
        valorTotal = subTotal+(subTotal*(iva/100));

    }

    public void establecerSubTotal() {
        double sub = 0;
        for (int i = 0; i < listado.size(); i++) {
            sub = sub + listado.get(i).obtenerValorMenu();
            
        }
        subTotal = sub;

    }

    public void establecerIva(double iv) {
        iva = iv;

    }

    //metodos obtener
    public String obtenerNombreCliente() {
        return nombreCliente;

    }

    public ArrayList<Menu> obtenerLista() {
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
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n",
                nombreCliente);
        for (int i = 0; i < listado.size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    listado.get(i));
        }
        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                subTotal,
                iva,
                valorTotal);
        return cadena;
    }


}

