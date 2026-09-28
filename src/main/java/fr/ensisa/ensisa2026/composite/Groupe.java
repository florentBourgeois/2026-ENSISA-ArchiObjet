package fr.ensisa.ensisa2026.composite;

import java.util.ArrayList;
import java.util.List;

public class Groupe implements Chantant {

    private List<Chantant> chanteurs = new ArrayList<Chantant>();

    public Groupe() {
    }

    public Groupe(List<Chantant> chanteurs) {
        this.chanteurs = chanteurs;
    }

    public void addChantant(Chantant chantant) {
        chanteurs.add(chantant);
    }

    @Override
    public void chante() {
        for (Chantant chantant : chanteurs) {
            chantant.chante();
        }
    }
}
