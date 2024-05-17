package com.ecommerce.repository;

import com.ecommerce.model.order.Order;
import com.ecommerce.model.product.Category;
import com.ecommerce.model.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

    public Map<Integer,Product> productMap = new HashMap<>();

    public List<Product> getByCategory(Category category){
        List<Product> product = productMap.values().stream().toList();

        List<Product> productsByCategory = new ArrayList<>();

        for(Product p: product){
            if(p.getCategory().equals(category)){
                productsByCategory.add(p);
            }
        }
        return productsByCategory;
    }

    public List<Product>getByPrice(double range1, double range2){
        List<Product> product = productMap.values().stream().toList();

        List<Product> productsByPrice = new ArrayList<>();

        for(Product p: product){
            if(p.getPrice() >= range1 && p.getPrice()<= range2){
                productsByPrice.add(p);
            }
        }
        return productsByPrice;
    }

}
