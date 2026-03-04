package com.example.demo.repository;
import com.example.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Só isso! O JpaRepository já tem métodos como save(), findAll() e deleteById() prontos.
}