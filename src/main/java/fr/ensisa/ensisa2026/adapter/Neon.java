package fr.ensisa.ensisa2026.adapter;

public class Neon implements Commutable {

    private boolean isOn = false;

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public String toString() {
        return isOn ? "neon : on" : "neon : off";
    }
}
