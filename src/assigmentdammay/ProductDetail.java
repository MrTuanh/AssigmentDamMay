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
public class ProductDetail {
    String ProductDetailId;
    String ProductDetailName;
    String ProductId;
    
    public ProductDetail(String id,String name,String productid){
        this.ProductDetailId = id;
        this.ProductDetailName = name;
        this.ProductId = productid;
        
    }
    public String getId(){
        return ProductDetailId;
    }
    public String toString(){
        return ProductDetailName;
    }
    
}
