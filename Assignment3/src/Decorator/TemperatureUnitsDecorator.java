package Decorator;

import Obserever.WeatherDataObserver;

public class TemperatureUnitsDecorator extends WeatherDataDecorator {

    private String units;
    public TemperatureUnitsDecorator(WeatherDataObserver decoratedObserver,String units){
        super(decoratedObserver);
        this.units=units;
    }
    @Override
    public void update(double temperature, double humidity) {
       if(units.equals("F")){
           temperature=((temperature*9)/5)+32;
       }
        super.update(temperature,humidity);
    }
}
