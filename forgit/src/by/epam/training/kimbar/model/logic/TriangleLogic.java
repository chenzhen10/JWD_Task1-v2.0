package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.Triangle;

public class TriangleLogic implements ITriangleLogic {


    public double getSideA(Triangle tr){
        return Math.sqrt(Math.pow(tr.getB().getX() - tr.getA().getX(), 2) + Math.pow(tr.getB().getY() - tr.getA().getY(), 2));
    }
    public double getSideB(Triangle tr){
        return Math.sqrt(Math.pow(tr.getC().getX() - tr.getB().getX(), 2) + Math.pow(tr.getC().getY() - tr.getB().getY(), 2));
    }
    public double getSideC(Triangle tr){
        return Math.sqrt(Math.pow(tr.getA().getX() - tr.getC().getX(), 2) + Math.pow(tr.getA().getY() - tr.getC().getY(), 2));
    }

    public double getSquareOfTriangle(Triangle tr) {
        double a = getSideA(tr);
        double b = getSideB(tr);
        double c = getSideC(tr);
        double hPerim = getPerimeterOfTriangle(tr) / 2;
        return Math.sqrt(hPerim *
                (hPerim - a) *
                (hPerim - b) *
                (hPerim - c));
    }//finding square by Geron's method

    public double getPerimeterOfTriangle(Triangle tr) {
        return getSideA(tr) +
                getSideB(tr) +
                 getSideC(tr);
    }

    public boolean isTriangle(Object o) {
        return o instanceof Triangle;
    }

    public boolean isRectangular(Triangle tr) {
        return hasNinetyDegrees(tr);
    }

    public boolean isIsosceles(Triangle tr) {
        double a = getSideA(tr);
        double b = getSideB(tr);
        double c = getSideC(tr);
        return a == b && a != c ||
                a == c && a != b ||
                b == c && b != a;
    }

    public boolean isEquilateral(Triangle tr) {
        double a = getSideA(tr);
        double b = getSideB(tr);
        double c = getSideC(tr);
        return a == b && a == c;
    }

    public boolean isAcuteAngled(Triangle tr) {
        double a = getSideA(tr);
        double b = getSideB(tr);
        double c = getSideC(tr);
        return (a + b > c) &&
                (a + c > b) &&
                (b + c > a);
    }

    public boolean isObtuse(Triangle tr) {
        double a = getSideA(tr);
        double b = getSideB(tr);
        double c = getSideC(tr);
        return (a + b < c) ||
                (a + c < b) ||
                (b + c < a);
    }


    public boolean hasNinetyDegrees(Triangle tr) {
        double a = getSideA(tr);
        double b = getSideB(tr);
        double c = getSideC(tr);
        return a * a + b * b == c * c;
    }
}
