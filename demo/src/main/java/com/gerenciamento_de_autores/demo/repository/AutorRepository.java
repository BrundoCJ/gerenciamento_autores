package com.gerenciamento_de_autores.demo.repository;

import com.gerenciamento_de_autores.demo.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}