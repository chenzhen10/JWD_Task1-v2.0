package by.epam.training.kimbar.model.entity;

import by.epam.training.kimbar.model.entity.Point2D;
import by.epam.training.kimbar.model.entity.Triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle;

    @Before
    public void init() {
        triangle = new Triangle();
    }

    @Test
    public void creationTriangleTest1() {
        double expected = 1.0;
        triangle = new Triangle(new Point2D(1.0,2.0), new Point2D(3.0,4.3), new Point2D(5.5,6.1));
        assertEquals(expected, triangle.getA().getX(), 0);
    }

    @Test
    public void creationTriangleTest2() {
        double expected = 4.3;
        triangle = new Triangle(new Point2D(1.0,2.0), new Point2D(3.0,4.3), new Point2D(5.5,6.1));
        assertEquals(expected, triangle.getB().getY(), 0);
    }

    @Test
    public void creationTriangleTest3() {
        double expected = 5.5;
        triangle = new Triangle(new Point2D(1.0,2.0), new Point2D(3.0,4.3), new Point2D(5.5,6.1));
        assertEquals(expected, triangle.getC().getX(), 0);
    }

    @Test
    public void testSetA1() {
        double exp = 3.0;
        triangle.setA(new Point2D(3.0,4.4));
        assertEquals(exp, triangle.getA().getX(), 0);
    }



    @Test
    public void testSetB1() {
        double exp = 5.0;
        triangle.setA(new Point2D(5.0,3.3));
        assertEquals(exp, triangle.getA().getX(), 0);
    }



    @Test
    public void testSetC1() {
        double exp = 6.0;
        triangle.setA(new Point2D(3.7,6.0));
        assertEquals(exp, triangle.getA().getY(), 0);
    }

   

    @Test
    public void equalsTest1() {
        boolean checker1 = true;
        Triangle triangle1 = new Triangle();
        triangle.setA(new Point2D(1.0,2.0));
        triangle1.setA(new Point2D(1.0,2.0));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1, checker2);
    }

    @Test
    public void equalsTest2() {
        boolean checker1 = false;
        Triangle triangle1 = new Triangle();
        triangle.setA(new Point2D(2.0,2.1));
        triangle1.setA(new Point2D(1.0,1.2));
        boolean checker2 = triangle.equals(triangle1);
        assertEquals(checker1, checker2);
    }


}
