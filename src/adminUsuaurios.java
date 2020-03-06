
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class adminUsuaurios {

    private ArrayList<Usuario> personitas = new ArrayList();
    private File archivo = null;

    public adminUsuaurios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getPersonitas() {
        return personitas;
    }

    public void setPersonitas(ArrayList<Usuario> personitas) {
        this.personitas = personitas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista de usuarios=" + personitas + '}';
    }

    public void setPersona(Usuario p) {
        this.personitas.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Usuario t : personitas) {
                bw.write(t.getName() + ",");
                bw.write(t.getPassword() + ",");
                bw.write(t.getDisplay() + ",");;
                bw.write(t.getFecha() + ";\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        personitas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String m = sc.next();
                    String[] tokens = m.split(",");
                    if (tokens.length >= 4) {
                        Usuario u = new Usuario(tokens[0], tokens[1], tokens[2], tokens[3]);
                        personitas.add(u);
                    }

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
