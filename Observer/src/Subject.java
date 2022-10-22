public interface Subject {
    void notifyObservers();
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
}
