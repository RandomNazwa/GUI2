package zad1;

public class Customer {

    String name;
    double money;
    ShoppingCart cart;

    Customer(String name, double money) {
        this.name = name;
        this.money = money;
        cart = new ShoppingCart(this);
    }

    public void get(Flower flower) { cart.push(flower); }    //dodaję kwiaty do wózka

    public ShoppingCart getShoppingCart(){ return cart; }      //zwracam zawartość wózka

    public double getCash() { return money; }         //zwracam aktualny stan portfela


    public void pay() {           //płatność, ze sprawdzeniem czy kwiaty znajdują się w cenniku
        cart.check();
        for (int i = 0; i < cart.bouquet.size(); i++) {
            double payment = 0;
            
            if((cart.bouquet.get(i).getCost() + payment ) > money) { cart.pop(i); }  //usuwam z wozka kwiaty na które nie starczyło pieniędzy
            
            else { payment = cart.bouquet.get(i).getCost();
                money = money - payment; }
        }

    }

    public void pack(Box box) {
        for (Flower bought : cart.bouquet){
            box.push(bought);         //dodaję każdy kwiat do pudełka
            cart.bouquet = null;         //wózek już jest pusty
        }
    }

}