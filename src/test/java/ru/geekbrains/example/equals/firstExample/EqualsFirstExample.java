package ru.geekbrains.example.equals.firstExample;

import org.junit.jupiter.api.Assertions;

public class EqualsFirstExample {
    public static void main(String[] args) {
        Sponge bob = new Sponge("Bob");
        Sponge patrick = bob;

        Assertions.assertTrue(bob.equals(patrick));

        Sponge bobJr = new Sponge("Bob Jr");
        Sponge patrickJr = new Sponge("Bob Jr");

        Assertions.assertTrue(bob.equals(patrick));
        Assertions.assertTrue(bobJr.equals(patrickJr));
    }

}
