package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class product_Controller {

    private final ProductService productService;


    public product_Controller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> listProduct() {
        return ResponseEntity.ok(new ResponseWrapper("product  list retrieved",
                productService.getProducts(), HttpStatus.OK));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateProduct(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(new ResponseWrapper("Product updated",
                productService.updateProduct(productDTO), HttpStatus.OK));

    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createProduct(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(new ResponseWrapper("Product created",
                productService.updateProduct(productDTO), HttpStatus.OK));

    }
//revisit below method and fix implementation in service classes
    @PostMapping("/categoryandprice")
    public ResponseEntity<ResponseWrapper> retrieveProductByCategoryAndPrice(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(new ResponseWrapper("Product retrieved by price and category",
                productService.retrieveProductByCategoryAndPrice(productDTO), HttpStatus.OK));

    }


}
