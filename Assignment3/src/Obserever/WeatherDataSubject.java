package Obserever;

public interface WeatherDataSubject {
     void registerObserver(WeatherDataObserver observer);
     void removeObserver(WeatherDataObserver observer);
     void notifyObservers();
}
