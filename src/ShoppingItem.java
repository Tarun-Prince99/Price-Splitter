
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ShoppingItem {
    
    private String itemName;
    private float price;
    private ArrayList<String> person;
    
    public ShoppingItem(String itemName, float price, ArrayList<String> person){
        
        this.itemName = itemName;
        this.price = price;
        this.person = new ArrayList<String>(person);
    }
    
    public String getItemName() {
        
        return itemName;
    }
    
    public float getPrice() {
        
        return price;
    }
    
    public ArrayList getPersonList() {
        
        return person;
    }
    
    public void addPerson(String name) {
        
        person.add(name);
    }
    
    public void removePerson(String name) {
        
        for(int i=0; i<person.size(); i++) {
            
            if(person.get(i).equalsIgnoreCase(name))
                person.remove(i);
        }
    }
    
    public String printPersonArray() {
        
        String temp = "";
        
        for(int i=0; i<person.size(); i++) {
            
            temp = temp + (person.get(i) + ", ");
        }
        
        return temp;
    }
    
    public String toString() {

        return "Item Name: " + itemName + "\n" + 
                "Price: " + price + "\n" + 
                "Person Array: " + printPersonArray();
    }
}
