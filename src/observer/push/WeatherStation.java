package observer.push;

import observer.push.CurrentConditionDisplay;
import observer.push.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.registerObserver(currentDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
