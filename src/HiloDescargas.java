
import javax.swing.*;

public class HiloDescargas implements Runnable {

    private JProgressBar barra;
    private double peso;
    private boolean dale;

    public HiloDescargas() {
    }

    public HiloDescargas(JProgressBar barra, double peso) {
        this.barra = barra;
        this.peso = peso;
        this.dale = dale = false;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isDale() {
        return dale;
    }

    public void setDale(boolean dale) {
        this.dale = dale;
    }

    @Override
    public String toString() {
        return "HiloDescargas{" + "barra=" + barra + ", peso=" + peso + ", dale=" + dale + '}';
    }

    @Override
    public void run() {
        while (dale) {
            if (barra.getValue() >= 100) {
                dale = false;
            } else {
                barra.setValue(barra.getValue() + 10);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
