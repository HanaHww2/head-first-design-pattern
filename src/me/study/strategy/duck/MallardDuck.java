package me.study.strategy.duck;

import me.study.strategy.behavior.FlyWithWings;
import me.study.strategy.behavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }
    @Override public void display() {
        System.out.println("물오리입니다.");
    }
}