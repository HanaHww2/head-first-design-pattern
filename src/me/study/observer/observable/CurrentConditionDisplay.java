package me.study.observer.observable;

import me.study.observer.display.Display;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CurrentConditionDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    /*
    * 주제 객체를 매개변수로 갖는 생성자를 이용해서
    * 해당 디스플레이 객체 생성시에 바로 주제의 옵저버로 등록한다.
    * */
    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    /*
    * pull 방식으로 observable 객체에서 필요한 데이터를 직접 가져온다.
    * 관찰자(구독자)가 필요한 데이터를 가능한 만큼 가져올 수 있다는 점에서
    * observer 패턴에서 push 방식보다 pull 방식이 권장된다.
    * */
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : " + temperature + " F degree and " + humidity + " % humidity");
    }

}
