package com.coffe;

public class BodyKit extends CondimentDecorator{
    Mercedes mercedes;

    public BodyKit(Mercedes mercedes) {
        this.mercedes = mercedes;
    }

    public String getDescription() {
        return mercedes.getDescription() + ", Additional body kit" ;
    }

    public double cost() {
        return 50000.00 + mercedes.cost();
    }
}
