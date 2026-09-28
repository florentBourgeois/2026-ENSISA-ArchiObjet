package fr.ensisa.ensisa2026.delegation;

public class VolIncapable implements VoleComment {

    @Override
    public void vole() {
        System.out.println("Incapable de voler");
    }
}
