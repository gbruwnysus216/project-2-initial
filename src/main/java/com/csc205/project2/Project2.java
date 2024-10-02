package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape s = new Sphere(2.0);
        ThreeDimensionalShape r = new Rhombohedron(5.0,60);
        ThreeDimensionalShape p = new Prism(4.0,4.0,4.0, 1.0);
        ThreeDimensionalShape c = new Cube(2.0);
        ThreeDimensionalShape cy = new Cylinder(2.0, 4.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(s);
        shapes.add(r);
        shapes.add(p);
        shapes.add(c);
        shapes.add(cy);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        Sphere s2 = new Sphere(2.0);
        Rhombohedron r2 = new Rhombohedron(2.0,80);
        Prism p2 = new Prism(4.0,4.0,4.0, 2.5);

//        System.out.println(s2);
//        System.out.println(r2);
//        System.out.println(p2);

    }

}

