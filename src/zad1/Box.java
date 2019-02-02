package zad1;

import java.util.ArrayList;

public class Box extends List{

    ArrayList<Flower> chosen;

    Box(Customer customer){
        super(customer);
        chosen = new ArrayList<Flower>();
    }

    @Override
    public void push(Flower flower){ chosen.add(flower); }

    @Override
    public void pop(Flower flower) { chosen.remove(chosen.indexOf(flower)); }

    @Override
    public void pop(int number){ chosen.remove(number); }

    @Override
    public String toString() {
        String whatInBox = "pudełko właściciel " + customer.name + "\n";
        if (chosen != null) {
            
        	for (int i = 0; i < chosen.size(); i++){
                
        		if (i < (chosen.size() - 1)){ whatInBox +=  chosen.get(i).toString() + "\n"; }
        		
        		else { whatInBox +=  chosen.get(i).toString(); } } }
        
        else { whatInBox = "pudełko własciciel " + customer.name + " -- pusto"; }
       
        return whatInBox;

    }
}