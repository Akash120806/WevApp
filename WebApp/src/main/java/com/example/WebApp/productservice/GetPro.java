package com.example.WebApp.productservice;
import com.example.WebApp.Model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.WebApp.Controller.ProductController;

import java.util.List;
@RestController

public class GetPro {

    @RequestMapping("/get")
    public List<Product> Getting(){
        System.out.println(items);
        return items;
    }
    int proid=102;
    @RequestMapping("/getid")
    public Product getId(){
        for(Product item:items){
            if(item.getId()==proid){
                return item;
            }
        }
        return null;
    }
}
