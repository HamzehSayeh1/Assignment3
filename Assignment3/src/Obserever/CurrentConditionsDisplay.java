package Obserever;

public class CurrentConditionsDisplay implements WeatherDataObserver{
    @Override
    public void update(double temperature, double humidity) {
        System.out.print("Current Conditions: Temperature: "+temperature+" Humidity: "+humidity);
    }
}
