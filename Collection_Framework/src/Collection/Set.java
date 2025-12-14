package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		//1. HashSet
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
		
		//2. LinkedHashSet
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Ajay");
		System.out.println(lhs);
		
		//3. TreeSet
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(125);
		ts.add(175);
		System.out.println(ts.ceiling(50));//if element found then return same element
		System.out.println(ts.ceiling(55));//else return nearest-Highest element(100)
		System.out.println(ts.higher(50));//always return higher
		
		System.out.println(ts.floor(50));//if element found then return same element
		System.out.println(ts.floor(45));//else return nearest-Lowest element(25)
		System.out.println(ts.lower(50));//always return lower
		
		System.out.println(ts.subSet(50, 150));//goes from specific element to desired element - 1
		System.out.println(ts.subSet(50,  true , 175, true));//goes from specific element to desired element
		
		System.out.println(ts.headSet(100));//return its previous all elements
		System.out.println(ts.tailSet(100));//returns its next all elements
		
		System.out.println(ts.descendingSet());//returns ts all elements in descending form
	}
}
