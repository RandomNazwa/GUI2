package zad1;

import java.util.HashMap;

public class PriceList extends HashMap <String, Double> {

	static PriceList lista;
    
	private static final long serialVersionUID = 1L;   //uniwersalny identyfikator dla listy
    
	public static final PriceList INSTANCE = new PriceList();
    

    private PriceList() {}

    public static PriceList getInstance() { return lista = new PriceList(); }


}