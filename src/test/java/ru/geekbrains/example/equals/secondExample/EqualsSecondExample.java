package ru.geekbrains.example.equals.secondExample;

import org.junit.jupiter.api.Assertions;

import javax.sound.midi.Soundbank;

public class EqualsSecondExample {
    public static void main(String[] args) {
        Sponge bob = new Sponge(12);
        Sponge patrick = new Sponge(12);
        Sponge squidward = bob;

        Assertions.assertTrue(bob.equals(patrick));
        Assertions.assertTrue(bob.equals(squidward));

        System.out.println(bob.hashCode());
        System.out.println(patrick.hashCode());
        System.out.println(squidward.hashCode());
        Assertions.assertEquals(bob.hashCode(), patrick.hashCode());
    }

}
