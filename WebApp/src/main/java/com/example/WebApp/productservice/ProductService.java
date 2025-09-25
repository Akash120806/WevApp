package com.example.WebApp.productservice;


import com.example.WebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.WebApp.Controller.ProductController;

import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductService {
        @Autowired
        private ProductController productController;
        @GetMapping("/getall")
        public List<Product> allPro(){
            return productController.getAll();
        }
        @GetMapping("/getid/{id}")
        public Product getById(@PathVariable int id){
           return  productController.getByIde(id);
        }
        @GetMapping("/getname/{name}")
        public Product getByName(@PathVariable String name){
            return productController.getByName(name);
        }
        @PostMapping("/addpro")
        public void addproduct(@RequestBody Product product){
            return product
        }
}
