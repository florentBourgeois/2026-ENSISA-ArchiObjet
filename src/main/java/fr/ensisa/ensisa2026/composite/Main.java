package fr.ensisa.ensisa2026.composite;

public class Main {

    public static void main(String[] args) {
        Eminem e = new Eminem();
        e.chante();
        Pigeon p = new Pigeon();
        p.chante();

        System.out.println("groupe \n");
        Groupe g = new Groupe();
        g.addChantant(e);
        g.addChantant(p);
        g.chante();

        Groupe g2 = new Groupe();
        g2.addChantant(new Castafiore());
        g2.addChantant(new Castafiore());
        g2.addChantant(new Castafiore());
        g2.addChantant(new Canard());
        g2.addChantant(new Castafiore());
        g2.addChantant(new Canard());
        g2.addChantant(new Canard());

        g.addChantant(g2);
        g.chante();

        g2.addChantant(g);
        g.chante();



    }
}
