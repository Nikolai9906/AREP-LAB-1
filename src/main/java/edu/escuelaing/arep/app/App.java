package edu.escuelaing.arep.app;

import edu.escuelaing.arep.list.LinkedListException;
import edu.escuelaing.arep.stat.Stat;

/**
 * Programa que realiza el calculo de la media y la desviación estándar
 * @author Nikolai Bermudez V
 */
public class App {

    public static void main( String[] args )
    {
        Stat process = new Stat("numbersFile.txt");
        try {
            System.out.println("Columna 1");
            System.out.println(process.mean() + " Media");
            System.out.println(process.stddev() + " Desviación Estándar" );
        }catch (LinkedListException e){
            e.printStackTrace();
        }
    }
}
