package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.Triangle;

public interface ITriangleLogic {
    double getSideA(Triangle tr);

    double getSideB(Triangle tr);

    double getSideC(Triangle tr);

    double getSquareOfTriangle(Triangle tr);

    double getPerimeterOfTriangle(Triangle tr);

    boolean isRectangular(Triangle tr);

    boolean isIsosceles(Triangle tr);

    boolean isEquilateral(Triangle tr);

    boolean isAcuteAngled(Triangle tr);

    boolean isObtuse(Triangle tr);

    boolean hasNinetyDegrees(Triangle tr);

    boolean isTriangle(Object o);

}
