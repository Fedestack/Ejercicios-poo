package org.ejemplo.servicio;

import org.ejemplo.entidad.Cadena;

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
}
