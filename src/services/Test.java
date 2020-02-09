/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Ordre;
import entities.Product;

/**
 *
 * @author Ibrahim
 */
public class Test {
    public static void main(String[] args) {
      //  ProductService productService=new ProductService();
       // Product p=new Product("Marwa", "Eau", "0000008522", "Marwa", 60f, 20, 3.14f);
       // productService.insert(p);
        //productService.displayAll().forEach(System.out::println);
        //productService.delete(5);
      //  Product p=new Product(1,"Marwa", "Eau", "000002", "Marwa",50f ,60f, 20, 3.14f);
        //productService.update(p);
       // Product p1=productService.findById(3);
        //Product p2=productService.findFirstOneByName("Marwa");
      //  productService.findByName("Marwa").forEach(System.out::println);
        OrdreService ordreService=new OrdreService();
        Ordre ordre=new Ordre("Mohamed");
        ordreService.createOrdre(ordre);
    }
    
    
}
