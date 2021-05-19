package test;

import Tablas.*;

import java.util.*;

/**
 * test
 * Nombre_project: JDBC
 * TestTrabajador
 * Created by: MarcosRa
 * Date : 28/04/2021
 * Description:
 **/
public class TestTrabajador {
    public static void main(String[] args) throws Exception {
        Querys trabajadorquery = new Querys();
        List<Trabajador> trabajadores = trabajadorquery.select();
        
//        for (Trabajador trabajador: trabajadores){
//            System.out.println("trabajador = " + trabajador);;
//        }
//        Date date = Date.valueOf("1987-11-12");
//        Trabajador trabajador = new Trabajador("13479242Q", "Cati", "Cardona","Castro", date,6,"junior",1);
//        trabajadorquery.Insert(trabajador);
//        System.out.println(date);
        Trabajador trabajadorAConsultar = new Trabajador("11111112G");
        Querys trabajadorDNI = new Querys();
    }
}
