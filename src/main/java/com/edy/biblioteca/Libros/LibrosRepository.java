package com.edy.biblioteca.Libros;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LibrosRepository extends JpaRepository<Libros, Integer> {

    List<Libros> findByIsbn(Integer isbn);
    List<Libros> findByTitulo(String titulo);

   
  List<Libros> findByAnioGreaterThan( Integer anio);

}






