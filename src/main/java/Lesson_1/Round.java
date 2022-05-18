package Lesson_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Round extends Figure{
    /**
     * Радиус круга
     */
    private Double r;

    @Override
    Double getArea() {
        return Math.PI*r*r;
    }

    @Override
    Double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public void paint() {
        System.out.println("Рисую круг");
    }
}
