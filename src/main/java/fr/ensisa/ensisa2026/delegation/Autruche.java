package fr.ensisa.ensisa2026.delegation;

public class Autruche extends Oiseau {

    public Autruche() {
        this.couleur = "noir et blanche";
        this.comportementVole = new VolIncapable();
    }

    public void courir() {
        System.out.println("Courir très très vite");
    }


    @Override
    public void affiche() {
        System.out.print("Canard : ");
        super.affiche();
    }
}