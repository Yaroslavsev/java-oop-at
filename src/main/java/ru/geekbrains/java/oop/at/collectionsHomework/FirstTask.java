package ru.geekbrains.java.oop.at.collectionsHomework;

import java.util.*;

public class FirstTask {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Один");

        stringList.add("Два");
        stringList.add("Два");

        stringList.add("Три");
        stringList.add("Три");
        stringList.add("Три");

        stringList.add("Четыре");
        stringList.add("Четыре");
        stringList.add("Четыре");
        stringList.add("Четыре");

        stringList.add("Пять");
        stringList.add("Пять");
        stringList.add("Пять");
        stringList.add("Пять");
        stringList.add("Пять");
        System.out.println(stringList);
        System.out.println();

        Set<String> uniqueSet = new HashSet<>();
        uniqueSet.addAll(stringList);
        System.out.println(uniqueSet);
        System.out.println();

        System.out.println("Количество единиц: " + Collections.frequency(stringList, "Один"));
        System.out.println("Количество двоек: " + Collections.frequency(stringList, "Два"));
        System.out.println("Количество троек: " + Collections.frequency(stringList, "Три"));
        System.out.println("Количество четверок: " + Collections.frequency(stringList, "Четыре"));
        System.out.println("Количество пятерок: " + Collections.frequency(stringList, "Пять"));
    }

}

