package zad1;

import java.util.ArrayList;

public class ShoppingCart  extends List{

    ArrayList<Flower> bouquet;

    ShoppingCart(Customer customer){
        super(customer);
        bouquet = new ArrayList<>();
    }

    @Override
    public void push(Flower flower){ bouquet.add(flower); }

    @Override
    public void pop(Flower flower) { bouquet.remove(bouquet.indexOf(flower)); }
    
    @Override
    public void pop(int number){ bouquet.remove(number); }

    @Override
    public String toString() {    
        String whatInCart = "Wózek własciciel " + customer.name + "\n";
        if (bouquet != null) {
            
        	for (int i = 0; i < bouquet.size(); i++){ 
            	
        		if (i < (bouquet.size() - 1))  { whatInCart +=  bouquet.get(i).toString() + "\n"; }
               
        		else   { whatInCart +=  bouquet.get(i).toString(); } } }
       
        else { whatInCart = "Wózek własciciel " + customer.name + " -- pusto"; }
        
        return whatInCart;

    }

    public void check() {       //sprawdzam czy kwiaty są umieszczone w cenniku
        for(int i = 0; i < bouquet.size(); i++){
            if (bouquet.get(i).getPrice() < 0 )
                pop(i);
        }
    }
}