package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class product_Controller {

private final ProductService productService;


    public product_Controller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> getProductList(){
        return productService.getProducts();
    }













}
