package com.csc205.project2;

public class Prism extends Shape {

    /*Feilds*/
    private double side1Length = 0.0;
    private double side2Length = 0.0;
    private double side3Length = 0.0;
    private double height = 0.0;

    /*Default Constructor*/
    public Prism() {
        super();
    }

    /*parameterized Constructor*/
    public Prism(double side1Length, double side2Length, double side3Length, double height) {
        super();
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
        this.height = height;
    }

    /*Accessor methods*/

    public double getSide1Length() {return this.side1Length;}

    public double getSide2Length() {return this.side2Length;}

    public double getSide3Length() {return this.side3Length;}

    public double getHeight() {return this.height;}

    /*Mutator methods*/

    public void setSide1Length(double side1Length) {this.side1Length = side1Length;}

    public void setSide2Length(double side2Length) {this.side2Length = side2Length;}

    public void setSide3Length(double side3Length) {this.side3Length = side3Length;}

    public void setHeight(double height) {this.height = height;}

    /*Calculation Methods*/

    @Override
    public double surfaceArea() {
        return 2 * (side1Length * side2Length + side1Length * side3Length + side2Length * side3Length);
    }

    @Override
    public double volume() {
        return side1Length * side2Length * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prism {");
        sb.append(String.format("side1Length=%.2f", this.side1Length));
        sb.append(String.format(", side2Length=%.2f", this.side2Length));
        sb.append(String.format(", side3Length=%.2f",this.side3Length));
        sb.append(String.format(", height=%.2f",this.height));
        sb.append(String.format(", surface area=%.2f", surfaceArea()));
        sb.append(String.format(", volume=%.2f", surfaceArea()));
        sb.append('}');
        return sb.toString();
    }

}

