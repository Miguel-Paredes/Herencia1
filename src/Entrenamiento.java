public class Entrenamiento extends Persona{
    private int horas;

    public Entrenamiento(int horas) {
        super();
    }

    public Entrenamiento(String nombre, int edad, String telefono, int horas) {
        super(nombre, edad, telefono);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void entrenamiento(){
        System.out.println("Entrena "+horas+" horas diarias");
    }
}
