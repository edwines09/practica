package com.example.demo.service;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoryRepository repository;

    public List<Categoria> getAll() {
        return repository.findAll();
    }

    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    public Optional<Categoria> getById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
