package com.ecommerce.repository;

import com.ecommerce.fixture.ProductFixture;
import com.ecommerce.model.product.Category;
import com.ecommerce.model.product.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ProductRepositoryTest {
    ProductRepository productRepository = new ProductRepository();

    @Test
    void getByCategory(){

        Product product = ProductFixture.product;
        Product product2 = ProductFixture.product2;
        Product product3 = ProductFixture.product3;
        Product product4 = ProductFixture.product4;
        Product product5 = ProductFixture.product5;

        productRepository.productMap.put(product.getId(),product);
        productRepository.productMap.put(product2.getId(),product2);
        productRepository.productMap.put(product3.getId(),product3);
        productRepository.productMap.put(product4.getId(),product4);
        productRepository.productMap.put(product5.getId(),product5);

        List<Product> productsByCategory = productRepository.getByCategory(Category.SMARTPHONE);

        assertEquals(3,productsByCategory.size());
    }

    @Test
    void getByPrice(){

        Product product = ProductFixture.product;
        Product product2 = ProductFixture.product2;
        Product product3 = ProductFixture.product3;
        Product product4 = ProductFixture.product4;
        Product product5 = ProductFixture.product5;

        productRepository.productMap.put(product.getId(),product);
        productRepository.productMap.put(product2.getId(),product2);
        productRepository.productMap.put(product3.getId(),product3);
        productRepository.productMap.put(product4.getId(),product4);
        productRepository.productMap.put(product5.getId(),product5);

        List<Product> productsByPrice = productRepository.getByPrice(1500,3500);

        assertEquals(3,productsByPrice.size());
    }

}