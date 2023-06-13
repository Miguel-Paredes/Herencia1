public class menu {
    public static void main(String[] args) {
        Signo Ana = new Signo("Ana",33, "", "Leo");
        Persona Pablo = new Persona("Pablo",0,"123456");
        Entrenamiento Maritza = new Entrenamiento("Maritza", 0, "",5);
        Estudiante Melani = new Estudiante("Melani", 0, "", "3er");
        System.out.println(Ana.getNombre()+" es Doctora");
        Ana.anio();
        Ana.tipo_signo();
        Ana.examinar();
        System.out.println();
        System.out.println(Pablo.getNombre()+" es Empleado Publico");
        Pablo.celular();
        Pablo.tramitar();
        System.out.println();
        System.out.println(Melani.getNombre()+" es Estudiante");
        Melani.estudia();
        System.out.println();
        System.out.println(Maritza.getNombre()+" es Futbolista");
        Maritza.entrenamiento();
    }
}
