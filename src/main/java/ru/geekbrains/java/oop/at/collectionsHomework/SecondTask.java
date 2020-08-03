package ru.geekbrains.java.oop.at.collectionsHomework;

public class SecondTask {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Скарсгард", "13071951");
        phonebook.add("Скарсгард", "25081976");
        phonebook.add("Скарсгард", "12111980");
        phonebook.add("Скарсгард", "05071982");
        phonebook.add("Скарсгард", "09081990");
        phonebook.add("Скарсгард", "25101995");

        phonebook.add("Олсен", "13061986");
        phonebook.add("Олсен", "14061986");
        phonebook.add("Олсен", "16021989");

        phonebook.add("Питт", "18121963");


        phonebook.get("Скарсгард");
        phonebook.get("Олсен");
        phonebook.get("Питт");
    }
}
