package me.study.ch1.behavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack! quack!");
    }
}
