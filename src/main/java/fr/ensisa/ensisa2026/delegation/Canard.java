package fr.ensisa.ensisa2026.delegation;

public class Canard extends Oiseau {

    public Canard() {
        this.couleur = "vert au col et gris ou noir ailleur";
        this.comportementVole = new VoleAvecDesAiles();
    }

    public void casserLesAiles(){
        this.comportementVole = new VolIncapable();
    }

    public void soignerAiles(){
        this.comportementVole = new VoleAvecDesAiles();
    }

    @Override
    public void affiche(){
        System.out.print( "Canard : ");
        super.affiche();
    }

}
