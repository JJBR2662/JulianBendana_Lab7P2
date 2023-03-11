
import java.io.Serializable;

import java.util.Random;
public class Archivo {
    private String nombre;
    private String link;
    private String extension;
    private double tamanio;

    public Archivo() {
    }

    public Archivo(String nombre, String extension, double tamanio) {
        this.nombre = nombre;
        
        String lk = "";

        for (int i = 0; i < 10; i++) {
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
        this.extension = extension;
        this.tamanio = tamanio;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
