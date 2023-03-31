package Principal;

import java.util.Scanner;

import Salud.Empleado;
//import Salud.Persona;

public class Inicio extends Empleado {
   
    public Inicio(String tipDoc, int documento, String nombre, String apellido, String cargo, int valorHora,
      int horaTrabajo, String departamento, int ganancias) {
    super(tipDoc, documento, nombre, apellido, cargo, valorHora, horaTrabajo, departamento, ganancias);

  }

    public static void main(String[] args) {

   //double peso,estatura;

   String cargo;
   int valorHora;
   int horaTrabajo;
   String departamento;
   int calcular=0;
    String tipDoc;
     int documento;
     String nombre;
     String apellido; 


Scanner lectura=new Scanner(System.in);

        System.out.print("ingrese su cargo: ");
        cargo = lectura.next();

        System.out.print("ingrese cuanto le pagan la hora de trabajo: ");
        valorHora = lectura.nextInt();

        System.out.print("ingrese cuantas horas de trabajo ha realizado: ");
        horaTrabajo = lectura.nextInt();

        System.out.print("ingrese el departamento en el que trabaja: ");
        departamento = lectura.next();

        System.out.print("ingrese su nombre: ");
        nombre=lectura.next();

        System.out.print("ingrese su apellido: ");
        apellido=lectura.next();

        System.out.print("ingrese su tipo de documento: ");
        tipDoc=lectura.next();

        System.out.print("ingrese su documento: ");
        documento=lectura.nextInt();

        //Persona dato=new Persona();


        //dato.pedirDatos();
Empleado e1 = new Empleado(tipDoc, documento, nombre, apellido, cargo, valorHora, horaTrabajo, departamento, calcular);
e1.mostrarDatos();
e1.calcularhonorarios();


      /*System.out.println("dijite peso");
      peso=lectura.nextDouble();
      System.out.println("dijite altura");
      estatura=lectura.nextDouble();

      

        Persona eso=new Persona();

        eso.operacion(peso, estatura);
        eso.mostrarResultado();
        eso.calcularMensaje();

      /*  eso.pedirDatos();
        eso.mostarCosa();
        eso.operacion();
        eso.mostrarResultado();
        eso.calcularMensaje();
        eso.mayorEdad();

        Ejecucion operacion=new Ejecucion();*/ 
      
      lectura.close();
    }
}
