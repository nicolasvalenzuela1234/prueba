package main;

import java.util.Scanner;
import metodos.ejercicio1;


public class ejercicio1Main {

    public static void main(String[] args) {
        ejercicio1 usuario;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese numero de la cuenta");
        int numeroCuenta = entrada.nextInt();
        entrada.skip("\n");
        System.out.println("ingrese titular de la cuenta");
        String titular = entrada.nextLine();
        System.out.println("ingrese saldo de la cuenta");
        int saldo = entrada.nextInt();
        System.out.println("ingrese interes anual");
        int interes = entrada.nextInt();
        usuario = new ejercicio1(numeroCuenta,titular,saldo,interes);
        System.out.println(usuario.mostrarDatos());
        System.out.println("ingrese deposito");
        
    }

}
