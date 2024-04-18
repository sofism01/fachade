package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class BuscadorLibros {
    private List<Libro> libros;

    public BuscadorLibros(List<Libro> libros){
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public List<Libro>
    buscarPorTitulo(String titulo){
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro>
    buscarPorAutor(String autor){
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())){
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro>
    buscarPorCategoria(String categoria){
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getCategoria().toLowerCase().contains(categoria.toLowerCase())){
                resultados.add(libro);
            }
        }
        return resultados;
    }
}
