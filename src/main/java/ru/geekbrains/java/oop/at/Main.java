package ru.geekbrains.java.oop.at;

public class Main {
    public static void main(String[] args) {
        Participants human = new Participants("Человек", 50, 1.0);
        Participants cat = new Participants("Кот", 100, 2.0);
        Participants robot = new Participants("Робот", 20, 0.5);

        Obstacles treadmill = new Obstacles(35);
        Obstacles wall = new Obstacles(1.5);
        Obstacles lowWall = new Obstacles(0.3);
        /*Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();*/

        /*-----Задание 1-----*/
        /*human.jump1();
        human.run1();
        System.out.println();

        cat.jump1();
        cat.run1();
        System.out.println();

        robot.jump1();
        robot.run1();
        System.out.println();*/

        /*-----Задание 2-----*/
        /*human.jump2(wall);
        human.run2(treadmill);
        System.out.println();

        cat.jump2(wall);
        cat.run2(treadmill);
        System.out.println();

        robot.jump2(wall);
        robot.run2(treadmill);
        System.out.println();*/

        /*-----Задание 3-----*/
        Participants[] participants = {human, cat, robot};
        Obstacles[] obstacles = {treadmill, wall, lowWall};

        for (int i = 0; i < participants.length; i++) {
            participants[i].jump2(obstacles[1]);
            participants[i].run2(obstacles[0]);
            participants[i].jump2(obstacles[2]);
            System.out.println();
        }

    }


}
