package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.entity.Product;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.ProductRepository;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final MapperUtil mapperUtil;

    public ProductServiceImpl(ProductRepository productRepository, MapperUtil mapperUtil) {
        this.productRepository = productRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<ProductDTO> getProducts() {
        List<Product> list = productRepository.findAll();

        return  list.stream().map(obj -> mapperUtil.convert(obj, new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public ProductDTO updateProduct(Long productId, ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        productRepository.save(mapperUtil.convert(productDTO, new Product()));
        return productDTO;
    }

    @Override
    public ProductDTO getProductByName(String name) {
       Product product= productRepository.findFirstByName(name);

        return mapperUtil.convert(product,new ProductDTO());
    }

    @Override
    public List<ProductDTO> getTop3Products() {
        return null;
    }

    @Override
    public ProductDTO getProductByPrice(BigDecimal price) {
        return null;
    }

    @Override
    public ProductDTO getProductByPriceAndQuantity(BigDecimal price, Integer quantity) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductsByCategory(Long categoryId) {
        return null;
    }
}
