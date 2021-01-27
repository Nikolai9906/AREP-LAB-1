package edu.escuelaing.arep.stat;

import java.util.List;

/*
* A class with statistical functions
* @author nikolaibermudez
*
*/
public class Stat {

    public static Double mean(List<Double> lst){
        Double suma = 0.0;
        for (Double e: lst){
            suma = suma + e;
        }
        return suma / lst.size();
    }

    public static Double stddev(List<Double> lst){
        return 0.0;
    }
}
