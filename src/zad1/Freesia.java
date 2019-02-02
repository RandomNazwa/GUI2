package zad1;

public class Freesia extends Flower{

    String kind, colour;
    double price;

    Freesia(int quantity) {
        super(quantity);
        kind = "frezja";
        colour = "żółty";

        //sprawdzam czy kwiat jest w cenniku, jeśli nie, ustawiam cenę na -1
        if (PriceList.lista.containsKey("frezja")){ price = PriceList.lista.get("frezja"); }
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