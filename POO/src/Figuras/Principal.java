package Figuras;

import java.util.Scanner;

public class Principal {
   
    public static void main(String[]args){
        int lado;
        int base;
        int altura;
        double radio=0;
        int continuar=1;
        int eleccion;

        Scanner lectura=new Scanner(System.in);

    
        while(continuar==1){

        System.out.println("si deseas calcular el area del cuadrado digite el numero 1,si desea calcular el area del circulo digite el numero 2, si deseas calcular el area del rectangulo digite el numero 3 y si deseas calcular el area del triangulo dijite el numero 4 ");
        eleccion=lectura.nextInt();
       

        switch(eleccion) {

            case 1:
            System.out.println("ingrese el valor del lado del cuadrado: ");
            lado=lectura.nextInt();
           
            Cuadrado dato=new Cuadrado(lado);
            dato.calcularArea();
            break;

            case 2:
            System.out.println("ingrese el valor del radio del circulo : ");
            lado=lectura.nextInt();
           
            Circulo dato1=new Circulo(radio);
            dato1.calcularArea();
            break;
            

            case 3:
            System.out.println("ingrese el valor del lado del Rectangulo: ");
            lado=lectura.nextInt();
            System.out.println("ingrese el valor de la altura del Rectangulo: ");
            altura=lectura.nextInt();
           
            Rectangulo dato2=new Rectangulo(lado, altura);
            dato2.calcularArea();
            break;

            case 5:
            System.out.println("ingrese el valor del alto del triangulo: ");
            altura=lectura.nextInt();
            System.out.println("ingrese el valor de la base del triangulo: ");
            base=lectura.nextInt();
           
            Triangulo dato3=new Triangulo(base, altura);
            dato3.calcularArea();
            break; 
}
System.out.println("Ingresa 1. si desea calcular otra area y 2 si desea acabar ");
continuar=lectura.nextInt();
 
        }

        System.out.println("gracias por usar el programa"); 
         lectura.close();
    }
}
