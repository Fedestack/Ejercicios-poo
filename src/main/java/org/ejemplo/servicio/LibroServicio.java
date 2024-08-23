package org.ejemplo.servicio;

import org.ejemplo.entidad.Libro;

import java.util.Scanner;

public class LibroServicio {

  Scanner sc = new Scanner(System.in).useDelimiter("\n");

  public Libro cargarDatos() {
    Libro libro = new Libro();

    System.out.println("Ingrese el ISBN");
    libro.setISBN(sc.next());
    System.out.println("Ingrese el titulo");
    libro.setTitulo(sc.next());
    System.out.println("Ingrese el autor");
    libro.setAutor(sc.next());
    System.out.println("Ingrese el numero de paginas");
    libro.setNumero_de_paginas(sc.nextInt());
    return libro;
  }

  public static void mostrarLibro(Libro libro) {
    System.out.println(
        "Datos del libro\n"
            + "ISBN "
            + libro.getISBN()
            + "\n"
            + "Titulo "
            + libro.getTitulo()
            + "\n"
            + "Autor "
            + libro.getAutor()
            + "\n"
            + "Numero de paginas "
            + libro.getNumero_de_paginas());
  }
}
