package com.example.demo.service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Producto> getAll() {
        return repository.findAll();
    }
    public Producto save(Producto producto) {
        return repository.save(producto);
    }
    public Optional<Producto> getById(Long id) {
        return repository.findById(id);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}


