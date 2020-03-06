
public class ClaseMensajes {
    
    private String mensaje1, mensaje2;

    public ClaseMensajes() {
    }

    public ClaseMensajes(String mensaje1, String mensaje2) {
        this.mensaje1 = mensaje1;
        this.mensaje2 = mensaje2;
    }

    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }

    public String getMensaje2() {
        return mensaje2;
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }

    @Override
    public String toString() {
        return "ClaseMensajes{" + "mensaje1=" + mensaje1 + ", mensaje2=" + mensaje2 + '}';
    }
    
    
    
}
