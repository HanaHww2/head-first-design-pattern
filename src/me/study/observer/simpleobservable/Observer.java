package me.study.observer.simpleobservable;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
