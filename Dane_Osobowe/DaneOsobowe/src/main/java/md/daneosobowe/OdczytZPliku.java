package md.daneosobowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OdczytZPliku {
    ArrayList<Dane> listOdczyt;
    private String dane,name, surname, classOfSchool, yearOfStartEducation;
    
    public ArrayList<Dane> odczyt() throws FileNotFoundException{
        System.out.println("Działa");
        File f = new File("Dane.csv");
        Scanner sc;
        listOdczyt = new ArrayList<>();
        try {
            sc = new Scanner(f);
            while (sc.hasNext()){
                dane = sc.nextLine();
                //listOdczyt.toString().split(",");
                String[] splitedData = listOdczyt.toString().split(",");
                name = splitedData[0];
                surname = splitedData[1];
                classOfSchool = splitedData[2];
                yearOfStartEducation = splitedData[3];
                
                Dane dane = new Dane(name, surname, classOfSchool, yearOfStartEducation);
                
                listOdczyt.add(dane);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OdczytZPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOdczyt;
    }
}
