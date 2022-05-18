package Lesson_1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Rectangle extends Figure{

    private final Double width;
    private final Double height;

    @Override
    Double getArea() {
        return width * height;
    }

    @Override
    Double getPerimeter() {
        return 2*(width + height);
    }

    @Override
    public void paint() {
        System.out.println("Рисую прямоугольник");
    }
}
