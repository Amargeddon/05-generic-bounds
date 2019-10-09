package de.thro.inf.prg3.a05.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Plant implements Comparable<Plant> {
    private double height;
    private  String family;
    private  String name;

    protected Plant(String name,String family,double height)  {
        if(family==null || family.length() == 0)throw new IllegalArgumentException("Specify family");
        if(name==null || name.length()==0)throw new IllegalArgumentException("Specify name");
        if(height<=0.0)throw new IllegalArgumentException("Height");
        this.name=name;
        this.family=family;
        this.height=height;
    }



    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }
    public abstract PlantColor getColor();

    @Override
    public int hashCode(){
        return new HashCodeBuilder(17,31)
                .append(getFamily())
                .append(getName())
                .append(getHeight())
                .append(getColor())
                .toHashCode();


    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Plant)) return false;
        Plant plant=(Plant) o;
        return new EqualsBuilder()
                .append(getHeight(),plant.getHeight())
                .append(getFamily(),plant.getFamily())
                .append(getName(),plant.getName())
                .append(getColor(),plant.getColor())
                .isEquals();
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this)
                .append("family",family)
                .append("name",name)
                .append("height",height)
                .append("color",getColor())
                .toString();
    }
    @Override
    public int compareTo(Plant other){
        return Double.compare(this.height,other.height);
    }

}
