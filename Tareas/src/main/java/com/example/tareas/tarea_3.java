package com.example.tareas;

import java.util.Scanner;

public class tarea_3 {
    public static void main(String[] args) {
        System.out.print("nombre: ");
        Scanner teclado=new Scanner(System.in);
        String name=teclado.nextLine();
     String[] nombres=name.split(" ");
     for (String s:nombres) {
         System.out.println(s+": "+s.length()+" letras");
     }
}
}
