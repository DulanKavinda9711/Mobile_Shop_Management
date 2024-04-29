/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author User
 */
public class Product {
    private int ProductID;
    private String ProductName;
    private String Price;
    private int Amount;
    private String Category;
    private Date SellDate;
    
    public Product(){
    }
    
    public Product(int ProductID,String ProductName,String Price,int Amount,String Category,Date SellDate){
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Amount = Amount;
        this.Category = Category;
        this.SellDate = SellDate;
    }
    
    
    public void setProductID(int ProductID){
        this.ProductID = ProductID;
    }
    
    public void setProductName(String ProductName){
        this.ProductName = ProductName;
    }
    
    public void setPrice(String Price){
        this.Price = Price;
    }
    
    public void setAmount(int Amount){
        this.Amount = Amount;
    }
    
    public void setCategory(String Category){
        this.Category = Category;
    }
    
    public void setSellDate(Date SellDate){
        this.SellDate = SellDate;
    }
    
    public int getProductID(){
        return ProductID;
    }
    
    public String getProductName(){
        return ProductName;
    }
    
    public String getPrice(){
        return Price;
    }
    
    public int getAmount(){
        return Amount;
    }
    
    public String getCategory(){
        return Category;
    }
    
    public Date getSellDate(){
        return SellDate;
    }
    
    public String Print(){
        String line = String.valueOf(getProductID())+","+
                getProductName()+","+
                getPrice()+","+
                getAmount()+","+
                getCategory()+","+
                getSellDate();
        
        return line;
    }
}
    
    
