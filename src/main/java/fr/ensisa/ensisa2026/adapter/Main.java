package fr.ensisa.ensisa2026.adapter;

public class Main {

    public static void main(String[] args) {
        lampesDeBase();
        avantPatternAdapter();

        avecPatternAdapter();
    }

    public static void lampesDeBase(){
        Commutable commutable = new Neon();
        commutable.on();
        System.out.println(commutable);
        commutable.off();
        System.out.println(commutable);

        commutable =  new LedMulticolor();
        commutable.on();
        System.out.println(commutable);
        commutable.off();
        System.out.println(commutable);
        System.out.println("\n\n");
    }

    public static void avantPatternAdapter(){
        //Commutable commutable = new MaxColor() // impossible.. Le maxColor n'est pas un commutable. Il ne peut pas être positionné dans un commutable
        MaxColor mc = new MaxColor();
        //on
        mc.setIntensité(255);
        mc.setCouleur("white");
        System.out.println(mc);
        //off
        mc.setIntensité(0);
        System.out.println(mc);
        System.out.println("\n\n");
    }

    public static void avecPatternAdapter(){
        // permet de faire on et off sur un maxcolor

    }
}
