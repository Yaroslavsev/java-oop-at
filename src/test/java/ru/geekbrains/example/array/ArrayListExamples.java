package ru.geekbrains.example.array;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class ArrayListExamples {

    @Test
    public void add() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);
    }

    @Test
    public void ensureCapacity() {
        int a = 1;
        int b = 2;
        int c = 3;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);

        list.ensureCapacity(5);

        System.out.println(list);
    }

    @Test
    public void trimToSize() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        ArrayList<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        spongeList.trimToSize();
        System.out.println(spongeList.size());
    }

    @Test
    public void indexOf() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        System.out.println(spongeList.indexOf(patrick));
    }

    @Test
    public void contains() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        System.out.println(spongeList.contains(patrick));
    }

    @Test
    public void remove() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        spongeList.remove(patrick);

        System.out.println(spongeList);
    }

    @Test
    public void set() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        spongeList.set(0, patrick);
        spongeList.set(2, patrick);

        System.out.println(spongeList);
    }

    @Test
    public void clear() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        spongeList.clear();

        System.out.println(spongeList);
    }

    @Test
    public void toArray() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        System.out.println(spongeList);

        System.out.println(Arrays.toString(spongeList.toArray()));
    }

    @Test
    public void frequency() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);
        spongeList.add(bob);

        System.out.println(spongeList);

        System.out.println(Collections.frequency(spongeList, bob));
    }

    @Test
    public void sort() {
        int a = 98;
        int b = 212;
        int c = 3;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }

    @Test
    public void listIterator() {
        Sponge bob = new Sponge("Bob", 12);
        Sponge patrick = new Sponge("Patrick", 12);

        List<Sponge> spongeList = new ArrayList<>();
        spongeList.add(bob);
        spongeList.add(new Sponge("Squidward", 30));
        spongeList.add(1, patrick);

        ListIterator<Sponge> spongeListIterator = spongeList.listIterator();

        System.out.println("Сортировка вниз");
        while (spongeListIterator.hasNext()){
            System.out.println(spongeListIterator.next());
        }

        System.out.println();

        System.out.println("Сортировка вверх");
        while (spongeListIterator.hasPrevious()){
            System.out.println(spongeListIterator.previous());
        }
    }
}



