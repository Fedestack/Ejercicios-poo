package org.ejemplo.servicio;

import org.ejemplo.entidad.Circunferencia;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircunferenciaServicio {

   private Scanner sc = new Scanner(System.in);

   public Circunferencia crearCircunferencia() {
      Circunferencia c1 = new Circunferencia();
      System.out.println("Ingrese el radio");
      c1.setRadio(sc.nextDouble());
      return c1;

   }

   public void area(Circunferencia c1){
      System.out.println("El area de la circunferencia es :"+Math.PI*Math.pow(c1.getRadio(),2));
   }

   public void perimetro(Circunferencia c1){
      System.out.println("El perimetro de la circunferencia es :"+2*Math.PI*c1.getRadio());

   }


}
