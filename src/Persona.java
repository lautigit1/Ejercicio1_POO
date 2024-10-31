public class Persona {
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private String paisNacimiento;
    private int añoNacimiento;
    private char genero;

    // Constructor completo
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento > 0 ? añoNacimiento : 0;
        this.paisNacimiento = paisNacimiento != null ? paisNacimiento : "Desconocido";
        this.genero = genero;
    }

    // Constructor parcial con valores predeterminados
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad) {
        this(nombre, apellidos, numeroDocumentoIdentidad, 0, "Desconocido", 'U');
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Metodo para imprimir todos los atributos con un formato diferente
    public void imprimir() {
        System.out.printf("Nombre Completo: %s %s%n", this.nombre, this.apellidos);
        System.out.printf("Documento de Identidad: %s%n", this.numeroDocumentoIdentidad);
        System.out.printf("Año de Nacimiento: %s%n", this.añoNacimiento > 0 ? this.añoNacimiento : "Desconocido");
        System.out.printf("País de Nacimiento: %s%n", this.paisNacimiento);
        System.out.printf("Género: %s%n", this.genero != 'U' ? this.genero : "No especificado");
        System.out.println();
    }
}
