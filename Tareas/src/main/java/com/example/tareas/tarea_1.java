package com.example.tareas;

import java.util.Scanner;

public class tarea_1 {
  static   public void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
      System.out.println("Tu nombre es ");
        String name=teclado.nextLine();
       String iniciales=getIniciales(name);
      System.out.println(iniciales);
       dibujar(String.valueOf(iniciales.toUpperCase()));


    }
    public static String getIniciales(String word){
        String[] palabras=word.split(" ");
        String ini="";
        for(String string:palabras){
            ini=ini+string.charAt(0);
        }
        return ini;
    }

        static String[] A = {
                "  *  ",
                " * * ",
                "*   *",
                "*****",
                "*   *"
        };

        static String[] B = {
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        };

        static String[] C = {
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
        };

        static String[] D = {
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                "**** "
        };

        static String[] E = {
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*****"
        };

        static String[] F = {
                "*****",
                "*    ",
                "**** ",
                "*    ",
                "*    "
        };

        static String[] G = {
                " ****",
                "*    ",
                "*  ***",
                "*   * ",
                " **** "
        };

        static String[] H = {
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        };

        static String[] I = {
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        };

        static String[] J = {
                "    *",
                "    *",
                "    *",
                "*   *",
                " *** "
        };

        static String[] K = {
                "*   *",
                "*  * ",
                "**   ",
                "*  * ",
                "*   *"
        };

        static String[] L = {
                "*    ",
                "*    ",
                "*    ",
                "*    ",
                "*****"
        };

        static String[] M = {
                "*   *",
                "** **",
                "* * *",
                "*   *",
                "*   *"
        };

        static String[] N = {
                "*   *",
                "**  *",
                "* * *",
                "*  **",
                "*   *"
        };

        static String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        static String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        static String[] Q = {
                " *** ",
                "*   *",
                "* * *",
                "*  **",
                " *** "
        };

        static String[] R = {
                "**** ",
                "*   *",
                "**** ",
                "*  * ",
                "*   *"
        };

        static String[] S = {
                " *** ",
                "*    ",
                " *** ",
                "    *",
                " *** "
        };

        static String[] T = {
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        };

        static String[] U = {
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        static String[] V = {
                "*   *",
                "*   *",
                "*   *",
                " * * ",
                "  *  "
        };

        static String[] W = {
                "*   *",
                "*   *",
                "* * *",
                "** **",
                "*   *"
        };

        static String[] X = {
                "*   *",
                " * * ",
                "  *  ",
                " * * ",
                "*   *"
        };

        static String[] Y = {
                "*   *",
                " * * ",
                "  *  ",
                "  *  ",
                "  *  "
        };

        static String[] Z = {
                "*****",
                "   * ",
                "  *  ",
                " *   ",
                "*****"
        };


        public static void dibujar(String a){
String n = null;
            for (int e=0;e<a.length();e++){
                n=String.valueOf(a.charAt(e));
for (int o=0;o<5;o++){
    

        switch (n) {
            case "A":
                System.out.println(A[o]);
                break;
            case "B":
                System.out.println(B[o]);
                break;
            case "C":
                System.out.println(C[o]);
                break;
            case "D":
                System.out.println(D[o]);
                break;
            case "E":
                System.out.println(E[o]);
                break;
            case "F":
                System.out.println(F[o]);
                break;
            case "G":
                System.out.println(G[o]);
                break;
            case "H":
                System.out.println(H[o]);
                break;
            case "I":
                System.out.println(I[o]);
                break;
            case "J":
                System.out.println(J[o]);
                break;
            case "K":
                System.out.println(K[o]);
                break;
            case "L":
                System.out.println(L[o]);
                break;
            case "M":
                System.out.println(M[o]);
                break;
            case "N":
                System.out.println(N[o]);
                break;
            case "O":
                System.out.println(O[o]);
                break;
            case "P":
                System.out.println(P[o]);
                break;
            case "Q":
                System.out.println(Q[o]);
                break;
            case "R":
                System.out.println(R[o]);
                break;
            case "S":
                System.out.println(S[o]);
                break;
            case "T":
                System.out.println(T[o]);
                break;
            case "U":
                System.out.println(U[o]);
                break;
            case "V":
                System.out.println(V[o]);
                break;
            case "W":
                System.out.println(W[o]);
                break;
            case "X":
                System.out.println(X[o]);
                break;
            case "Y":
                System.out.println(Y[o]);
                break;
            case "Z":
                System.out.println(Z[o]);
                break;
            default:
                break;
        };


    }}}
}
