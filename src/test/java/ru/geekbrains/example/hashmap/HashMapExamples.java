package ru.geekbrains.example.hashmap;

import org.junit.jupiter.api.Test;
import ru.geekbrains.example.hashset.Sponge;

import java.util.*;

public class HashMapExamples {

    @Test
    public void put() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap);
    }

    @Test
    public void putAll() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");
        System.out.println(spongeHashMap);


        HashMap<String, String> spongeFriendsHashMap = new HashMap<>();
        spongeFriendsHashMap.put("Krabs", "Eugene");
        spongeFriendsHashMap.put("Cheeks", "Sandy");
        System.out.println(spongeFriendsHashMap);

        spongeHashMap.putAll(spongeFriendsHashMap);
        System.out.println(spongeHashMap);
    }

    @Test
    public void size() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.size());
    }

    @Test
    public void isEmpty() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.isEmpty());
    }

    @Test
    public void containsKey() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.containsKey("Star"));
    }

    @Test
    public void containsValue() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.containsValue("Patrick"));
    }

    @Test
    public void get() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.get("Star"));
    }

    @Test
    public void keySet() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.keySet());
    }

    @Test
    public void values() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.values());
    }

    @Test
    public void remove() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");
        System.out.println(spongeHashMap);

        spongeHashMap.remove("Star");

        System.out.println(spongeHashMap);
    }

    @Test
    public void clear() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");
        System.out.println(spongeHashMap);

        spongeHashMap.clear();

        System.out.println(spongeHashMap);
    }

    @Test
    public void equals() {

        HashMap<String, String> spongeHashMap = new HashMap<>();
        spongeHashMap.put("SquarePants", "SpongeBob");
        spongeHashMap.put("Star", "Patrick");
        spongeHashMap.put("Tentacles", "Squidward");

        HashMap<String, String> spongeFriendsHashMap = new HashMap<>();
        spongeFriendsHashMap.put("SquarePants", "SpongeBob");
        spongeFriendsHashMap.put("Star", "Patrick");
        spongeFriendsHashMap.put("Tentacles", "Squidward");

        System.out.println(spongeHashMap.equals(spongeFriendsHashMap));
    }
}
