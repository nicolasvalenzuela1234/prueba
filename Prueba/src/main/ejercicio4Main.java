
package main;

import java.util.Scanner;
import metodos.FuncionarioEjercicio4;

public class ejercicio4Main {
    public static void main(String[] args) {
        FuncionarioEjercicio4 funcionario;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese rut");
        String rut = entrada.nextLine();
        System.out.println("ingrese nombre");
        String nombre = entrada.nextLine();
        System.out.println("ingrese apellido paterno");
        String apellidoPaterno = entrada.nextLine();
        System.out.println("ingrese apellido materno");
        String apellidoMaterno = entrada.nextLine();
        System.out.println("ingrese fecha nacimiento");
        String fechaNacimiento = entrada.nextLine();
        System.out.println("ingrese sueldo");
        double sueldo = entrada.nextDouble();
        funcionario = new FuncionarioEjercicio4(rut,nombre,apellidoPaterno,apellidoMaterno,fechaNacimiento,sueldo);
        
        System.out.println(funcionario.getAtributos());
        
        
    }
    
}
