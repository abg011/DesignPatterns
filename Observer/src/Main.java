public class Main {
    public static void main(String[] args) {
        WeatherData weatherDataSubject = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        Observer statsDisplay = new StatsDisplay();
        Observer forecastDisplay = new ForecastDisplay();

        weatherDataSubject.subscribe(currentConditionsDisplay);
        weatherDataSubject.measurementsChanged("10", "15", "20");
        weatherDataSubject.notifyObservers();
        System.out.println();

        weatherDataSubject.subscribe(statsDisplay);
        weatherDataSubject.measurementsChanged("11", "16", "21");
        weatherDataSubject.notifyObservers();
        System.out.println();

        weatherDataSubject.subscribe(forecastDisplay);
        weatherDataSubject.measurementsChanged("12", "17", "22");
        weatherDataSubject.notifyObservers();
        System.out.println();

        weatherDataSubject.unsubscribe(statsDisplay);
        weatherDataSubject.measurementsChanged("13", "18", "23");
        weatherDataSubject.notifyObservers();
        System.out.println();

    }
}
