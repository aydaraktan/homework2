package com.company;

public class BMW extends Cars implements Print{
    private String name;

    public BMW(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);

    }
}
