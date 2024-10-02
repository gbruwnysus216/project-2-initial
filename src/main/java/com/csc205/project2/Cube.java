package com.csc205.project2;

public class Cube extends Shape{

    /*Fields*/
    private double width;

    /*Default Constructor*/
    public Cube(){
        super();
        this.width =0.0;
    }

    /*Parameterized Constructor*/

    public Cube(double width){super();this.width = width;}

    /*Accessor methods*/

    public double getWidth(){return this.width;}

    /*Mutator methods*/
    public void setWidth(double width){this.width = width;}

    /*Calculation Methods*/

    @Override
    public double surfaceArea(){return 6*Math.pow(this.width,2);}

    @Override
    public double volume(){return Math.pow(this.width,3);}

    public String toString(){
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append(String.format("width=%.1f",this.width));
        sb.append(String.format(", surface area=%.1f", surfaceArea()));
        sb.append(String.format(", volume=%.1f", volume()));
        sb.append('}');
        return sb.toString();
    }

}
