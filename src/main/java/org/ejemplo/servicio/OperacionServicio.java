package org.ejemplo.servicio;

import org.ejemplo.entidad.Operacion;

import java.util.Scanner;

public class OperacionServicio {

   public Operacion crearOperacion(){
      Operacion o1 = new Operacion();
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese 2 numeros");
      o1.setNumero1(sc.nextInt());
      o1.setNumero2(sc.nextInt());
      return o1;
   }

   public int sumar(Operacion o1){
      return o1.getNumero1() + o1.getNumero2();
   }

   public int restar(Operacion o1){
      return o1.getNumero1() - o1.getNumero2();
   }

   public int multiplicar(Operacion o1){
      if(o1.getNumero1() == 0 || o1.getNumero2() == 0){
      System.out.println("Error, no puede haber multiplicaciones por 0");
         return 0;
      }else{
         return o1.getNumero1() * o1.getNumero2();
      }
   }

   public double dividir(Operacion o1){
      if(o1.getNumero2() == 0){
      System.out.println("Error, no se puede dividir por cero");
      return 0;
      }else{
         return (double) o1.getNumero1() / o1.getNumero2();
      }
   }

}
