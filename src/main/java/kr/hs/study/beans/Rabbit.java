package kr.hs.study.beans;

public class Rabbit implements Animal {

    @Override
    public void move() {
        System.out.println("토끼가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("토끼가 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("토끼가 울지 않습니다.");
    }
}