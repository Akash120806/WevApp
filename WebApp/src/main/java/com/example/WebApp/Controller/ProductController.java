package com.example.WebApp.Controller;


import com.example.WebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.WebApp.productservice.ProductService;

import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {
        @Autowired
        private ProductService productService ;
        @GetMapping("/getall")
        public List<Product> allPro(){
            return productService.getAll();
        }
        @GetMapping("/getid/{id}")
        public Product getById(@PathVariable int id){
           return  productService.getByIde(id);
        }
        @GetMapping("/getname/{name}")
        public Product getByName(@PathVariable String name){
            return productService.getByName(name);
        }
        @PostMapping("/addproduct")
        public void addProduct(@RequestBody Product product){
            productService.addingProduct(product);
        }
}
