/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import business.Product;
import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import user.DeleteUI;

/**
 *
 * @author User
 */
public abstract class ProductDB implements IProduct {
    
   @Override
   public void delete(int prID){
       String data;
       String productID = String.valueOf(prID);
       boolean deleted = false;
       ArrayList arr = new ArrayList<>();
       
       
       try{
           
           BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
           
           while((data = br.readLine())!=null){
               String[] sData = data.split(",");
               
            if(sData[0].equals(productID)){
               deleted = true;
               continue;
            }
            else{
                int ProductID = Integer.valueOf(sData[0]);
                String ProductName = sData[1];
                String Price = sData[2];
                int Amount = Integer.valueOf(sData[3]);
                String Category = sData[4];
                Date SellDate = Date.valueOf(sData[5]);
                
                Product pr = new Product(ProductID,ProductName,Price,Amount,Category,SellDate);
                arr.add(pr.Print());
              
                    } 
          }
           if(deleted){
           BufferedWriter bw = new BufferedWriter(new FileWriter("Product.txt",true));
           bw.write("");
           int i = 0;
           while(i<arr.size()){
               String line = String.valueOf(arr.get(i));
               bw.append(line+"\n");
               i++;
           }
           JOptionPane.showMessageDialog(null, "Deleted Sucessfully!");
       }
        else{
           JOptionPane.showMessageDialog(null, "Not Deleted!");
        }
    }
    catch(IOException e){
        System.out.print(e.getMessage());
    }
  };
}
