/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.Cuenta;
import paquete2.Menu;
import paquete2.MenuCarta;
import paquete2.MenuDia;
import paquete2.MenuEconomico;
import paquete2.MenuNinos;

/**
 *
 * @author salas
 */
public class Ejecutor01 {

    public static void main(String[] args) {

        ArrayList<Menu> listado = new ArrayList();

        MenuNinos m1 = new MenuNinos("Niños 01", 2.00, 1.00, 1.50);
        m1.establecerValorMenu();
        listado.add(m1);

        MenuNinos m2 = new MenuNinos("Niños 02", 3.00, 1.00, 1.50);
        m2.establecerValorMenu();
        listado.add(m2);
        
        MenuEconomico me = new MenuEconomico("Econo 01",4.00,25.00);
        me.establecerValorMenu();
        listado.add(me);
        
        MenuDia md = new MenuDia("Dia 001",5.00,1.00,1.00);
        md.establecerValorMenu();
        listado.add(md);
        
        MenuCarta mc = new MenuCarta("Carta 001",6.0,1.5,2.0,10.00);
        mc.establecerValorMenu();
        listado.add(mc);
        
        
        Cuenta cuenta = new Cuenta("Rene elizalde",listado,10);
        for (int i = 0; i < listado.size(); i++) {
            cuenta.establecerSubTotal();
            cuenta.establecerValorTotal();
            
        }
        System.out.println(cuenta);

    }
   
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Niño:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Niño:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

 */
