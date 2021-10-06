package com.coffe;

public class ChipTuning extends CondimentDecorator {
    Mercedes mercedes;

    public ChipTuning(Mercedes mercedes) {
        this.mercedes = mercedes;
    }

    public String getDescription() {
        return mercedes.getDescription() + ", Chip tuning(Engine tuning)" ;
    }

    public double cost() {
        return 30000.00 + mercedes.cost();
    }
}