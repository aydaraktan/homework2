package com.company;

public class Audi extends Cars implements Print{
    private String name;

    public Audi(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
