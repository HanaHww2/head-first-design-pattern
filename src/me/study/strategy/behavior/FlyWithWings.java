package me.study.strategy.behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying! 파닥파닥~");
    }
}
