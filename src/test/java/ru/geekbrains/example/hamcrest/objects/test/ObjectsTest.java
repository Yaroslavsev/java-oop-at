package ru.geekbrains.example.hamcrest.objects.test;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.BatchedObjectColumnProcessor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ObjectsTest {
    @Test
    void sameInstanceTest() {
        String name = "Bob";
        Sponge sponge1 = new Sponge(name);
        Sponge sponge2 = sponge1;
        assertThat(sponge1, sameInstance(sponge2));
    }

    @Test
    void hasToStringTest() {
        String name = "Bob";
        Sponge sponge = new Sponge(name);
        assertThat(sponge, hasToString("My name is Bob"));
    }

    @Test
    void instanceOfTest() {
        String name = "Bob";
        Sponge sponge = new Sponge(name);
        assertThat(sponge, instanceOf(BikiniBottom.class));
    }

    @Test
    void typeCompatibleWithTest() {
        assertThat(Sponge.class, typeCompatibleWith(BikiniBottom.class));
    }

    @Test
    void hasPropertyTest() {
        Sponge sponge = new Sponge("Bob");
        assertThat(sponge, hasProperty("name"));
    }

    @Test
    void samePropertyValuesAsTest() {
        Sponge sponge1 = new Sponge("Bob");
        Sponge sponge2 = new Sponge("Bob");
        Sponge sponge3 = new Sponge("Robert");
        assertThat(sponge1, samePropertyValuesAs(sponge2));
    }
}
