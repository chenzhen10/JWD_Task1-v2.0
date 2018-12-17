package by.epam.training.kimbar.util;

import by.epam.training.kimbar.model.entity.Point2D;
import by.epam.training.kimbar.model.entity.Triangle;

import java.util.ArrayList;
import java.util.Random;

public class TriangleGenerator {
    private static final int DEFAULT_AMOUNT_OF_TRIANGLES = 5;


    public Triangle[] generateTriangleByRandomPoints() {
        Random rnd = new Random();
        Triangle[] triangle = new Triangle[DEFAULT_AMOUNT_OF_TRIANGLES];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new Triangle(new Point2D(rnd.nextDouble() + 1,rnd.nextDouble() + 1),
                    new Point2D(rnd.nextDouble() + 1,rnd.nextDouble() + 1),
                    new Point2D(rnd.nextDouble() + 1,rnd.nextDouble() + 1));
        }
        return triangle;
    }

    public Triangle[] generateTriangleFromFile(ArrayList<ArrayList> str) {
        Triangle[] triangle = new Triangle[str.size()];
        int i = 0;
        for (ArrayList a : str) {
            triangle[i] = new Triangle(new Point2D((Double) a.get(0),(Double) a.get(1)),
                    new Point2D((Double) a.get(2),(Double) a.get(3)),
                    new Point2D((Double) a.get(4),(Double) a.get(5)));
            i++;
        }
        return triangle;
    }
}
