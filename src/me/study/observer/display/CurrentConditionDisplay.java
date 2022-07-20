package me.study.observer.display;

import me.study.observer.simpleobservable.Observer;
import me.study.observer.simpleobservable.Subject;

public class CurrentConditionDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /*
    * 주제 객체를 매개변수로 갖는 생성자를 이용해서
    * 해당 디스플레이 객체 생성시에 바로 주제의 옵저버로 등록한다.
    * */
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : " + temperature + " F degree and " + humidity + " % humidity");
    }
}
