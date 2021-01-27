package edu.escuelaing.arep.app;

import sun.awt.image.ImageWatched;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList list = new LinkedList();
        System.out.println("Esta vacia " + list.isEmpty());

        ReadFile document = new ReadFile();
        document.valueFile();



    }
}
