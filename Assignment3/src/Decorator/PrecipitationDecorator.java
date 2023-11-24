package Decorator;

import Obserever.WeatherDataObserver;

public class PrecipitationDecorator extends WeatherDataDecorator{
    String precipitation;
    public PrecipitationDecorator(WeatherDataObserver decoratedObserver,String precipitation){
        super(decoratedObserver);
        this.precipitation=precipitation;
    }

    @Override
    public void update(double temperature, double humidity) {
        super.update(temperature,humidity);
        System.out.println("Precipitation:" +this.precipitation);
    }
}
