package com.edy.biblioteca.Libros;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrosRepository extends JpaRepository<Libros, Integer> {

    List<Libros> findByIsbn(Integer isbn);
    List<Libros> findByTitulo(String titulo);

}






