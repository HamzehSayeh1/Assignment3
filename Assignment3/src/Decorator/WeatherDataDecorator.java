package Decorator;

import Obserever.WeatherDataObserver;

public abstract class WeatherDataDecorator implements WeatherDataObserver {
    private WeatherDataObserver dataObserver;
    public WeatherDataDecorator(WeatherDataObserver dataObserver){
        this.dataObserver=dataObserver;
    }

    @Override
    public void update(double temperature, double humidity) {
        dataObserver.update(temperature,humidity);
    }

}
