import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase derivadas de Persona.
public class RegistroPersonas extends Persona {

    private final List<Persona> registroPersonas = new ArrayList<>(); // Lista de personas registradas.

    // Método para agregar personas al registroPersonas.
    public void agregarPersona() {

        int cantidadPersonas; // Variable para almacenar la cantidad de personas a registrar.

        Scanner sc = new Scanner(System.in); // Scanner para leer la entrada del usuario.
        System.out.print("Digite el numero de personas a registrar: ");
        cantidadPersonas = sc.nextInt();

        // Agregar personas al registro.
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\n\nRegistro de persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            setNombre(sc.next());
            System.out.print("Apellido: ");
            setApellido(sc.next());
            System.out.print("Genero: ");
            setGenero(sc.next());
            System.out.print("Edad: ");
            setEdad(sc.nextInt());

            // Crear una nueva instancia de Persona y agregarla a la lista.
            Persona persona = new Persona(getNombre().toUpperCase(), getApellido().toUpperCase(), getGenero().toUpperCase(), getEdad());
            registroPersonas.add(persona);  // Agregar la persona a la lista de registroPersonas.
        }

    }

    // Método para calcular el promedio de edades.
    @Override
    public void promedioEdades() {
        double sumaEdades = 0; // Variable para almacenar la suma de las edades.

        for (Persona persona : registroPersonas) {
            sumaEdades += persona.getEdad(); // Acumular la edad de cada persona al total.
        }
        // Calcular el promedio de edades.
        double promedio = sumaEdades / registroPersonas.size();
        System.out.println("\n\n\nEl promedio de edades es: " + promedio);
    }

    // Método para contar la cantidad de personas masculinas.
    @Override
    public void CantidadMasculino() {
        int cont = 0; // Variable para contar la cantidad de personas masculinas.
        for (Persona persona : registroPersonas) {
            if (persona.getGenero().equals("MASCULINO")) { // Verificar si el género es masculino.
                cont++; // Incrementar el contador.
            }
        }

        System.out.println("La cantidad de personas masculinas registradas es: " + cont);
    }

    // Método para contar la cantidad de personas femeninas.
    @Override
    public void CantidadFemenina() {
        int cont = 0;
        for (Persona persona : registroPersonas) {
            if (persona.getGenero().equals("FEMENINO")) {
                cont++;
            }
        }
        System.out.println("La cantidad de personas femeninas registradas es: " + cont);
    }

    // Método para mostrar la lista de personas registradas.
    @Override
    public void listaPersonasRegistradas() {
        System.out.println("\n\n\n\t-------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tREGISTRO DE PERSONAS");
        System.out.println("\t-------------------------------------------------------------");

        // Encabezado de la tabla
        System.out.printf("\t%-20s %-20s %-10s %-8s\n", "Nombre", "Apellido", "Género", "Edad");
        System.out.println("\t-------------------------------------------------------------");

        // Datos de cada persona
        for (Persona persona : registroPersonas) {
            System.out.printf("\t%-20s %-20s %-10s %-8d\n",
                    persona.getNombre(),
                    persona.getApellido(),
                    persona.getGenero(),
                    persona.getEdad());
        }
        System.out.println("\t-------------------------------------------------------------");
    }

}
