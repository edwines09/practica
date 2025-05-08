package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int cantidad;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
