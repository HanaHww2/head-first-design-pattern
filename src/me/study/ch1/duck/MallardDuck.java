package me.study.ch1.duck;

import me.study.ch1.behavior.FlyWithWings;
import me.study.ch1.behavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }
    @Override public void display() {
        System.out.println("물오리입니다.");
    }
}