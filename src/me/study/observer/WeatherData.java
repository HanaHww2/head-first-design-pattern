package me.study.observer;

import me.study.observer.simpleobservable.Observer;
import me.study.observer.simpleobservable.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData implements Subject {
    private static float temperature;
    private static float humidity;
    private static float pressure;
    private ArrayList<Observer> observers;

    /*
    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticDisplay statisticDisplay;
    private ForecastDisplay forecastDisplay;
    */

    /*
    * TODO 싱글톤으로 만든다면?
    * */
    public WeatherData() {
        this.observers = new ArrayList<>();
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
        /*
        * 디스플레이들은 하나의 인터페이스를 구현하여 추상화가 되어있으나,
        * 아래 코드는 구현체를 사용하여 추상화를 제대로 활용하지 못하고 있다.
        * */
        //currentConditionDisplay.update(temperature, humidity, pressure);
        //statisticDisplay.update(temperature, humidity, pressure);
        //forecastDisplay.update(temperature, humidity, pressure);
        notifyObservers(); // 로 대체된다.
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

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    /*
    * 푸시 방식 : 주제가 옵저버들에게 갱신된 데이터를 한꺼번에 전달한다.
    * */
    @Override
    public void notifyObservers() {
        this.observers.stream()
                .forEach(x -> x.update(temperature, humidity, pressure));

        /*for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }*/
    }
}
