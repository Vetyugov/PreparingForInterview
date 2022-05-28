package Lesson_3;

public class Task1_PingPong{
    public static void main(String[] args) {
//        Реализовать программу, в которой два потока поочередно пишут ping и pong.

        SynchronizedClass synchronizedClass = new SynchronizedClass();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronizedClass.ping();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronizedClass.pong();
                }
            }
        }).start();
    }

}
class SynchronizedClass {

    boolean flag = false;
    public SynchronizedClass() {
    }

    synchronized void ping() {
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("ping");
        flag = false;
        notify();
    }
    synchronized void pong() {
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("pong");
        flag = true;
        notify();
    }
}
