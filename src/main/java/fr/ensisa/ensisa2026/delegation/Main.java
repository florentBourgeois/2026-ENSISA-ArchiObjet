package fr.ensisa.ensisa2026.delegation;

public class Main {

    public static void main(String[] args) {
        Oiseau o = new Autruche();
        o.affiche();
        o.faireVole();

        Canard canard = new Canard();
        canard.affiche();
        canard.faireVole();
        canard.casserLesAiles();
        canard.faireVole();
        canard.soignerAiles();
        canard.faireVole();
    }




}
