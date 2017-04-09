/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c482_fx;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Mike
 */
public abstract class Part {
 
    
    private SimpleStringProperty name;
    private SimpleIntegerProperty partID;
    private SimpleDoubleProperty price;
   
    private SimpleIntegerProperty instock;
    private SimpleIntegerProperty min;
    private SimpleIntegerProperty max;
    
    public Part(){
        name = new SimpleStringProperty();
        partID = new SimpleIntegerProperty();
        price = new SimpleDoubleProperty();
        instock = new SimpleIntegerProperty();
        min = new SimpleIntegerProperty();
        max = new SimpleIntegerProperty();
    }
    
    public Part(String name, double price, int inStock, int min, int max){
        this();
        setName(name);
        setPrice(price);
        setInstock(inStock);
        setMin(min);
        setMax(max);
        
        
        
        
    };
    

    public SimpleStringProperty getPartNameProperty()
    {
        return name;
    }
    
    public SimpleDoubleProperty getPriceProperty()
    {
        return price;
    }
    
     public SimpleIntegerProperty getInstockProperty()
    {
        return instock;
    }
     
    public SimpleIntegerProperty getMaxProperty()
    {
        return max;
    }
    
     public SimpleIntegerProperty getMinProperty()
    {
        return min;
    }
    
   
            
            
    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getPartID() {
        return partID.get();
    }

    public void setPartID(int partID) {
        this.partID.set(partID);
    }

    public double getPrice() {
        return price.get();
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public int getInstock() {
        return instock.get();
    }

    public void setInstock(int instock) {
        this.instock.set(instock);
    }

    public int getMin() {
        return min.get();
    }

    public void setMin(int min) {
        this.min.set(min);
    }

    public int getMax() {
        return max.get();
    }

    public void setMax(int max) {
        this.max.set(max);
    }
    

  
 
    
}
