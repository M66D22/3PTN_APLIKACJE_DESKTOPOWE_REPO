/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.daneosobowe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

/**
 *
 * @author Michał
 */
public class ZapisDoPliku {
    public void saveToFile(ArrayList<Dane> list) throws IOException{
        File f = new File("Dane.csv");
        
        FileWriter fw = new FileWriter(f);
        for (int i=0; i<list.size(); i++){
            Dane dane = list.get(i);
            fw.write(dane.toString()+"\n");
        }
        
        fw.close();
    }
}
