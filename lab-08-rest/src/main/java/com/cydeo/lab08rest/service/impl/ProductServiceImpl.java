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
    public ProductDTO updateProduct( ProductDTO productDTO) {
      Product product=productRepository.save(mapperUtil.convert(productDTO, new Product()));

        return mapperUtil.convert(product, new ProductDTO());
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
    public List<ProductDTO> getTop3ProductsByPrice() {
        return productRepository.findTop3ByOrderByPriceDesc().stream().map(obj ->
                mapperUtil.convert(obj, new ProductDTO())).collect(Collectors.toList());

    }

    @Override
    public Integer countProductByPrice(BigDecimal price) {
        return productRepository.countProductByPriceGreaterThan(price);
    }

    @Override
    public List<ProductDTO> retrieveProductByPriceAndQuantity(BigDecimal price, Integer quantity) {
    return productRepository.retrieveProductListGreaterThanPriceAndLowerThanRemainingQuantity(price,quantity)
            .stream().map(product -> mapperUtil.convert(product, new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> retrieveByCategory(Long categoryId) {
        return null;
    }

    @Override
    public List<ProductDTO> retrieveProductByCategoryAndPrice(List<Long> categoryList, BigDecimal price) {
        return productRepository.retrieveProductListByCategory(categoryList,price).stream()
                .map(product -> mapperUtil.convert(product, new ProductDTO())).collect(Collectors.toList());
    }


}
