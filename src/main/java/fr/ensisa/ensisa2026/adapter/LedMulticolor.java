package fr.ensisa.ensisa2026.adapter;

public class LedMulticolor implements Commutable {

    private boolean isOn = false;
    private String color = "white";

    public LedMulticolor() {
    }

    public LedMulticolor(String color) {
        this.color = color;
    }

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
        return isOn ? "led "+ this.color + " : on" : "led "+ this.color + " : off";
    }
}
