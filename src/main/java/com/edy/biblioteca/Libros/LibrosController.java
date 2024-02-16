package com.edy.biblioteca.Libros;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/libros")
@AllArgsConstructor

public class LibrosController {

    private final LibrosServices librosServices;


    @GetMapping("/all")
    public List<Libros> getLibros() {
        return librosServices.getLibros();
    }
    

    @GetMapping("/id/{id}")
    public Optional<Libros> getById(@PathVariable("id") Integer id ) {
        return librosServices.getLibrosbyId(id);
    }

    @GetMapping("/isbn/{isbn}")
    public List<Libros> getByIs(@PathVariable("isbn") Integer isbn ) {
        return librosServices.getLibrosbyIsbn(isbn);
    }

    @GetMapping("/titulo/{titulo}")
    public List<Libros> getByTitutlo(@PathVariable("titulo") String titulo ) {
        return librosServices.getLibrosTitulo(titulo);
    }

    @PostMapping("/add")
    public void addLibros(@RequestBody Libros libros ) {
         librosServices.addLibros(libros);
    }
    
    

}
