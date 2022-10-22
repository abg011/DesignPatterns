import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private String temperature;
    private String humidity;
    private String pressure;

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        String temperature = getTemperature();
        String pressure = getPressure();
        String humidity = getHumidity();

        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void measurementsChanged(String temperature, String humidity, String pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
