package zad1;

public class Rose extends Flower {

    String kind, colour;
    double price;

    Rose(int quantity) {
        super(quantity);
        kind = "róża";
        colour = "czerwony";

        //sprawdzam czy kwiat jest w cenniku, jeśli nie, ustawiam cenę na -1
        if (PriceList.lista.containsKey("róża")){ price = PriceList.lista.get("róża"); }
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