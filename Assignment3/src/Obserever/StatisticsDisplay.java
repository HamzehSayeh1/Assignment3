package Obserever;

public class StatisticsDisplay implements WeatherDataObserver{
    @Override
    public void update(double temperature, double humidity) {
        System.out.println(" Statistics: Average Temperature: "+temperature +" Average Humidity: "+humidity);
    }
}
