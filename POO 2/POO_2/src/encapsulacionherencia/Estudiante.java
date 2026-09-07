package encapsulacionherencia;

public class Estudiante extends Persona {

    private int creditosObtenidos;

    public Estudiante(String nombres, String apellidos,
                      String cuentaBancaria, int creditosObtenidos) {

        super(nombres, apellidos, cuentaBancaria);
        this.creditosObtenidos = creditosObtenidos;
    }

    public int getCreditosObtenidos() {
        return creditosObtenidos;
    }

    public void setCreditosObtenidos(int creditosObtenidos) {
        this.creditosObtenidos = creditosObtenidos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== ESTUDIANTE =====");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Cuenta bancaria: " + cuentaBancaria);
        System.out.println("Créditos obtenidos: " + creditosObtenidos);
    }
}