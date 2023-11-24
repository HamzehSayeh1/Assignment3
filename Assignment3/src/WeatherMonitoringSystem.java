import Decorator.PrecipitationDecorator;
import Decorator.TemperatureUnitsDecorator;
import Decorator.WeatherDataDecorator;
import Decorator.WindSpeedDecorator;
import Obserever.CurrentConditionsDisplay;
import Obserever.StatisticsDisplay;
import Obserever.WeatherDataObserver;
import Obserever.WeatherStation;

public class WeatherMonitoringSystem {
    public static void main(String[] args){
        WeatherStation weatherStation1 = new WeatherStation();
        WeatherStation weatherStation2 = new WeatherStation();

        WeatherDataObserver currentConditionsDisplay1 = new CurrentConditionsDisplay();
        WeatherDataObserver statisticsDisplay1 = new StatisticsDisplay();

        weatherStation1.registerObserver(currentConditionsDisplay1);
        weatherStation1.registerObserver(statisticsDisplay1);

        WeatherDataObserver currentConditionsDisplay2 = new CurrentConditionsDisplay();
        WeatherDataObserver statisticsDisplay2 = new StatisticsDisplay();

        weatherStation2.registerObserver(currentConditionsDisplay2);
        weatherStation2.registerObserver(statisticsDisplay2);

        System.out.println("weather updates for Station 1");
        weatherStation1.setMeasurements(25, 60);

        System.out.println("weather updates for Station 2");
        weatherStation2.setMeasurements(30, 70);

        //changing Temperature from C to F for Station 1
        WeatherDataDecorator decoratedObserver1 = new TemperatureUnitsDecorator(currentConditionsDisplay1, "F");

        //adding Wind Speed for Station 1
        decoratedObserver1 = new WindSpeedDecorator(decoratedObserver1,3);

        weatherStation1.registerObserver(decoratedObserver1);

        System.out.println("another weather updates for Station 1");
        weatherStation1.setMeasurements(28, 65);

        WeatherDataDecorator decoratedObserver2 = new PrecipitationDecorator(statisticsDisplay2,"Partly Cloudy");
        decoratedObserver2 = new WindSpeedDecorator(decoratedObserver2,6);

        weatherStation2.registerObserver(decoratedObserver2);

        System.out.println("weather updates for Station 2");
        weatherStation2.setMeasurements(32, 75);
    }
}


