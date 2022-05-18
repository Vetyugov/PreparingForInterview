package Lesson_1;

public class Task2 {

    /**
     * Решение
     * 1. Над классом Car можно повесить аннотации Getter и Setter,
     * что позволит избавиться от лишних строк кода и сделает класс более читаемым
     *
     * 2. У класса Lorry ошибка. Класс не может наследоваться от интерфейса
     * Должно быть: class Lorry extends Car implements Moveable, Stopable
     *
     * 3. Класс Car - абстрактный, поэтому все его наследники обязаны переопределить все абстрактные методы этого класса.
     * Т.е. в классе Lorry должна быть реализация метода open();
     *
     */


    /**
     * Плохо написанный код
     *
     *
     * interface Moveable {
     * void move();
     * }
     * interface Stopable {
     * void stop();
     * }
     * abstract class Car {
     * public Engine engine;
     * private String color;
     * private String name;
     * protected void start() {
     * System.out.println("Car starting");
     * }
     * abstract void open();
     * public Engine getEngine() {
     * return engine;
     * }
     * public void setEngine(Engine engine) {
     * this.engine = engine;
     * }
     * public String getColor() {
     * return color;
     * }
     * public void setColor(String color) {
     * this.color = color;
     * }
     * public String getName() {
     * return name;
     * }
     * public void setName(String name) {
     * this.name = name;
     * © geekbrains.ru 27
     * }
     * }
     * class LightWeightCar extends Car implements Moveable {
     * @Override
     * void open() {
     * System.out.println("Car is open");
     * }
     * @Override
     * public void move() {
     * System.out.println("Car is moving");
     * }
     * }
     * class Lorry extends Car, Moveable, Stopable {
     * public void move(){
     * System.out.println("Car is moving");
     * }
     * public void stop(){
     * System.out.println("Car is stop");
     * }
     * }
     */



}
