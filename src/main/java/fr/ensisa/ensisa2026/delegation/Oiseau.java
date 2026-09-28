package fr.ensisa.ensisa2026.delegation;

public abstract class Oiseau {

    protected String couleur;
    protected VoleComment comportementVole;


    public void affiche(){
        System.out.println( "un oiseau de couleur " +this.couleur);
    }

    public void faireVole(){
        // quand on demmande à l'oiseau de voler, il délègue l'action à son objet VoleComment
        this.comportementVole.vole();
    }



}
