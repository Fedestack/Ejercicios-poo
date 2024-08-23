package org.ejemplo.entidad;
/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */

public class Cuenta {

   private int numero_de_cuenta;
   private long dni;
   private int saldo_actual;
   private int interes;

   public Cuenta() {
   }

   public Cuenta(int interes, int saldo_actual, long dni, int numero_de_cuenta) {
      this.interes = interes;
      this.saldo_actual = saldo_actual;
      this.dni = dni;
      this.numero_de_cuenta = numero_de_cuenta;
   }

   public int getNumero_de_cuenta() {
      return numero_de_cuenta;
   }

   public void setNumero_de_cuenta(int numero_de_cuenta) {
      this.numero_de_cuenta = numero_de_cuenta;
   }

   public long getDni() {
      return dni;
   }

   public void setDni(long dni) {
      this.dni = dni;
   }

   public int getSaldo_actual() {
      return saldo_actual;
   }

   public void setSaldo_actual(int saldo_actual) {
      this.saldo_actual = saldo_actual;
   }

   public int getInteres() {
      return interes;
   }

   public void setInteres(int interes) {
      this.interes = interes;
   }

   @Override
   public String toString() {
      return "Cuenta{" +
              "numero_de_cuenta=" + numero_de_cuenta +
              ", dni=" + dni +
              ", saldo_actual=" + saldo_actual +
              ", interes=" + interes +
              '}';
   }
}
