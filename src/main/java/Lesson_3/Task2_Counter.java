package Lesson_3;

import java.util.concurrent.locks.ReentrantLock;

//Реализовать потокобезопасный счетчик с помощью интерфейса Lock.
public class Task2_Counter {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        counter.increase();
                    }
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.counter);
    }


}

class Counter {
    int counter;
    ReentrantLock locker;

    public Counter() {
        counter = 0;
        locker = new ReentrantLock();
    }

    //Неатомарная реализация введена специально для проверки
    void increase() {
        locker.lock();
        int i = counter;
        System.out.println("counter = " + counter);
        counter = i+1;
        locker.unlock();
    }
}

