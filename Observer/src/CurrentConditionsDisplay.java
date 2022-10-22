public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private String temperature;
    private String pressure;
    private String humidity;

    @Override
    public void display() {
        System.out.println("Current Conditions: (Temperature: " + getTemperature() + ", Pressure: " + getPressure() + ", Humidity: " + getHumidity() + ")");
    }

    @Override
    public void update(String temperature, String pressure, String humidity) {
        setHumidity(humidity);
        setTemperature(temperature);
        setPressure(pressure);

        display();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
