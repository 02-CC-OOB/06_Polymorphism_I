package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Worker worker = new Worker();
        Queen queen = new Queen();
        Drone drone = new Drone();

        
        output(worker.doYourJob());
        output(drone.doYourJob());
        output(queen.doYourJob());

        output("------------------");

        output(worker.fly());
        output(drone.fly());
        output(queen.fly());








    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

