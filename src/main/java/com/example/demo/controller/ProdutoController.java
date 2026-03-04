package com.example.demo.controller;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos") // O endereço na web será localhost:8080/produtos
public class ProdutoController {

    private final ProdutoRepository repository;

    // O Spring injeta o repository automaticamente aqui
    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> listar() {
        return repository.findAll(); // Retorna todos os produtos do MySQL
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repository.save(produto); // Salva um novo produto no MySQL
    }
}