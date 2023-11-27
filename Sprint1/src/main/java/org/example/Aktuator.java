package org.example;

public abstract class Aktuator extends Unit {
    protected double value;

    public Aktuator(String name) {
        super(name);
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

