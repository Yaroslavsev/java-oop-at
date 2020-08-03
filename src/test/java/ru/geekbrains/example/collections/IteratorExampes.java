package ru.geekbrains.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExampes {
    public static void main(String[] args) {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();

        spongeList.add(bob);
        spongeList.add(patrick);
        spongeList.add(new Sponge("Squidward", 30));

        System.out.println(spongeList);

        Iterator<Sponge> iterator = spongeList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator.hasNext();
        iterator.remove();
        System.out.println(spongeList);
    }
}

