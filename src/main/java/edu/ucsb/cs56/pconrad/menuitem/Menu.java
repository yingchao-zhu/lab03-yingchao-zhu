package edu.ucsb.cs56.pconrad.menuitem;
import java.util.ArrayList;
import java.util.Comparator;

public class Menu {
	
    private ArrayList<MenuItem> menuitems;

    public Menu() {
        menuitems = new ArrayList<MenuItem>();
    }

    public void add(MenuItem mi) {
	menuitems.add(mi);
	// stub
    }

    public String csv() {
        String result = "";
        String nl = System.lineSeparator();
        for(MenuItem m : menuitems){
            result += m.toString();
            result += nl;
        }
	return result;
       // return "stub";
    }


    public String csvSortedByPriceThenName() {
        Comparator<MenuItem> groupByComparator = Comparator.comparing(MenuItem::getPriceInCents) .thenComparing(MenuItem::getName);
        menuitems.sort(groupByComparator);
        
       
	return csv();

      // return "stub";
    }

    public String csvSortedByName() {
        menuitems.sort((MenuItem m1, MenuItem m2)->m1.getName().compareTo(m2.getName()));
	return csv();
       // return "stub";
    }

    public String csvSortedByCategoryThenName() {
        Comparator<MenuItem> groupByComparator = Comparator.comparing(MenuItem::getCategory)
        .thenComparing(MenuItem::getName);
        menuitems.sort(groupByComparator);
	return csv();
        //return "stub";

    }

    public String csvSortedByCategoryThenPriceDescendingThenByName() {
        Comparator<MenuItem> groupByComparator = Comparator.comparing(MenuItem::getCategory).thenComparing((MenuItem m1, MenuItem m2)->m2.getPriceInCents()-m1.getPriceInCents()).thenComparing(MenuItem::getName);
        menuitems.sort(groupByComparator);

	return csv();
        //return "stub";
    }
}
