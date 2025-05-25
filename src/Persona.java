
// Clase derivadas de ClaseBasePersona.
public class Persona extends ClaseBasePersona {


    // Método constructor de la clase Persona.
    public Persona() {
    }

    // Constructor de la clase Persona que recibe los parámetros nombre, apellido, genero y edad.
    public Persona(String nombre, String apellido, String genero, int edad) {
        super(nombre, apellido, genero, edad); // Llama al constructor de la clase base ClaseBasePersona.
    }

    // Métodos para obtener y establecer los valores de los atributos.

    @Override
    public void agregarPersona() {
    }

    @Override
    public void promedioEdades() {
    }

    @Override
    public void CantidadMasculino() {
    }

    @Override
    public void CantidadFemenina() {
    }

    @Override
    public void listaPersonasRegistradas() {
    }

}
