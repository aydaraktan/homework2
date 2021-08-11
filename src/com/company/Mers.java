package com.company;

public class Mers extends Cars implements Print{
    private String name;

    public Mers(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);

    }
}
