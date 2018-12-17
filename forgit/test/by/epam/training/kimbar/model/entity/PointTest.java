package by.epam.training.kimbar.model.entity;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
    Point2D p;

    @Before
    public void init(){
        p = new Point2D();
    }

    @Test
    public void creationTest1(){
        double expected = 5.3;
        p = new Point2D(5.3,6.7);
        assertEquals(expected,p.getX(),0);
    }
    @Test
    public void creationTest2(){
        double expected = 6.1;
        p = new Point2D(6.1,10.0);
        assertEquals(expected,p.getY(),0);
    }

    @Test
    public void getPointTest1(){
        double expected = 5.8;
        p.setX(5.8);
        assertEquals(expected,p.getX(),0);
    }
    @Test
    public void getPointTest2(){
        double expected = 6.3;
        p.setY(6.3);
        assertEquals(expected,p.getY(),0);
    }

}
