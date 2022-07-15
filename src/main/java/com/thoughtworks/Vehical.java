package com.thoughtworks;

class Vehicle {

    public static
    void main(String[] args) {
        Holden holden = new Holden(6, "Holden Commodore");
        holden.accelerate();
        holden.brake();
        holden.startEngine();
        Ford ford = new Ford(4, "Ford Falcon");
        ford.accelerate();
        ford.brake();
        ford.startEngine();
        Car car = new Car(8, "Base Car");
        car.accelerate();
        car.brake();
        car.startEngine();
    }
}

