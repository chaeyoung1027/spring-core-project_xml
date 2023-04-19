package kr.hs.study.beans;

public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("개가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("개가 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("개가 짖습니다.");
    }
}