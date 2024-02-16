package com.edy.biblioteca.Libros;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LibrosServices {

    private final LibrosRepository librosRepository;

    //Trae todos los libros 
    public List<Libros>getLibros(){

        return librosRepository.findAll();
    }


    //trae los un libro por su id
    public Optional<Libros> getLibrosbyId(Integer isbn){
        
        return librosRepository.findById(isbn);
    }

    ///--------------------------
    //trae los un libro por su isbn
    public List<Libros> getLibrosbyIsbn(Integer isbn){
        
        return librosRepository.findByIsbn(isbn);
    }

    //trae libros mayopres al año escrito 
    public List<Libros> findByAnioGreaterThan(Integer anio){
        
        return librosRepository.findByAnioGreaterThan(anio);
    }

    //trae los un libro por su titulo
    public List<Libros> getLibrosTitulo(String Titulo){
        
        return librosRepository.findByTitulo(Titulo);
    }

    ///---------------------------

     //agregar un libro 

     public void addLibros(Libros libros){

        librosRepository.save(libros);

     }


}
