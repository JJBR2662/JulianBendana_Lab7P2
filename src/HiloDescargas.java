
import javax.swing.*;

public class HiloDescargas implements Runnable {

    private JProgressBar barra;
    private double peso;
    private boolean dale;
    private boolean avanzar;

    public HiloDescargas() {
    }

    public HiloDescargas(JProgressBar barra, double peso) {
        this.barra = barra;
        this.peso = peso;
        this.dale =  true;
        this.avanzar = true;
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
        barra.setValue(0);
        long time = (long) (peso/10);
        int max = (int) time;
        barra.setMaximum(max);
        while (dale) {            
            if (avanzar) {
                barra.setValue(barra.getValue()+1);
                if (barra.getValue()==time) {
                    dale = false;
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        barra.setValue(0);
    }

}
