package ru.geekbrains.example.hashset;

import org.junit.jupiter.api.Test;


import java.util.*;

public class HashSetExamples {

    @Test
    public void add() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);
        spongeSet.add(bob);

        System.out.println(spongeSet);
    }

    @Test
    public void addAll() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);
        spongeSet.add(bob);
        System.out.println(spongeSet);

        HashSet<Sponge> spongeFriendsSet = new HashSet<>();
        spongeFriendsSet.add(new Sponge("Mr.Krabs", 65));
        spongeFriendsSet.add(new Sponge("Sandy", 65));
        System.out.println(spongeFriendsSet);

        spongeSet.addAll(spongeFriendsSet);

        System.out.println(spongeSet);
    }

    @Test
    public void size() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);
        spongeSet.add(bob);

        System.out.println(spongeSet.size());
    }

    @Test
    public void clear() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);
        System.out.println(spongeSet);

        spongeSet.clear();

        System.out.println(spongeSet);
    }

    @Test
    public void contains() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);

        System.out.println(spongeSet.contains(bob));
    }

    @Test
    public void remove() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);

        spongeSet.remove(bob);

        System.out.println(spongeSet);
    }

    @Test
    public void removeAll() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);
        System.out.println(spongeSet);

        HashSet<Sponge> spongeFriendsSet = new HashSet<>();
        spongeFriendsSet.add(new Sponge("Mr.Krabs", 65));
        spongeFriendsSet.add(new Sponge("Sandy", 65));
        spongeFriendsSet.add(bob);
        spongeFriendsSet.add(patrick);
        System.out.println(spongeFriendsSet);

        spongeSet.removeAll(spongeFriendsSet);

        System.out.println(spongeSet);
    }

    @Test
    public void isEmpty() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);

        System.out.println(spongeSet.isEmpty());
    }

    @Test
    public void toArray() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();
        spongeSet.add(bob);
        spongeSet.add(squidward);
        spongeSet.add(patrick);

        System.out.println(Arrays.toString(spongeSet.toArray()));
    }

    @Test
    public void iterator(){
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);
        Sponge squidward = new Sponge("Squidward", 30);

        HashSet<Sponge> spongeSet = new HashSet<>();

        spongeSet.add(bob);
        spongeSet.add(patrick);
        spongeSet.add(squidward);

        System.out.println(spongeSet);

        Iterator<Sponge> iterator = spongeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator.hasNext();
        iterator.remove();
        System.out.println(spongeSet);
    }
}

