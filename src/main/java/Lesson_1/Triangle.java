package Lesson_1;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Треугольник можно однозначно задать, например по 2м сторонам и углу между ними.
 */
@AllArgsConstructor
public class Triangle extends Figure{
    private Double a;
    private Double b;
    private Double angle;

    @Override
    Double getArea() {
        //Тут сложная формула
        return null;
    }

    @Override
    Double getPerimeter() {
        //Тут сложная формула
        return null;
    }

    @Override
    public void paint() {
        System.out.println("Рисую треугольник");
    }
}
