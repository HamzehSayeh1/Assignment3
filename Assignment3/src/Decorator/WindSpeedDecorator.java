package Decorator;

import Obserever.WeatherDataObserver;

public class WindSpeedDecorator extends WeatherDataDecorator {
    private double windSpeed;

    public WindSpeedDecorator(WeatherDataObserver decoratedObserver,double windSpeed){
        super(decoratedObserver);
        this.windSpeed=windSpeed;
    }

    @Override
    public void update(double temperature, double humidity) {
        super.update(temperature,humidity);
        System.out.println("Wind Speed: "+windSpeed);
    }
}
