package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity // Isso cria a tabela no MySQL automaticamente!
@Data   // Gera Getters e Setters (do Lombok)
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer quantidade;
    private Double preco;
}