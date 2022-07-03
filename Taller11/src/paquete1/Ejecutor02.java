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
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> listado = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        for (int i = 0; i < datos001.length; i++) {

            String nombrePlato = datos001[i][0];
            double valorInicial = Double.parseDouble(datos001[i][1]);
            double porcionHelado = Double.parseDouble(datos001[i][2]);
            double porcionPastel = Double.parseDouble(datos001[i][3]);
            MenuNinos m1 = new MenuNinos(nombrePlato, valorInicial,
                    porcionHelado, porcionPastel);
            listado.add(m1);

        }

        for (int i = 0; i < datos002.length; i++) {

            String nombrePlato = datos002[i][0];
            double valorInical = Double.parseDouble(datos002[i][1]);
            double porcentajeDescuento = Double.parseDouble(datos002[i][2]);

            MenuEconomico me = new MenuEconomico(nombrePlato,
                    valorInical, porcentajeDescuento);
            listado.add(me);

        }

        for (int i = 0; i < datos003.length; i++) {

            String nombrePlato = datos003[i][0];
            double valoInicial = Double.parseDouble(datos003[i][1]);
            double valorPostre = Double.parseDouble(datos003[i][2]);
            double valorBebida = Double.parseDouble(datos003[i][3]);

            MenuDia md = new MenuDia(nombrePlato,
                    valoInicial, valorPostre, valorBebida);
            listado.add(md);

        }

        for (int i = 0; i < datos004.length; i++) {

            String nombrePlato = datos004[i][0];
            double valorInicial = Double.parseDouble(datos004[i][1]);
            double porcionGuarnicion = Double.parseDouble(datos004[i][2]);
            double valorBebida = Double.parseDouble(datos004[i][3]);
            double valorAdicional = Double.parseDouble(datos004[i][4]);
            MenuCarta mc = new MenuCarta(nombrePlato,
                    valorInicial, porcionGuarnicion, valorBebida, valorAdicional);
            listado.add(mc);
        }

        // Fin de solución
        for (int i = 0; i < listado.size(); i++) {
            listado.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta cuenta = new Cuenta("Luis Andrade", listado, 10);
        cuenta.establecerSubTotal();
        cuenta.establecerValorTotal();
        System.out.printf("%s\n", cuenta);

    }
}
