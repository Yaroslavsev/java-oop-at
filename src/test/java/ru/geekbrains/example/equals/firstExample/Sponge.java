package ru.geekbrains.example.equals.firstExample;

import java.util.Objects;

public class Sponge {
    public String name;

    public Sponge(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponge sponge = (Sponge) o;
        return Objects.equals(name, sponge.name);
    }
}


