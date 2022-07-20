package me.study.observer;

import me.study.observer.display.CurrentConditionDisplay;
import me.study.observer.display.ForecastDisplay;
import me.study.observer.display.StatisticDisplay;

public class WeatherData {
    private static float temperature;
    private static float humidity;
    private static float pressure;
    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticDisplay statisticDisplay;
    private ForecastDisplay forecastDisplay;

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
        currentConditionDisplay.update(temperature, humidity, pressure);
        statisticDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
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
