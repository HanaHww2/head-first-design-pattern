package me.study.ch1.duck;

import me.study.ch1.behavior.FlyNoWay;
import me.study.ch1.behavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super();
        super.quackBehavior = new MuteQuack();
        super.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("사냥 유인용 모형 오리");
    }

}
