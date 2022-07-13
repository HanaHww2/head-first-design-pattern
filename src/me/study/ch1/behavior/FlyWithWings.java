package me.study.ch1.behavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("flying! 파닥파닥~");
    }
}
