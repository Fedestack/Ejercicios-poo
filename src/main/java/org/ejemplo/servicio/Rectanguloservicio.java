package org.ejemplo.servicio;

import org.ejemplo.entidad.Rectangulo;

import java.util.Scanner;

public class Rectanguloservicio {

   public Rectangulo crearRectangulo() {
      Scanner sc = new Scanner(System.in);
      Rectangulo r1 = new Rectangulo();
      System.out.println("Ingrese los 2 valores del rectangulo");
      r1.setBase(sc.nextInt());
      r1.setAltura(sc.nextInt());
      return r1;
   }

   public void calcularSuperficie(Rectangulo r1) {
      System.out.println("La superficie del rectangulo es " + r1.getBase() * r1.getAltura());
   }

   public void calcularPerimetro(Rectangulo r1) {
      System.out.println("El perimetro del rectangulo es " + (r1.getBase() + r1.getAltura()) * 2);
   }

   public void dibujarRectangulo(Rectangulo r1){

      for(int i = 0; i < r1.getAltura(); i++) {
         for(int j = 0; j < r1.getBase(); j++) {
            if(j > 0 && j < r1.getBase()-1 && i > 0 && i < r1.getAltura()-1){
            System.out.print(" ");
            }else{
            System.out.print("*");
            }
         }
      System.out.println();
      }
   }

}
