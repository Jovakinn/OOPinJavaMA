package com.mainacad;

import com.mainacad.model.*;
import java.util.*;

public class ApplicationRunner {

    public static void main(String[] args) {

      Circle circle = new Circle(15);

      Square square = new Square(15);

      Triangle triangle = new Triangle(10,12);


      ArrayList<Double> list = new ArrayList<>();

      list.add(circle.getArea());
      list.add(square.getArea());
      list.add(triangle.getArea());
      double maxShape = Collections.max(list);

      if (maxShape >= 100){
        System.out.println("Max area is bigger than 100 or equal it " +
                maxShape);
      } else {
        System.out.println("Max area is less than 100 ;( ");
      }

      System.out.println("Figure with the biggest area has area: " + maxShape);
    }
}
