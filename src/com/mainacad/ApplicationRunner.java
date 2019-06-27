package com.mainacad;

import com.mainacad.model.AbstractShape;
import com.mainacad.model.Circle;
import com.mainacad.model.Square;
import com.mainacad.model.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {

      Circle circle1 = new Circle();

      circle1.setRadius(10);


      System.out.println("Circle with radius: " + circle1.getRadius() + " has area "
              + circle1.getArea());

      Square square = new Square();
      square.setSide(15);

      System.out.println("Square with side " + square.getSide() + " has area "
              + square.getArea());

      Object triangle = new Triangle(12,15);
      AbstractShape triangleNew = new Triangle();

    }
}
