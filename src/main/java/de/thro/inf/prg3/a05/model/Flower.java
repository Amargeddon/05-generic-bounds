package de.thro.inf.prg3.a05.model;

public class Flower extends Plant{
    private final PlantColor color;
    protected Flower(String name, String family, double height, PlantColor color) {
        super(name, family, height);


        if(color==PlantColor.GREEN){
            throw new IllegalArgumentException("jebi se stari");
        }
        this.color=color;
    }

    @Override
    public PlantColor getColor() {
        return null;
    }
}
