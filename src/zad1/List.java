package zad1;

public abstract class List {

    Customer customer;

    List(Customer customer){
        this.customer = customer;
    }

    public abstract void push(Flower flower);
    public abstract void pop(Flower flower);
    public abstract void pop(int number);  
    public abstract String toString();
}
