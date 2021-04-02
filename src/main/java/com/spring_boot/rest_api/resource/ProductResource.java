package com.spring_boot.rest_api.resource;

import java.util.List;

import com.spring_boot.rest_api.models.Product;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

  @GetMapping
  @ResponseBody
  public List<Product> finddAll() {
    return null;
  }

  @GetMapping(value = "/{id}")
  @ResponseBody
  public Product findById(@PathVariable(value = "id") Long id) {
    return null;
  }

  public Product createProduct(@RequestBody Product product) {
    return null;
  }

  @PutMapping(value = "/{id}")
  @ResponseBody
  public Product updateProduct(
                @PathVariable(value = "id")Long id, 
                @RequestBody Product product) {
                return null;

  }


  @DeleteMapping(value = "/{id}")
  public void deleteProduct(@PathVariable(value = "id") Long id) {} 
  



  
}
