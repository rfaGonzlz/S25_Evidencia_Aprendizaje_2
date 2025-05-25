
//Clase abstracta que define la estructura de las clases Persona y RegistroPersonas.
public abstract class ClaseBasePersona {

    // Atributos de la clase ClaseBasePersona.
    private String nombre, apellido, genero;  // Nombre, apellido y género de la persona.
    private int edad; // Edad de la persona.

    // Constructor de la clase ClaseBasePersona.
    public ClaseBasePersona() {
    }

    // Constructor de la clase ClaseBasePersona que recibe los parámetros nombre, apellido, genero y edad.
    public ClaseBasePersona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    // Métodos getters y setters para obtener y establecer los valores de los atributos .
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos abstractos para obtener y establecer los valores de los atributos.

    public abstract void agregarPersona();

    public abstract void promedioEdades();

    public abstract void CantidadMasculino();

    public abstract void CantidadFemenina();

    public abstract void listaPersonasRegistradas();

}

