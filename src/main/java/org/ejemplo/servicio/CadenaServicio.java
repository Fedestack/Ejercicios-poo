package org.ejemplo.servicio;

import org.ejemplo.entidad.Cadena;
import org.w3c.dom.ls.LSOutput;

public class CadenaServicio {

   public Cadena crearCadena() {

      return new Cadena();
   }

   public void mostrarVocales(Cadena cadena1) {
      int contador = 0;
      String cadena = cadena1.getFrase().toLowerCase();

      for (int i = 0; i < cadena.length(); i++) {
         char caracter = cadena.charAt(i);
         if (caracter == 'a'
                 || caracter == 'e'
                 || caracter == 'i'
                 || caracter == 'o'
                 || caracter == 'u') {
            contador++;
         }
      }
      System.out.println("La frase ingresada contiene " + contador + " vocales");
   }

   public void invertirFrase(Cadena cadena1) {
      String cadena = cadena1.getFrase().toLowerCase();
      String cadenaInvertida = "";
      for (int i = cadena.length() - 1; i >= 0; i--) {
         cadenaInvertida = cadenaInvertida + cadena.charAt(i);
      }
      System.out.println(cadenaInvertida);
   }

   public void vecesRepetido(String letra, Cadena cadena1) {
      String caracteres = cadena1.getFrase().toLowerCase();
      int contador = 0;

      for (int i = 0; i < caracteres.length(); i++) {
         if (letra.equalsIgnoreCase(String.valueOf(caracteres.charAt(i)))) {
            contador++;
         }
      }
      System.out.println("La letra " + letra + " se repite " + contador + " veces en la frase");
   }

   public void compararLongitud(String fraseNueva, Cadena cadena1) {

      int largoFraseIngresada = fraseNueva.length();
      int largoFraseClase = cadena1.getLargo();

      if (largoFraseIngresada < largoFraseClase) {
         System.out.println("La frase ingresada es mas corta que la frase de la clase");
      } else if (largoFraseIngresada == largoFraseClase) {
         System.out.println("Las 2 frases tiene el mismo largo");
      } else {
         System.out.println("La frase ingresada es mas larga que la frase de la clase");
      }
   }

   public void unirFrases(Cadena cadena1, String fraseNueva) {
      if (cadena1 == null || cadena1.getFrase().isBlank()) {
         System.out.println("Error: La frase de la clase está vacía.");
         return;
      }

      if (fraseNueva.isBlank()) {
         System.out.println("Error: La frase nueva ingresada está vacía.");
         return;
      }
      String fraseClase = cadena1.getFrase();
      String fraseFinal = fraseClase.concat(fraseNueva);

      System.out.println(fraseFinal);
   }

   public void reemplazar(Cadena cadena1, String caracter) {
      String fraseClase = cadena1.getFrase().toLowerCase();
      char caract = caracter.charAt(0);
      String nuevaFrase = fraseClase.replace('a', caract);
      System.out.println(nuevaFrase);
   }

   public void contiene(Cadena cadena1, String letra){
      String fraseClase = cadena1.getFrase().toLowerCase();
      boolean resultado = fraseClase.contains(letra);
      System.out.println(resultado);
   }


}
