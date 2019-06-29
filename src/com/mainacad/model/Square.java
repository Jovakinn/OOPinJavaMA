package com.mainacad.model;

public class Square extends AbstractShape{

    private double side;
    private double penis;

    public double getPenis() {
        return penis;
    }

    public void setPenis(double penis) {
        this.penis = penis;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
}
