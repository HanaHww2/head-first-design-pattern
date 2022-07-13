package me.study.ch1;

import me.study.ch1.behavior.FlyRocketPowered;
import me.study.ch1.duck.DecoyDuck;
import me.study.ch1.duck.Duck;
import me.study.ch1.duck.MallardDuck;
import me.study.ch1.duck.ModelDuck;

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
