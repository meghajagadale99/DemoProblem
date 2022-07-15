package com.thoughtworks;

public
class Car {
    private final boolean hasEngine;
    private final int cylinders;
    private final String name;
    private final int wheels;
    
    public Car(int cylinders, String name) {
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println(name + " -> startEngine (" + cylinders + ")");
    }

    public void accelerate() {
        System.out.println(name + "-> accelerate (" + cylinders + ")");
    }

    public void brake() {
        System.out.println(name + "-> brake (" + cylinders + ")");
    }

}
