package me.study.observer.observable;

import me.study.observer.simpleobservable.Observer;

import java.util.ArrayList;
import java.util.Observable;

/*
 * 참고) 자바 유틸에서 제공하던 옵저버, 옵저버블 객체는 이제 더이상 사용되지 않는다.(자바 9이상)
 * 리액티브스트림 팀에서 제안하는 Publisher, Subscriber 로 대체
 * */
@SuppressWarnings("deprecation")
public class WeatherData extends Observable {
    private static float temperature;
    private static float humidity;
    private static float pressure;

    public WeatherData() {
    }

    /*
     * 기상 관측값이 갱신될 때마다 호출되는 메소드
     * */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        // Observable 에서 정의된 메소드 활용
        // 매개변수가 없는 경우, pull 방식으로 데이터 전달
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
