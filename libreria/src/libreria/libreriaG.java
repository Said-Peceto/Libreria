package libreria;

import java.util.ArrayList;
import java.util.List;

class LibreriaG {
    private String titulo;
    private String autor;
    private boolean disponible;

    public LibreriaG(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Biblioteca {
    private List<LibreriaG> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(LibreriaG libro) {
        libros.add(libro);
    }

    public void retirarLibro(LibreriaG libro) {
        if (libros.contains(libro)) {
            libro.setDisponible(false);
            libros.remove(libro);
            System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido retirado de la biblioteca.");
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no se encuentra disponible en la biblioteca.");
        }
    }

    public void imprimirCatalogo() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros en su catálogo.");
        } else {
            System.out.println("Catálogo de la biblioteca:");
            for (LibreriaG libro : libros) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Disponible: " + (libro.isDisponible() ? "Sí" : "No"));
                System.out.println("-----------------------------");
            }
        }
    }
}

