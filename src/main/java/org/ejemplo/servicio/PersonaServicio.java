package org.ejemplo.servicio;

import org.ejemplo.entidad.Persona;

import java.util.Scanner;

public class PersonaServicio {

   // Método para crear una persona pidiendo datos por consola
   public Persona crearPersona() {
      Scanner sc = new Scanner(System.in);
      Persona persona = new Persona();

      System.out.println("Ingrese el nombre:");
      persona.setNombre(sc.nextLine());

      System.out.println("Ingrese la edad:");
      persona.setEdad(sc.nextInt());

      char sexo;
      do {
         System.out.println("Ingrese el sexo (H para hombre, M para mujer, O para otro):");
         sexo = sc.next().charAt(0);
         if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo no válido, debe ser 'H', 'M' o 'O'");
         }
      } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
      persona.setSexo(sexo);

      System.out.println("Ingrese el peso (en kg):");
      persona.setPeso(sc.nextDouble());

      System.out.println("Ingrese la altura (en metros):");
      persona.setAltura(sc.nextDouble());

      return persona;
   }

   // Método para calcular el IMC
   public int calcularIMC(Persona persona) {
      double imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
      if (imc < 20) {
         return -1;
      } else if (imc >= 20 && imc <= 25) {
         return 0;
      } else {
         return 1;
      }
   }

   // Método para verificar si es mayor de edad
   public boolean esMayorDeEdad(Persona persona) {
      return persona.getEdad() >= 18;
   }
}
