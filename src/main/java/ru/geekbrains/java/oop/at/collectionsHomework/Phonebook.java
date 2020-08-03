package ru.geekbrains.java.oop.at.collectionsHomework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> listOfNumbers = new HashMap<>();

    public void add(String name, String phone){
        if(!listOfNumbers.containsKey(name)){
            listOfNumbers.put(name, new ArrayList<>());
        }
        listOfNumbers.get(name).add(phone);
    }

    public void get(String name){
        System.out.println(name + ":" + listOfNumbers.get(name));
    }
}
