package org.ejemplo.servicio;

public class MatematicaServicio {


public static int devolverMayor(int numero1, int numero2){

   return Math.max(numero1,numero2);
}
public void calcularPotencia(int numero1, int numero2){

   int resultadoPotencia = (int) Math.pow(Math.max(numero1,numero2),Math.min(numero1,numero2));
      System.out.println("La potencia es: "+resultadoPotencia);
}

public void calcularRaiz(int numero1, int numero2){
   int raizMenor = Math.min(numero1, numero2);
   double raiz = Math.sqrt(raizMenor);
   System.out.println("La raiz de "+raizMenor+" es: "+raiz);
}


}
