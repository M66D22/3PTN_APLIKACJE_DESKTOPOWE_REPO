
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author michaldondajewski
 */
public class ProductFileOperations {
    File productInfo = new File("Product_Info.csv");
    FileWriter fw;
    Scanner sc;
    
    public void saveToFileProduct(ArrayList<ProductMenagement> list){
        try {
            fw = new FileWriter(productInfo);
            for (int i=0; i<list.size(); i++){
                fw.write(list.get(i).toString()+"\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ProductFileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<ProductMenagement> loadProductsToFile(ArrayList<ProductMenagement> list) throws FileNotFoundException{
        sc = new Scanner(productInfo);
        
        while(sc.hasNext()){
            String data = sc.nextLine();
            String[] elements = data.split(";");
            ProductMenagement productMenagement = new ProductMenagement(elements[0], 
                    Double.parseDouble(elements[1]), Double.parseDouble(elements[2]),
                    elements[3]);
        }
        
        return list;
    } 
    
}
