
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Binario {

    private AdministrarTodos at = new AdministrarTodos();
    private File archivo = null;

    public Binario(String path) {
        archivo = new File(path);
    }

    public AdministrarTodos getAt() {
        return at;
    }

    public void setAt(AdministrarTodos at) {
        this.at = at;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Binario{" + "at=" + at + ", archivo=" + archivo + '}';
    }

    public void CargarArchivo() {
        try {
            AdministrarTodos ta;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    at = (AdministrarTodos) objeto.readObject();
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }

    public void EscribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(at);
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }

        }
    }

}
