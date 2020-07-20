package ru.geekbrains.example.hamcrest.objects.test;

public class Sponge extends BikiniBottom{
    private String name;


    public Sponge(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name;
    }

    public String getName() {
        return name;
    }
}
