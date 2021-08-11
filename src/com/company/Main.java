package com.company;

public class Main {

    public static Cars createObject(String cars) {

        switch (cars) {
            case "Audi":
                Audi audi = new Audi("a6");
                return audi;
            case "Mers":
                Mers mers = new Mers("s63");
                return mers;
            case "BMW":
                BMW bmw = new BMW("e 4477");
                return bmw;
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        Print[] prints = {
                createObject("Audi"),
                createObject("Mers"),
                createObject("BMW")
        };


        for (int i = 0; i < prints.length; i++) {
            prints[i].print();
        }
    }
}
