package Collection;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

//List and Legacy classes
public class List {
	public static void main(String[] args) {
		//1. ArrayList
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(1, 20);
		System.out.println(a.get(1));
		System.out.println(a.getClass().getName());
		//iterating in arraylist
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//Disadvantage-
		//when we insert or remove an element at the start or middle, 
		//it causes shifting of elements,which is costly in terms of performance. 
		//In such cases, LinkedList is preferred so,
		//Use ArrayList when → you need fast random access and
		//most operations are read-heavy.
		
		//2. LinkedList
		//additional methods -> 
		//addFirst() -> add at index 0,
		//addLast() -> add at last index,
		//offer ->Return boolean after check that element is present or not,
		//peek -> Returns head element without removing,
		//poll -> Returns head element and removes it
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		System.out.println(l1.offer(10));
		//disadvantage- trade-off is that LinkedList consumes more memory
		//due to node references and is slower for random access, 
		//as it requires traversal from the head or tail.
		
		//3. Stack
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.capacity());
		
		//4. Vector
		Vector  v = new Vector();
		v.addElement(10);
		v.addElement(20);
		System.out.println(v);
		
		//Enumeration
		Enumeration <Integer> enm = v.elements();
		while(enm.hasMoreElements()) {
			Object o = enm.nextElement();
			System.out.println(o);
		}
		
		//Legacy classes
		// 1.Stack , 2.Vector, 3.HashTable, 4.Properties, 5.Dictionary
		
		//Properties(key,value)
		Properties p = new Properties();
		p.put("1", "Ajay");
		System.out.println(p);
		//using enumeration
		Enumeration<Object> e = p.elements(); //value
//		Enumeration<?> e = p.propertyNames(); //key
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Dictionary
		Dictionary<Integer, String> d = new Hashtable<>();
		d.put(101, "Ajay");
		Enumeration<Integer> keys = d.keys(); //Key
		Enumeration<String> values = d.elements(); //Value
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
            System.out.println(values.nextElement());
        }
        
        //HashTable
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Ajay");
        Enumeration<Integer> k = ht.keys();
        while (k.hasMoreElements()) {
            Integer key = k.nextElement();
            System.out.println(key);
            System.out.println(ht.get(key));
        }
	}
}
