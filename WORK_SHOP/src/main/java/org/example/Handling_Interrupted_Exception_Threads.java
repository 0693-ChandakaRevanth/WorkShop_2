package org.example;

public class Handling_Interrupted_Exception_Threads {
        public static void main(String[] args) {
            Thread thread = new Thread(new Task());
            thread.start();
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e) {
                System.out.println("Main thread interrupted");
                Thread.currentThread().interrupt();
            }
           thread.interrupt();
        }
    }
    class Task implements Runnable {
        @Override
        public void run() {
            synchronized (this) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Task running: " + i +" "+Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }
                    System.out.println("Task waiting...");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Task interrupted");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }