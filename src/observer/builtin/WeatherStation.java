package observer.builtin;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        weatherData.setMeasurements(80,60,30.4f);
        weatherData.setMeasurements(90,50,25.1f);
    }
}
