package zad1;

public abstract class Flower {

    int quantity;

    public Flower(int quantity) {
        this.quantity = quantity;
    }

    public abstract String toString();
    public abstract String getColour();
    public abstract double getPrice();
    public abstract double getCost();
}