package com.teluskontest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
           
    public List<Product> getProductOfPlace(String text) {
        List<Product> prdctfplc = new ArrayList<>();
        
       products.stream()
       .filter(dt-> (dt.getPlace().toLowerCase()).contentEquals(text.toLowerCase()))
       .forEach(data -> prdctfplc.add(data));
       
       return prdctfplc;
        
    }
    
    public List<Product> getProductOutOfWarranty() {
        List<Product> prdctofwrnty = new ArrayList<>();
        
        products.stream()
        .filter(dt-> (dt.getWarranty()<(new GregorianCalendar()).get(Calendar.YEAR)))
        .forEach(data -> prdctofwrnty.add(data));
        
        return prdctofwrnty;        
    }
}