package org.ejemplo.entidad;

/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */

public class Libro {

   private String ISBN;
   private String titulo;
   private String autor;
   private int numero_de_paginas;

   public Libro() {}

   public Libro(String ISBN, String titulo, String autor, int numero_de_paginas) {
      this.ISBN = ISBN;
      this.titulo = titulo;
      this.autor = autor;
      this.numero_de_paginas = numero_de_paginas;
   }

   public String getISBN() {
      return ISBN;
   }

   public void setISBN(String ISBN) {
      this.ISBN = ISBN;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

   public int getNumero_de_paginas() {
      return numero_de_paginas;
   }

   public void setNumero_de_paginas(int numero_de_paginas) {
      this.numero_de_paginas = numero_de_paginas;
   }

}
