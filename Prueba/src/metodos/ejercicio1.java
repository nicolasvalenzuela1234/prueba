package metodos;

public class ejercicio1 {

    private int cuenta;
    private String nombre;
    private int saldo;
    private int interes;

    public ejercicio1(int cuenta, String nombre, int saldo, int interes) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    public String mostrarDatos(){
    return this.cuenta+" - "+
        this.nombre+" - "+
        this.saldo+" - "+
        this.interes;
}
    public void deposito(int saldo, int deposito){
        this.saldo+=deposito;
    }

}
