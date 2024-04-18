package co.edu.uniquindio;

import java.util.List;

public class Main {
    public static void main(String [] args){
        Libro libro1 = new Libro("Orgullo y prejuicio", "Jane Austen", "Romance");
        Libro libro2 = new Libro("It", "Stephen King", "Terror");
        Libro libro3 = new Libro("Bajo la misma estrella", "John Green", "Drama");

        BuscadorLibros buscador = new BuscadorLibros(null);
        buscador.getLibros().add(libro1);
        buscador.getLibros().add(libro2);
        buscador.getLibros().add(libro3);

        //Buscar libro por nombre
        BibliotecaFacade biblioteca = new BibliotecaFacade(buscador);
        System.out.println("Libros con 'It' en el titulo: ");
        List<Libro> librosPorTitulo = biblioteca.buscarPorTitulo("it");
        for (Libro libro : librosPorTitulo){
            System.out.println(libro);
        }

        //Buscar libro por autor
        System.out.println("Libros de 'Jane Austen'");
        List<Libro> librosPorAutor = biblioteca.buscarPorAutor("Jane Austen: ");
        for (Libro libro : librosPorAutor){
            System.out.println(libro);
        }

        //Buscar por categoria
        System.out.println("Libros de la categoria 'Drama': ");
        List<Libro> librosPorCategoria = biblioteca.buscarPorCategoria("Drama");
        for (Libro libro : librosPorCategoria){
            System.out.println(libro);
        }
    }
}
