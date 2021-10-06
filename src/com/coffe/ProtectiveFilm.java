package com.coffe;

public class ProtectiveFilm extends CondimentDecorator{
    Mercedes mercedes;

    public ProtectiveFilm(Mercedes mercedes) {
        this.mercedes = mercedes;
    }

    public String getDescription() {
        return mercedes.getDescription() + ", Protective film" ;
    }

    public double cost() {
        return 7000.00 + mercedes.cost();
    }
}
