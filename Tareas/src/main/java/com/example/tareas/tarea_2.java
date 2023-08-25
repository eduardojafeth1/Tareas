package com.example.tareas;

import java.util.Arrays;
import java.util.Random;

public class tarea_2 {

    public static void main(String[] args) {
        Random r=new Random();
     int player1 = 0,player2=0,p;
     for(int i=0;i<4;i++){
        p=r.nextInt(1,6);
         System.out.println(p);
         if(i<2){
             System.out.println("Jugador 1 lanzó un dado y obtuvo: " + p);
             player1+=p;
         }else{
             System.out.println("Jugador 2 lanzó un dado y obtuvo: " + p);
             player2+=p;
         }

     }
        System.out.println("Puntaje del Jugador 1: " + player1);
        System.out.println("Puntaje del Jugador 2: " + player2);

        if (player1 > player2) {
            System.out.println("¡Jugador 1 gana!");
        } else if (player2 > player1) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}
