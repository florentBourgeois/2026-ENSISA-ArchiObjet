package fr.ensisa.ensisa2026.adapter;

public class MaxColor {
    private String couleur = "red";
    private int intensité = 0;
    private  int phi, theta, psi;
    private int strobe;

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setAngle(int p, int T, int ps){
        this.phi = p;
        this.theta = T;
        this.psi = ps;
    }

    public void setIntensité(int intensité) {
        this.intensité = intensité;
    }

    @Override
    public String toString() {
        return "MaxColor{" +
                "couleur='" + couleur + '\'' +
                ", intensité=" + intensité +
                ", phi=" + phi +
                ", theta=" + theta +
                ", psi=" + psi +
                ", strobe=" + strobe +
                '}';
    }
}
