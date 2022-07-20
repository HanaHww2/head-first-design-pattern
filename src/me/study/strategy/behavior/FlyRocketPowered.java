package me.study.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying Powered by Rocket");
    }
}
