package com.ruveyda.service;

import com.ruveyda.entity.Product;
import com.ruveyda.repository.ProductRepository;
import com.ruveyda.utility.ServiceCrud;
import jakarta.persistence.Embeddable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements ServiceCrud<Product,Integer> {

   private final ProductRepository productRepository;

    @Override
    public List<Product> finalAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product Update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
      productRepository.delete(product);
    }

    @Override
    public void deleteById(Integer id) {
    productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

}
