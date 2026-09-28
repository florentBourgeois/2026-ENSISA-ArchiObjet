package fr.ensisa.ensisa2026.delegation;

public class VoleAvecDesAiles implements VoleComment {

    @Override
    public void vole() {
        System.out.println("Vole avec des ailes : flap flap flap");
    }
}
