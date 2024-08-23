package org.ejemplo.servicio;

import org.ejemplo.entidad.Cuenta;

import java.util.Scanner;

public class CuentaServicio {
  Scanner sc = new Scanner(System.in);

  public Cuenta crearCuenta() {
    Cuenta c1 = new Cuenta();
    System.out.println("Ingrese los siguientes datos para crear la cuenta");
    System.out.println("Numero de cuenta");
    c1.setNumero_de_cuenta(sc.nextInt());
    System.out.println("Dni");
    c1.setDni(sc.nextInt());
    System.out.println(c1.toString());
    return c1;
  }

  public void ingresar(Cuenta c1) {
    System.out.println("Ingrese el monto a depositar");
    double ingreso = sc.nextDouble();
    c1.setSaldo_actual((int) ((double) c1.getSaldo_actual() + ingreso));
    System.out.println(c1.toString());
  }

  public void retirar(Cuenta c1) {
    System.out.println("Ingrese el monto a retirar");
    double retiro = sc.nextDouble();
    if (c1.getSaldo_actual() < retiro) {
      System.out.println("No tiene saldo suficiente\n" + "Saldo disponible " + c1.getSaldo_actual());
    } else {
      c1.setSaldo_actual((int) ((double) c1.getSaldo_actual() - retiro));
      System.out.println(c1.toString());
    }
  }

  public void extraccionRapida(Cuenta c1) {
    double porcentaje = (c1.getSaldo_actual() * 20) / 100;
    if (((double) c1.getSaldo_actual()) < porcentaje) {
      System.out.println(
          "Monto de extraccion rapida excedido\n" + "Monto maximo a retirar " + porcentaje);
    } else {
      c1.setSaldo_actual((int) ((double) c1.getSaldo_actual() - porcentaje));
      System.out.println(c1.toString());
    }
  }

  public void consultarSaldo(Cuenta c1) {
    System.out.println("Saldo de la cuenta " + c1.getSaldo_actual());
  }

  public void consultarDatos(Cuenta c1) {
    System.out.println(
        "Datos de la cuenta\n"
            + "Numero de cuenta "
            + c1.getNumero_de_cuenta()
            + "\n"
            + "Dni del titular "
            + c1.getDni());
  }
}
