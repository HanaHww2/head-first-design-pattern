package me.study.ch1;

public class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("사냥 유인용 모형 오리");
    }

    @Override
    void fly() {
        System.out.println("날지 못하는 모형 오리");
    }

    @Override
    void quack() {
        System.out.println("...");
    }

}
