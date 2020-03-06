
public class Usuario {
    
    private String name, password, display,fecha;

    public Usuario() {
    }

    public Usuario(String name, String password, String display, String fecha) {
        this.name = name;
        this.password = password;
        this.display = display;
        this.fecha = fecha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return display;
    }
    
    
    
}
