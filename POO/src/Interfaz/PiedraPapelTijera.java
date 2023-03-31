package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego{

    private String nomJugador;
    private int eleccion;
    private int sistema;
    

    Scanner lectura=new Scanner(System.in);


    public void iniciar() {
        System.out.println("ingrese nombre del jugador:");
        nomJugador=lectura.next();
    }

    public void jugar() {
        System.out.println("jugador "+nomJugador+" digite 1, si elige piedra, digite 2 si elige papel y digite 3 si elige tijera");
        eleccion=lectura.nextInt();
        Random aleatorio=new Random();
        sistema=aleatorio.nextInt(3)+1;
        System.out.println("1,2,3 piedra papel o tijeras");
    }

    public void finalizar() {
        if (sistema==1 && eleccion==1){ 
        System.out.println("cayó piedra, esto es empate");
     }
     else if (sistema==1 && eleccion==2){
        System.out.println("el sistema ha elegido piedra y el jugador "+nomJugador+" ha elegido papel, el jugador ha ganado");
     }
     else if (sistema==1 && eleccion==3){
        System.out.println("el sistema ha elegido piedra y el jugador "+nomJugador+" ha elegido tijera, el sistema ha ganado");
     }
     else if (sistema==2 && eleccion==1){
        System.out.println("el sistema ha elegido papel y el jugador "+nomJugador+" ha elegido piedra, el sistema ha ganado");
     }
     else if (sistema==2 && eleccion==2){
        System.out.println("cayó papel, esto es empate");
     }
     else if (sistema==2 && eleccion==3){
        System.out.println("el sistema ha elegido papel y el jugador "+nomJugador+" ha elegido tijera, el jugador ha ganado");
     }
      else if (sistema==3 && eleccion==1){
        System.out.println("el sistema ha elegido tijera y el jugador "+nomJugador+" ha elegido piedra, el jugador ha ganado");
     }
     else if (sistema==3 && eleccion==2){
        System.out.println("el sistema ha elegido tijera y el jugador "+nomJugador+" ha elegido papel, el sistema ha ganado");
     }
     else if (sistema==3 && eleccion==3){
        System.out.println("cayó tijera, esto es empate");
     }

    }
 } 