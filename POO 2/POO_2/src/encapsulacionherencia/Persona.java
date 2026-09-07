package encapsulacionherencia;

public abstract class Persona {

    public String nombres;
    public String apellidos;
    protected String cuentaBancaria;

    public Persona(String nombres, String apellidos, String cuentaBancaria) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuentaBancaria = cuentaBancaria;
    }

    public abstract void mostrarInformacion();
}