package lab7_joshuamartinez;

import javax.swing.JProgressBar;

public class AdminPregress extends Thread {

    private JProgressBar progressbar;
    private boolean v=true;
    private String lugar;

    public AdminPregress() {
    }

    public AdminPregress(JProgressBar progressbar, String lugar) {
        this.progressbar = progressbar;
        this.lugar = lugar;
    }

    @Override
    public void run() {
        while (v) {
            progressbar.setString(lugar);
            v = false;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
