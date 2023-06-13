public class Estudiante extends Persona{
    private String semestre;

    public Estudiante(String semestre) {
        super();
    }

    public Estudiante(String nombre, int edad, String telefono, String semestre) {
        super(nombre, edad, telefono);
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public void estudia(){
        System.out.println("Está en "+semestre+" semestre");
    }
}
