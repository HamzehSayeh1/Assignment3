# Weather Monitoring System
this project a flexible Weather Monitoring System using the Obserever and Decorator design patterns.

The System easily extensible new decorators can be added wothout modifying exisiting code(applying open/close principle).

The Observer pattern separates the weather data subjects and observers and they can be added or removed independently.
# Observer Pattern
# WeatherDataSubject 
This interface has the methodes to add or remove observers and notify them of changes.

# WeatherDataObserver
This interface declares the update method which concrete observers implement to receive and display weather data

# WeatherStation
It has a list of observers and notifies them when the weather data changes by the setMeasurements method 

# CurrentConditionsDisplay and StatisticsDisplay 
observer classes that display weather data

# Decorator Pattern
# WeatherDataDecorator
this abstract class implemnts the WeatherDataObserver interface and concrete decorator classes extend this class to add specific behavior
