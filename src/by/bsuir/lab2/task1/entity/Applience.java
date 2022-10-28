package by.bsuir.lab2.task1.entity;

public abstract class Applience {
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String GetName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("Price: %f", this.price);
    }
}
