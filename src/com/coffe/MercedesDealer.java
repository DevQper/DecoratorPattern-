package com.coffe;

public class MercedesDealer {
    public static void main(String args[]) {
        Mercedes mercedes = new MercedesClassG();
        System.out.println(mercedes.getDescription()
                + " $" + mercedes.cost());
        Mercedes mercedes2 = new MercedesClassG();
        mercedes2 = new ChipTuning(mercedes2);
        mercedes2 = new ChipTuning(mercedes2);
        mercedes2 = new BodyKit(mercedes2);
        System.out.println(mercedes2.getDescription()
                + " $" + mercedes2.cost());
        Mercedes mercedes3 = new MercedesClassC();
        mercedes3 = new ProtectiveFilm(mercedes3);
        mercedes3 = new ChipTuning(mercedes3);
        mercedes3 = new BodyKit(mercedes3);
        System.out.println(mercedes3.getDescription()
                + " $" + mercedes3.cost());
        Mercedes mercedes4 = new MercedesClassS();
        mercedes4 = new BodyKit(mercedes4);
        System.out.println(mercedes4.getDescription()
                + " $" + mercedes4.cost());
    }
}
