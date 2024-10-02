package com.csc205.project2;

public class Cylinder extends Shape{


    /*Fields*/
    private double radius;
    private double height;

    public Cylinder(){
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double height, double radius){
        super();
        this.radius = radius;
        this.height = height;
    }

    /*Mutator methods*/

    public double getRadius(){return this.radius;}
    public double getHeight(){return this.height;}

    /*Accessor methods*/

    public void setRadius(double radius){this.radius = radius;}

    public void setHeight(double height){this.height = height;}

    /*Calculation Methods*/

    @Override
    public double surfaceArea(){ return 2.0*Math.PI*this.radius*this.height+2.0*Math.PI*Math.pow(this.radius,2);}

    @Override
    public double volume(){return Math.PI*Math.pow(this.radius,2)*this.height;}

    public String toString(){
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append(String.format("height=%.1f",this.height));
        sb.append(String.format(", radius=%.1f", this.radius));
        sb.append(String.format(", surface area=%.14f", surfaceArea()));
        sb.append(String.format(", volume=%.15f", volume()));
        sb.append('}');
        return sb.toString();
    }
}
