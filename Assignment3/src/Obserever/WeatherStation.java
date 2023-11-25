package Obserever;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherDataSubject {
    private List<WeatherDataObserver> observers;
    private double temperature;
    private double humidity;


    public WeatherStation(){
        observers =new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature,humidity));

    }
    public void setMeasurements(double temperature,double humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObservers();
    }
}
