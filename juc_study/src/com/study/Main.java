package com.study;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("child thread is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child thread is in awake");
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName());
                    e.printStackTrace();
                }
            }
        });

        thread.setName("test");
        thread.start();

        Thread.sleep(2000);

        thread.interrupt();
    }
}
