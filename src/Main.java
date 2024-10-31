public class Main {
    public static void main(String[] args) {
        // Creación de una persona usando el constructor completo
        Persona persona1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "España", 'H');
        persona1.imprimir();  // Imprimimos los datos de persona1

        // Creación de una persona usando el constructor parcial
        Persona persona2 = new Persona("Luis", "León", "1053223344");
        persona2.imprimir();  // Imprimimos los datos de persona2

        // Modificación de atributos usando setters
        persona2.setAñoNacimiento(2001);
        persona2.setPaisNacimiento("México");
        persona2.setGenero('M');

        // Reimpresión de los datos después de modificar los atributos
        System.out.println("Datos actualizados de persona2:");
        persona2.imprimir();
    }
}
