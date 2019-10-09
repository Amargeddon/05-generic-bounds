package de.thro.inf.prg3.a05.model;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.collections.SimpleListImpl;

public class PlantBed  <T extends Plant> {
    private final SimpleList<T>plant;

    public PlantBed(){
        plant=new SimpleListImpl<>();
    }

    public void add(T plant){
        this.plant.add(plant);
    }

    public int size(){
        return plant.size();
    }

    public SimpleList<T> getPlantbyColor(PlantColor color){
        return plant.filter(p->p.getColor().equals(color));
    }

    public SimpleList<T>getPlant(){
        return plant.map(p->p);
    }
}
