package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Iterator_practice {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        //1. Iterator - allows forward directional access
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer s = iterator.next();
            System.out.println(s);
        }
        //2. List Iterator - Both forward and backward
        for(ListIterator<Integer> lit = a.listIterator();lit.hasNext();) {
			System.out.println(lit.next());
		}
        //3. Spliterator - Forward only, but optimized for bulk operations
        Spliterator<Integer> sp = a.spliterator();
		while (sp.tryAdvance(x -> System.out.println(x)));
		a.spliterator().forEachRemaining(System.out::println);
		
    }
}
