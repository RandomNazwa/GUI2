package zad1;

public class Lilac extends Flower {

    String kind, colour;
    double price;

    Lilac(int quantity) {
        super(quantity);
        kind = "bez";
        colour = "biały";

        //sprawdzam czy kwiat jest w cenniku, jeśli nie, ustawiam cenę na -1
        if (PriceList.lista.containsKey("bez")){ price = PriceList.lista.get("bez"); }
        else { price = -1; }
    }

    @Override
    public String toString() { return kind + ", kolor: " + colour + ", ilość " + quantity + ", cena " + getPrice(); }

    @Override
    public String getColour() { return colour; }

    @Override
    public double getPrice() { return price; }

    @Override
    public double getCost() { return price * quantity; }

}