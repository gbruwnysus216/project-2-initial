package com.csc205.project2;

public class Rhombohedron extends Shape{

    /*Fields*/
    private double edgeLength;
    private double angle;

    /*Default Constructor*/
    public Rhombohedron(){
        super();
        this.edgeLength = 0.0;
        this.angle = 0.0;

    }

    /*Parameterized Contructor*/
    public Rhombohedron(double edgeLength, double angle) {
        super();
        this.edgeLength = edgeLength;
        this.angle = Math.toRadians(angle);
    }

    /*Accessor methods*/
    public double getEdgeLength(){
        return this.edgeLength;
    }

    public double getAngle(){
        return this.angle;
    }

    /*Mutator methods*/
    public void setEdgeLength(double edgeLength){
        this.edgeLength = edgeLength;
    }

    public void setAngle(double angle){
        this.angle = Math.toRadians(angle);
    }

    /*Calculation Methods*/
    @Override
    public double surfaceArea(){return 6*Math.pow(this.edgeLength, 2)*Math.sin(this.angle);}

    @Override
    public double volume() {return Math.pow(this.getEdgeLength(), 3) * Math.sqrt(1 - Math.pow(Math.cos(this.angle), 2));}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rhombohedron {");
        sb.append(String.format("edgeLength=%.2f", this.edgeLength));
        sb.append(String.format(", angle=%.2f", Math.toDegrees(this.angle)));
        sb.append(String.format(", surface area=%.2f", surfaceArea()));
        sb.append(String.format(", volume=%.2f", volume()));
        sb.append('}');
        return sb.toString();
    }

}

