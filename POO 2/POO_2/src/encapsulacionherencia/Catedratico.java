package encapsulacionherencia;

public class Catedratico extends Persona {

    private double sueldo;

    public Catedratico(String nombres, String apellidos,
                       String cuentaBancaria, double sueldo) {
        super(nombres, apellidos, cuentaBancaria);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== CATEDRÁTICO =====");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Cuenta bancaria: " + cuentaBancaria);
        System.out.println("Sueldo: Q" + sueldo);
    }
}
