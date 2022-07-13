package me.study.ch1.behavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying Powered by Rocket");
    }
}
