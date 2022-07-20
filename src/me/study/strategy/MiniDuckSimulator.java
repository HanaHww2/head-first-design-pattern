package me.study.strategy;

import me.study.strategy.behavior.FlyRocketPowered;
import me.study.strategy.duck.Duck;
import me.study.strategy.duck.MallardDuck;
import me.study.strategy.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered()); // 동적으로 행동을 지정하는 위임 클래스 변경
        modelDuck.performFly();
    }
}
