package MultiThreading;

import java.util.*;

class Counter{
    int count;

    public synchronized void incriment(){
        count++;
    }
}

class Rase {
    public static void main(String[] args) {
        Counter cn = new Counter();

        Runnable obj1 = () -> {
            for(int i=0;i<1000;i++){
                cn.incriment();
            }
        };
        
        Runnable obj2 = () -> {
            for(int i=0;i<1000;i++){
                cn.incriment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e){}

        System.out.println("Final Count: " + cn.count);
    }
}
