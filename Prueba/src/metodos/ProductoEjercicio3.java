package metodos;

import java.util.Scanner;

public class ProductoEjercicio3 {

    private String referencia;
    private String nombre;
    private Double precio;

    public ProductoEjercicio3(String referencia, String nombre, Double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getAtributos() {
        return this.referencia + " - " + this.nombre + " - " + this.precio;
    }

    public void setPrecio(String referencia, String nombre, Double precio) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese referencia");
        referencia = entrada.nextLine();
        System.out.println("ingrese nombre");
        nombre = entrada.nextLine();
        System.out.println("ingrese precio");
        precio = entrada.nextDouble();
    }

    public void calculoVenta(String referencia) {

    }
}
