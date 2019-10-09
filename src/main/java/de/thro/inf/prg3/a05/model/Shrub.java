package de.thro.inf.prg3.a05.model;

public class Shrub extends Plant {
private final PlantColor color;

    protected Shrub(String name, String family, double height,PlantColor color) {
        super(name, family, height);
        this.color=PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return null;
    }
}
