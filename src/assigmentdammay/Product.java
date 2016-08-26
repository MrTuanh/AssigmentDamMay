/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentdammay;

/**
 *
 * @author Tu Anh
 */
public class Product {
    String ProductId;
    String ProductName;
    String Price;
    String Image;
    String BrandId;
    public Product(String id,String name,String price,String img,String brId){
        this.ProductId = id;
        this.ProductName = name;
        this.Price = price;
        this.Image = img;
        this.BrandId = brId;
        
    }
    public String  getId(){
        return ProductId;
    }
      public String toString(){
    return ProductName;
    }
            
    
}
