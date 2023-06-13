public class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public Persona(){}
    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void anio(){
        System.out.println("Tiene "+edad+" años");
    }
    public void celular(){
        System.out.println("Su teléfono es: "+telefono);
    }
    public void tramitar(){System.out.println("Este es el método de tramitar");}
}
