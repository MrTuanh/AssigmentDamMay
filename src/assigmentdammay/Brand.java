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
public class Brand {
    public String Name;
    public String Id;
    public Brand(String id, String name){
        this.Id =id;
        this.Name = name;
    }
    public String getId(){
    return Id;
    }
    @Override
    public String toString(){
    return Name;
    }
}
