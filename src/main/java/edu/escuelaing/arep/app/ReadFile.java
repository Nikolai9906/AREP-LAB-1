package edu.escuelaing.arep.app;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    ArrayList<Integer> listNumbers = new ArrayList<Integer>();
    public void valueFile(){
        Scanner file = null;
        try {
            file = new Scanner(new File("numbersFile.txt"));
        }catch (Exception e){
            System.out.println("Archivo no encontrado");
        }
        int number = 0;
        int count = 0;
        while(file.hasNext()){
            number = file.nextInt();
            listNumbers.add(number);
        }
        for (int i = 0; i < listNumbers.size(); i++){
            System.out.println(listNumbers.get(i));
        }

    }

    public ArrayList<Integer> getListNumbers(){
        return listNumbers;
    }

}
