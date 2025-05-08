package com.example.demo.controller;
import java.util.List;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Producto> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return service.save(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@PathVariable Long id, @ RequestBody Producto updated) {


    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
