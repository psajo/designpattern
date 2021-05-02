package observer.push;

import observer.push.Observer;
import observer.push.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> obs;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.obs = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyObservers() {
        obs.forEach(ob->ob.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
