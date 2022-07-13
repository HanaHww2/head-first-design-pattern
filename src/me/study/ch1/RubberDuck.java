package me.study.ch1;

public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("노오란 러버덕");
    }
    @Override
    void quack() {
        System.out.println("Bip!Bip!");
    }
    @Override
    void fly() {
        System.out.println("날지 못하는 러버덕");
    }
}
