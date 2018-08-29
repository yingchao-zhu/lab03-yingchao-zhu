package edu.ucsb.cs56.pconrad.menuitem;

public class MenuItem {

    private String name;
    private int priceInCents;
    private String category;

    /**
     Custom exception thrown when getPrice is called with a width
     that is too narrow for the formatted price.
     */

    public static class TooNarrowException extends RuntimeException {}


    public MenuItem(String name, int priceInCents, String category) {
        this.name = name;
        this.priceInCents = priceInCents;
this.category = category;
		// stub
    }
    public String getCategory(){
	return category;	
        //return "stub";
    }
    
    public String getName(){
	return name;
        //return "stub";
}
    /**
     Returns the price, formatted as a string with a $.
     For example "$0.99", "$10.99", or "$3.50"
     */

    public String getPrice() {
        double price = priceInCents/100.0;
        //df.format(price/100.0);
        String priceS = Double.toString(price);
        
	return "$" + priceS;
		//return "stub";
    }
	
    /**
     Returns the price, formatted as a string with a $,
     right justified in a field with the specified width.
     For example "$0.99", "$10.99", or "$3.50".

     If the width is too small, throws IllegalArgumentException

     @param width width of returned string

     */

    public String getPrice(int width) {
        if(width <= Integer.toString(this.priceInCents).length() + 1){
            throw new TooNarrowException();
        }
        /*else if(this.priceInCents >1000 && width < 5)
            throw new TooNarrowException();*/
        
	return String.format("%1$"+width+ "s", getPrice());
	//	return "stub";
    }
    public int getPriceInCents(){
	return this.priceInCents;
	//int x = 0;
        //return x;
}
    /**
     * return a string in csv format, in the order name,price,cateogry.
     * For example <code>Small Poke Bowl,1049,Poke Bowls</code>
     * @return string in csv format
     */

    @Override
    public String toString() {
        String output = getName() + ","+ Integer.toString(getPriceInCents()) + "," + getCategory();
	return output;
		//return "stub";
    }

}
