package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.Point2D;
import by.epam.training.kimbar.model.entity.Triangle;
import by.epam.training.kimbar.model.logic.TriangleLogic;

import static org.junit.Assert.*;

import by.epam.training.kimbar.view.LoggerPrinter;
import by.epam.training.kimbar.view.Printer;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

public class TriangleLogicTest {
    TriangleLogic tr;
    Triangle trig;


    @Before
    public void init() {
        tr = new TriangleLogic();
        trig = new Triangle();
    }


    @Test
    public void getSquareOfTriangleTest() {
        double expected = 3;
        trig.setA(new Point2D(16,16));
        trig.setB(new Point2D(12,13));
        trig.setC(new Point2D(11,14));
        assertEquals(expected, Math.round(tr.getSquareOfTriangle(trig)), 0);
    }

    @Test
    public void getPerimeterOfTriangleTest() {
        double exp = 3;
        trig.setA(new Point2D(5.0,5.0));
        trig.setB(new Point2D(5.0,5.0));
        trig.setC(new Point2D(6.0,6.0));
        assertEquals(exp, Math.round(tr.getPerimeterOfTriangle(trig)), 0);
    }

    @Test
    public void isTriangleTest1() {
        boolean isTriangle = true;
        assertEquals(isTriangle, tr.isTriangle(trig));
    }



    @Test
    public void isRectangularTest1() {
        boolean isRectangular = false;
        trig.setA(new Point2D(6.0,6.0));
        trig.setB(new Point2D(8.0,8.0));
        trig.setC(new Point2D(10.0,10));
        assertEquals(isRectangular, tr.isRectangular(trig));
    }

    @Test
    public void isRectangularTest2() {
        boolean isRectangular = false;
        trig.setA(new Point2D(3.0,3.5));
        trig.setB(new Point2D(4.0,4.1));
        trig.setC(new Point2D(7.0,7.2));
        assertEquals(isRectangular, tr.isRectangular(trig));
    }

    @Test
    public void isIsoscelesTest1() {
        boolean isIsosceles = true;
        trig.setA(new Point2D(5.0,5.0));
        trig.setB(new Point2D(5.0,5.0));
        trig.setC(new Point2D(7.0,7.0));
        assertEquals(isIsosceles, tr.isIsosceles(trig));
    }

    @Test
    public void isIsoscelesTest2() {
        boolean isIsosceles = false;
        trig.setA(new Point2D(8.0,9.0));
        trig.setB(new Point2D(5.0,9.0));
        trig.setC(new Point2D(7.0,9.0));
        assertEquals(isIsosceles, tr.isIsosceles(trig));
    }

    @Test
    public void isEquilateralTest1() {
        boolean isEquilateral = true;
        trig.setA(new Point2D(7.0,7.0));
        trig.setB(new Point2D(7.0,7.0));
        trig.setC(new Point2D(7.0,7.0));
        assertEquals(isEquilateral, tr.isEquilateral(trig));
    }

    @Test
    public void isEquilateralTest2() {
        boolean isEquilateral = false;
        trig.setA(new Point2D(8.0,9.0));
        trig.setB(new Point2D(5.0,8.0));
        trig.setC(new Point2D(7.0,8.0));
        assertEquals(isEquilateral, tr.isEquilateral(trig));
    }

    @Test
    public void isAcuteAngledTest1() {
        boolean isAcuteAngled = false;
        trig.setA(new Point2D(5.0,5.0));
        trig.setB(new Point2D(4.0,4.0));
        trig.setC(new Point2D(4.0,4.0));
        assertEquals(isAcuteAngled, tr.isAcuteAngled(trig));
    }

    @Test
    public void isAcuteAngledTest2() {
        boolean isAcuteAngled = false;
        trig.setA(new Point2D(8.0,9.0));
        trig.setB(new Point2D(3.0,4.0));
        trig.setC(new Point2D(4.0,5.0));
        assertEquals(isAcuteAngled, tr.isAcuteAngled(trig));
    }

    @Test
    public void isObtuseTest1() {
        boolean isObtuse = false;
        trig.setA(new Point2D(33,3));
        trig.setB(new Point2D(-2,1));
        trig.setC(new Point2D(3,4));
        assertEquals(isObtuse, tr.isObtuse(trig));
    }

    @Test
    public void isObtuseTest2() {
        boolean isObtuse = false;
        trig.setA(new Point2D(4.0,4.0));
        trig.setB(new Point2D(4.0,4.0));
        trig.setC(new Point2D(4.0,4.0));
        assertEquals(isObtuse, tr.isObtuse(trig));
    }

    @Test
    public void hasNinetyDegreesTest1() {
        boolean hasNinetyDegrees = false;
        trig.setA(new Point2D(3.0,3.0));
        trig.setB(new Point2D(4.0,4.0));
        trig.setC(new Point2D(5.0,5.0));
        assertEquals(hasNinetyDegrees, tr.hasNinetyDegrees(trig));
    }

    @Test
    public void hasNinetyDegreesTest2() {
        boolean hasNinetyDegrees = true;
        trig.setA(new Point2D(4.0,5.0));
        trig.setB(new Point2D(4.0,4.0));
        trig.setC(new Point2D(4.0,4.0));
        assertEquals(hasNinetyDegrees, tr.hasNinetyDegrees(trig));
    }


}
