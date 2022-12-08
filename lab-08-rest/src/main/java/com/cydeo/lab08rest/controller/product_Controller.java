package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.dto.ProductRequest;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    public ResponseEntity<ResponseWrapper> retrieveProductByCategoryAndPrice(@RequestBody ProductRequest productRequest) {

        return ResponseEntity.ok(new ResponseWrapper("Product are successfully retrieve"
                , productService.retrieveProductByCategoryAndPrice(productRequest.getCategoryList(), productRequest.getPrice()), HttpStatus.OK));
    }

    @GetMapping("/{name}")
    public ResponseEntity<ResponseWrapper> retrieveProductByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(new ResponseWrapper("product by name",
                productService.getProductByName(name), HttpStatus.OK));
    }

    @GetMapping("/top3")
    public ResponseEntity<ResponseWrapper> retrieveTop3ProductByPrice() {
        return ResponseEntity.ok(new ResponseWrapper("top 3 products by price",
                productService.getTop3ProductsByPrice(), HttpStatus.OK));
    }

    @GetMapping("/price/{price}")
    public ResponseEntity<ResponseWrapper> retrieveProductByPrice(@PathVariable("price") BigDecimal price) {
        return ResponseEntity.ok(new ResponseWrapper("Product are successfully retrieved"
                , productService.countProductByPrice(price), HttpStatus.OK));
    }

    @GetMapping("/price/{price}/quantity/{quantity}")
    public ResponseEntity<ResponseWrapper> retrieveProductByPriceAndQuantity
            (@PathVariable("price") BigDecimal price, @PathVariable("quantity") Integer quantity) {
      return ResponseEntity.ok(new ResponseWrapper("products are retrieved",
              productService.retrieveProductByPriceAndQuantity(price,quantity),HttpStatus.OK));
    }



}
