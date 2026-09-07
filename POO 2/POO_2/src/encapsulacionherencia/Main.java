package encapsulacionherencia;

public class Main {

    public static void main(String[] args) {

        // Crear 2 alumnos
        Estudiante estudiante1 = new Estudiante(
                "Oscar David",
                "Castillo",
                "220856312",
                45
        );

        Estudiante estudiante2 = new Estudiante(
                "Juan Carlos",
                "Perez",
                "987654321",
                60
        );

        // Crear 2 catedráticos
        Catedratico catedratico1 = new Catedratico(
                "Carlos Alberto",
                "Lopez",
                "111222333",
                6500.00
        );

        Catedratico catedratico2 = new Catedratico(
                "Maria Elena",
                "Gomez",
                "444555666",
                7200.00
        );

        // Imprimir información
        estudiante1.mostrarInformacion();

        System.out.println();

        estudiante2.mostrarInformacion();

        System.out.println();

        catedratico1.mostrarInformacion();

        System.out.println();

        catedratico2.mostrarInformacion();
    }
}