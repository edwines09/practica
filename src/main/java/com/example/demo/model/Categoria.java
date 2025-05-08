package com.example.demo.model;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;


@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Producto> producto = new ArrayList<>();
}
