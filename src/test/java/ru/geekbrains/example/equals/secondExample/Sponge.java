package ru.geekbrains.example.equals.secondExample;

import java.util.Objects;

public class Sponge {
    public String name;
    public int age;
    public String color;

    public Sponge(String name) {
        this.name = name;
    }

    public Sponge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o){
//        if (this == o) return true;
//        if (o == null) return false;
//        if (getClass() != o.getClass()) return false;
//        Sponge sponge = (Sponge) o;
//        return this.age == sponge.age;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponge sponge = (Sponge) o;
        return age == sponge.age &&
                Objects.equals(name, sponge.name) &&
                Objects.equals(color, sponge.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}


