package org.ejemplo.servicio;

import org.ejemplo.entidad.Cafetera;

import java.util.Scanner;

public class CafeteraServicio {
   Scanner sc = new Scanner(System.in);

   public Cafetera crearCafetera() {
      Cafetera c1 = new Cafetera();
      return c1;
   }

   public void nivelActual(Cafetera c1) {
      System.out.println("Nivel de Cafe " + c1.getCapacidad_actual());
   }

   public void llenarCafetera(Cafetera c1) {
      c1.setCapacidad_actual(c1.getCapacidad_maxima());
      System.out.println("Cafetera Completa");
   }

   public void servirTaza(Cafetera c1) {
      System.out.println("Indique el tamaño de la taza\n1. Chico\n2. Mediano\n3. Grande");
      int opcion = sc.nextInt();
      if (opcion < 0 || opcion > 3) {
         System.out.println("Opcion invalida");
         return;
      }
      if (c1.getCapacidad_actual() == 0) {
         System.out.println("Cafetera Vacia !!");
         return;
      }
      if (c1.getCapacidad_actual() < opcion) {
         System.out.println("No hay suficiente cafe en la maquina para completar la opcion elegida");
         System.out.println("La cantidad de cafe servido es de tamaño : ");
         switch (c1.getCapacidad_actual()) {
            case 1:
               System.out.println("Chico");
               c1.setCapacidad_actual(0);
               break;
            case 2:
               System.out.println("Mediano");
               c1.setCapacidad_actual(0);
               break;
         }

      } else {
         System.out.println("Cafe listo, vuelva prontos");
         c1.setCapacidad_actual(c1.getCapacidad_actual() - opcion);
      }
   }

   public void vaciarCafetera(Cafetera c1) {
      if (c1.getCapacidad_actual() == 0) {
         System.out.println("La cafetera ya esta vacia");
      } else {
         c1.setCapacidad_actual(0);
         System.out.println("Cafetera vaciada exitosamente !!");
      }
   }

   public void agregarCafe(Cafetera c1) {
      if (c1.getCapacidad_actual() == 10) {
         System.out.println("Cafetera completa !!");
      } else {
         int nivelesRestantes = 10 - c1.getCapacidad_actual();
         System.out.println(
                 "Quedan "
                         + nivelesRestantes
                         + " niveles para completar la cafetera\nCuantos niveles"
                         + " desea agregar");
         int niveles = sc.nextInt();
         if (niveles > nivelesRestantes) {
            System.out.println("Capacidad maxima exedida, ingrese un numero menor");
         } else {
            System.out.println(
                    "Carga exitosa !!\nNivel de cafe " + (c1.getCapacidad_actual() + niveles));
            c1.setCapacidad_actual(c1.getCapacidad_actual() + niveles);
         }
      }
   }
}
