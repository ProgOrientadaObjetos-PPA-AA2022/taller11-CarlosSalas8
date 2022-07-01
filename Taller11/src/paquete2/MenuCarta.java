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
    
    
    
    public void establecerPorcionGuarnicion(double porcionG){
         porcionGuarnicion =  porcionG;
     
     }
     public void establecerValorBebida(double valorB){
         valorBebida = valorB;
     
     }
     
     public void establecerValorAdicional(double valorA){
         valorAdicional = valorA;
     
     }
     
     //metodos obtener
     public double obtenerPorcionGuarnicion(){
         return porcionGuarnicion;
     
     }
     
     public double obtenerValorMenu(){
         return valorBebida;
     
     }
     
     public double obtenerValorInicial(){
         return valorAdicional;
     
     }
     
     
    
    
    
}


