package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.entity.Category;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    List<ProductDTO> getProducts();

    ProductDTO updateProduct( ProductDTO productDTO);

    ProductDTO createProduct(ProductDTO productDTO);

    // need one for product and price ProductDTO create

    ProductDTO getProductByName(String name);

    List<ProductDTO> getTop3ProductsByPrice();

    public Integer countProductByPrice(BigDecimal price);

    List<ProductDTO>  retrieveProductByPriceAndQuantity(BigDecimal price, Integer quantity);

    List<ProductDTO> retrieveByCategory(Long categoryId);

    public List<ProductDTO> retrieveProductByCategoryAndPrice(List<Long> categoryList, BigDecimal price);
}
