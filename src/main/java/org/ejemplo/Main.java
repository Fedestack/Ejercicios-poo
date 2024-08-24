package org.ejemplo;

import org.ejemplo.entidad.*;
import org.ejemplo.servicio.*;

import java.util.Scanner;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //      LibroServicio libroServicio = new LibroServicio();
      //      Libro libro1 = libroServicio.cargarDatos();
      //      LibroServicio.mostrarLibro(libro1);

      //      CircunferenciaServicio cs = new CircunferenciaServicio();
      //      Circunferencia c1 = cs.crearCircunferencia();
      //      cs.area(c1);
      //      cs.perimetro(c1);

      //      OperacionServicio os = new OperacionServicio();
      //      Operacion o1 = os.crearOperacion();
      //
      //      System.out.println("El resultado de la suma es "+os.sumar(o1));
      //      System.out.println("El resultado de la resta es "+os.restar(o1));
      //      System.out.println("El resultado de la multiplicacion es "+os.multiplicar(o1));
      //      System.out.println("El resultado de la division es "+os.dividir(o1));

      //         Rectanguloservicio rs = new Rectanguloservicio();
      //         Rectangulo r1 = rs.crearRectangulo();
      //         rs.calcularSuperficie(r1);
      //         rs.calcularPerimetro(r1);
      //         rs.dibujarRectangulo(r1);

      //      CuentaServicio cs = new CuentaServicio();
      //      Cuenta c1 = cs.crearCuenta();
      //      boolean flag = true;
      //      do{
      //         System.out.println("------ MENU ------\nElija una opcion para continuar\n1. Ingresar
      // dinero\n2. Retirar dinero\n3" +
      //                 ". Extraccion rapida\n4. Consultar saldo\n5. Consultar datos\n6. Salir");
      //         int opcion = sc.nextInt();
      //
      //         switch (opcion){
      //            case 1 : cs.ingresar(c1);
      //            break;
      //            case 2 : cs.retirar(c1);
      //            break;
      //            case 3 : cs.extraccionRapida(c1);
      //            break;
      //            case 4: cs.consultarSaldo(c1);
      //            break;
      //            case 5 : cs.consultarDatos(c1);
      //            break;
      //            case 6: flag = false;
      //            break;
      //            default:
      //            System.out.println("Opcion invalida");
      //      }
      //      }while(flag);
      //      System.out.println("Gracias, vuelvas prontos");

      //      CafeteraServicio cs = new CafeteraServicio();
      //      Cafetera c1 = cs.crearCafetera();
      //      boolean exit = false;
      //      do{
      //         System.out.println("------ MENU ------");
      //         System.out.println("Elija una opcion\n1. Servir Taza\n2. Llenar Cafetera\n3. Agregar
      // Cafe\n4. Vaciar Cafetera\n5" +
      //                 ". Nivel Actual\n6. Salir");
      //         int opcion = sc.nextInt();
      //         switch(opcion){
      //            case 1: cs.servirTaza(c1);
      //               break;
      //            case 2: cs.llenarCafetera(c1);
      //               break;
      //            case 3: cs.agregarCafe(c1);
      //               break;
      //            case 4: cs.vaciarCafetera(c1);
      //               break;
      //            case 5: cs.nivelActual(c1);
      //            break;
      //            case 6: exit = true;
      //               break;
      //            default: System.out.println("Opcion invalida, intente nuevamente");
      //         }
      //      }while(!exit);
      //
      //    System.out.println("Gracias, vuelva prontos");

      //            PersonaServicio personaServicio = new PersonaServicio();
      //
      //            // Crear cuatro objetos de tipo Persona
      //            Persona persona1 = new Persona("Carlos", 28, 'H', 70.5, 1.75);
      //            Persona persona2 = new Persona("Ana", 22, 'M', 55.0, 1.60);
      //            Persona persona3 = new Persona("Alex", 16, 'O', 68.0, 1.70);
      //            Persona persona4 = personaServicio.crearPersona();
      //
      //            // Arrays para almacenar resultados
      //            int[] imcs = new int[4];
      //            boolean[] mayoresDeEdad = new boolean[4];
      //
      //            // Evaluar cada persona
      //            Persona[] personas = {persona1, persona2, persona3, persona4};
      //
      //            int bajoPeso = 0;
      //            int pesoIdeal = 0;
      //            int sobrepeso = 0;
      //            int mayores = 0;
      //            int menores = 0;
      //
      //            for (int i = 0; i < personas.length; i++) {
      //               imcs[i] = personaServicio.calcularIMC(personas[i]);
      //               mayoresDeEdad[i] = personaServicio.esMayorDeEdad(personas[i]);
      //
      //               // Contar resultados para IMC
      //               if (imcs[i] == -1) {
      //                  bajoPeso++;
      //               } else if (imcs[i] == 0) {
      //                  pesoIdeal++;
      //               } else {
      //                  sobrepeso++;
      //               }
      //
      //               // Contar mayores y menores de edad
      //               if (mayoresDeEdad[i]) {
      //                  mayores++;
      //               } else {
      //                  menores++;
      //               }
      //            }
      //
      //            // Calcular porcentajes
      //            System.out.println("Porcentaje de personas con bajo peso: " + (bajoPeso * 100 /
      // personas.length) + "%");
      //            System.out.println("Porcentaje de personas en su peso ideal: " + (pesoIdeal * 100
      // / personas.length) + "%");
      //            System.out.println("Porcentaje de personas con sobrepeso: " + (sobrepeso * 100 /
      // personas.length) + "%");
      //            System.out.println("Porcentaje de personas mayores de edad: " + (mayores * 100 /
      // personas.length) + "%");
      //            System.out.println("Porcentaje de personas menores de edad: " + (menores * 100 /
      // personas.length) + "%");

      CadenaServicio cs = new CadenaServicio();
      Cadena cadena1 = cs.crearCadena();

//    System.out.println("Ingresar un caracter a reemplazar por la letra A");
//    String caracter = sc.next();

//          System.out.println("Ingrese una frase");
//          String fraseNueva = sc.nextLine();

    //      cadena1.setFrase(sc.nextLine());
    //      cadena1.setLargo(cadena1.getFrase().length());
          System.out.println("Ingrese una letra para ver si esta en la frase ingresada");
          String letra = sc.nextLine();

    //      cs.mostrarVocales(cadena1);
    //      cs.invertirFrase(cadena1);
    // cs.vecesRepetido(letra, cadena1);
    // cs.compararLongitud(fraseNueva, cadena1);
    // cs.unirFrases(cadena1,fraseNueva);
    //cs.reemplazar(cadena1,caracter);
      cs.contiene(cadena1, letra);
   }
}
