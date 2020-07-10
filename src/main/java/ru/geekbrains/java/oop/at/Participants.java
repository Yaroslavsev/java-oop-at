package ru.geekbrains.java.oop.at;

public class Participants {
    String name;
    int maxRunDist;
    double maxJumpDist;

    public Participants() {
    }

    public Participants (String name, int maxRunDist, double maxJumpDist){
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
    }

    void run1(){
        System.out.println(name + " пробежал");
    }

    void jump1(){
        System.out.println(name + " прыгнул");
    }

    void run2(Obstacles length) {
        if (maxRunDist >= Obstacles.length) {
            System.out.println(name + " пробежал по беговой дорожке");
        } else {
            System.out.println(name + " не смог пробежать");
        }
    }

    void jump2(Obstacles height) {
        if (maxJumpDist >= Obstacles.height) {
            System.out.println(name + " перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть");
        }
    }

}
