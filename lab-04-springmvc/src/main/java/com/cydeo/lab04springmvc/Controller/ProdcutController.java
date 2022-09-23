package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdcutController {

//we need to do injection
    private final ProductService productService;

    public ProdcutController(ProductService productService) {
        this.productService=productService;
    }

    @RequestMapping("/search-product/{productName}")
    public String searchProduct(@PathVariable("productName") String productName, Model model){


        model.addAttribute("productList",productService.searchProduct(productName));

        return "product/product-list";


    }


}
