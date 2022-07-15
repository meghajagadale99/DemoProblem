package com.thoughtworks;

public
class Holden extends Ford {

    private final int cylinders;
    private final String name;

    public
    Holden(int cylinders, String name) {
        super(cylinders, name);
        this.cylinders=cylinders;
        this.name=name;
    }

    public
    void startEngine() {
        System.out.println(name + "-> startEngine (" + cylinders + ")");
    }

    public
    void accelerate() {
        System.out.println(name + "-> accelerate (" + cylinders + ")");
    }

    public
    void brake() {
        System.out.println(name + "-> brake (" + cylinders + ")");
    }

}
