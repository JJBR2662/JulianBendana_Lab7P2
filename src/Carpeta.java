
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


public class Carpeta {
    private String nombre;
    private String link;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();

    public Carpeta(String nombre) {
        this.nombre = nombre;
        String lk = "";
        for (int i = 0; i < 5; i++) {
            int cual= new Random().nextInt((3 - 1) + 1) + 1;
            switch (cual) {
                case 1:
                    int ran1 = new Random().nextInt((9 - 0) + 1) + 0;
                    lk+=""+ran1;
                    break;
                case 2:
                    int random = new Random().nextInt((90 - 65) + 1) + 65;
                    lk+=(char)random;
                    break;
                default:
                    int random2 = new Random().nextInt((122 - 97) + 1) + 97;
                    lk+=(char)random2;
                    break;
            }
        }
        this.link = lk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
