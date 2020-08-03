package ru.geekbrains.example.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsExamples {
    public static void main(String[] args) {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(patrick);
        spongeList.add(new Sponge("Squidward", 30));

        List<Sponge> spongeFriendsList = new ArrayList<>();
        spongeFriendsList.add(new Sponge("Gary", 2));
        spongeFriendsList.add(new Sponge("Mr.Krabs", 60));
        spongeFriendsList.add(new Sponge("Sandy", 15));
        spongeFriendsList.add(new Sponge("Mrs.Puff", 45));

        List<Sponge> spongeEnemiesList = new ArrayList<>();
        spongeEnemiesList.add(new Sponge("Plankton", 3));
        spongeEnemiesList.add(new Sponge("Mrs.Puff", 45));
        spongeEnemiesList.add(new Sponge("TheFlyingDutchman", 200));

        System.out.println(spongeList);
        System.out.println(spongeList.get(1));
        System.out.println();

        System.out.println("Размер коллеции: " + spongeList.size());
        System.out.println("Пустая коллекция: " + spongeList.isEmpty() + '\n');

        System.out.println("Коллекция содрежит: " + spongeList.contains(bob));
        System.out.println("Коллекция содрежит коллекцию: " + spongeList.containsAll(spongeFriendsList) + '\n');

        spongeList.addAll(spongeFriendsList);
        spongeList.addAll(spongeEnemiesList);
        System.out.println(spongeList);
        System.out.println();

        spongeList.remove(7);
        System.out.println(spongeList);
        spongeList.removeAll(spongeEnemiesList);
        System.out.println(spongeList);
        spongeFriendsList.retainAll(spongeEnemiesList);
        System.out.println(spongeFriendsList);
        System.out.println();

        System.out.println("Элементы коллекций эквивалентны: " + spongeFriendsList.equals(spongeEnemiesList) + '\n');

        System.out.println(Arrays.toString(spongeList.toArray()));
    }
}


