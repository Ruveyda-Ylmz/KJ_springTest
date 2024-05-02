package com.ruveyda.controller;

import com.ruveyda.entity.Product;
import com.ruveyda.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product") //localhost:8080
@RequiredArgsConstructor
public class ProductController {

 private  final ProductService productService;

 @GetMapping("/save") //http://localhost:8080/product/save?productName=SampleProduct&productCategory=SampleCategory&productPrice=19.99&productUnitInStock=100&productDescription=SampleDescription
    public Product save(Product product){ ///http://localhost:8080/product/save?
     return productService.save(product);
 }

   @GetMapping("/find-all") ///http://localhost:8080/product/find-all
    public List<Product> findAll(){
     return  productService.finalAll();
   }

    @GetMapping("/find-by-id") //http://localhost:8080/product/find-by-id?id=1
    public Optional<Product> findById(Integer id){
        return  productService.findById(id);
    }

}
