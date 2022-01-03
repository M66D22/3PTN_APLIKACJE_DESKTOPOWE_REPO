package md.daneosobowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OdczytZPliku {
    ArrayList<String> listOdczyt;
    
    public void odczyt(){
        System.out.println("Działa");
        File f = new File("Dane.csv");
        Scanner sc;
        listOdczyt = new ArrayList<>();
        try {
            sc = new Scanner(f);
            while (sc.hasNext()){
                listOdczyt.add(sc.nextLine());
                System.out.println(""+listOdczyt);
                //listOdczyt.toString().split(",");
                String[] splitedData = listOdczyt.toString().split(",");
                System.out.println("Splited data: "+splitedData[0]+splitedData[1]+splitedData[2]+splitedData[3]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OdczytZPliku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
