/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;


public abstract class Menu {
    
    private String nombrePlato;
    private double valorMenu;
    private double valorInicial;
    
     public Menu(String nombre, double valorM, double valorI){
        
        nombrePlato = nombre;
        valorMenu = valorM;
        valorInicial = valorI;      
    }
    
     //metodos establecer
     public void establecerNombrePlato(String nombre){
         nombrePlato = nombre;
     
     }
     public void establecerValorMenu(double valorM){
         valorMenu = valorM;
     
     }
     
     public void establecerValorInicial(double valorI){
         valorInicial = valorI;
     
     }
     
     //metodos obtener
     public String obtenerNombrePlato(){
         return nombrePlato;
     
     }
     
     public double obtenerValorMenu(){
         return valorMenu;
     
     }
     
     public double obtenerValorInicial(){
         return valorInicial;
     
     }
 @Override
    public String toString() {
        String cadena = String.format("Restaurante\n"
                + "%s\n"
                + "Nombre Plato: %.2f\n"
                + "Valor Menu: %.2f\n"
                + "Valor Inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenu(),
                obtenerValorInicial());

        return cadena;
    }   
     
     
    
}
