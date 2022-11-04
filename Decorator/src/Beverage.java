// Concrete implementation of Beverage abstract class.
public abstract class Beverage {
    String description = "Unknown beverage";
    Size size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
