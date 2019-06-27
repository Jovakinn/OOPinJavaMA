package com.mainacad;

import com.mainacad.model.*;

public class ApplicationRunner {

    public static void main(String[] args) {

      Circle circle = new Circle(15);

      Square square = new Square(15);

       Triangle triangle = new Triangle(10,12);

      Shape maxShape;

      if (circle.getArea() > square.getArea()){
          maxShape = circle;
      }
      else if (circle.getArea() < square.getArea()){
          maxShape = square;
      }
      else {
          maxShape = square;
      }
      if (maxShape.getArea() < triangle.getArea()){
          maxShape = triangle;
      }
        System.out.println("Max shape has area " + maxShape.getArea());

    }
}
