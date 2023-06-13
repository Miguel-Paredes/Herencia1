public class Signo extends Persona{
    private String signo;

    public Signo(String signo) {
        super();
    }

    public Signo(String nombre, int edad, String telefono, String signo) {
        super(nombre, edad, telefono);
        this.signo = signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
    public void tipo_signo(){
        System.out.println("Es de signo "+signo);
    }
    public void examinar(){System.out.println("Este es el método de examinar");}
}
