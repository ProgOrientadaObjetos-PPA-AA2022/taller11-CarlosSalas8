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
    
    public void establecerValorPostre(double valorP){
         valorPostre =  valorP;
     
     }
     public void establecerValorBebida(double valorB){
         valorBebida = valorB;
     
     }
     
     public double obtenerValorPostre(){
         return valorPostre;
     
     }
     
     public double obtenerValorBebida(){
         return valorBebida;
     
     }
    
}

