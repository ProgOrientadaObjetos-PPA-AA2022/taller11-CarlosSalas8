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
    
    

    public void establecerPorcentajeDescuento(double porcentajeD) {
        porcentajeDescuento = porcentajeD;

    }

    public double obtenerPorcentajeDescuento() {
        return  porcentajeDescuento;

    }

}
