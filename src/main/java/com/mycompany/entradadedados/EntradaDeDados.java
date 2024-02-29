package com.mycompany.entradadedados;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); // inserir algum dado 
        
       String x,y,z;
       int w;
       
        System.out.println("Digite uma PALAVRA, um NÚMERO, um NÚMERO COM PONTO e uma LETRA:");
        
        w = teclado.nextInt();
        x = teclado.nextLine();
        y = teclado.nextLine();
        z = teclado.nextLine();
        
        System.out.println("Dados digitados:");
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
       
       
        teclado.close();
        
        
        

    }
}
