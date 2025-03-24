package javaday4prgms;
import java.util.*;

public class collections_framework {
	public static void main(String[]args) {
	
//LIST
//ArrayList		
		ArrayList<Integer> arrlist = new ArrayList<>(); //access integer datatype [to access all datatypes-ArrayList arrlist = new ArrayList<>();]
		//for loop
		for(int i=1;i<=10;i++)
		{
			arrlist.add(i);
			System.out.println(arrlist);
		}
		
		//for each loop
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(300);
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.set(0, 1000));         //arraylist with using set
		System.out.println(arrlist.get(0));               //arraylist with using get
		System.out.println(".......................");
		for(int i:arrlist) {
			System.out.println(i);
		}
		
//LinkedList
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println(ll.add(1));
		ll.addFirst(0);
		ll.addLast(11);
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.remove(1));
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		ll.clear();
		System.out.println(ll);
		
//QueueList
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		System.out.println(q);
		System.out.println(q.peek());           //peek displays 1st value
		
		
		
//SET
//HashSet
		HashSet<Integer> hs = new HashSet<>();
		hs.add(400);
		hs.add(300);
		hs.add(200);
		hs.add(100);
		System.out.println(hs);     //doesn't allow duplicate and displays in unordered way
		
//TreeSet
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(400);
		ts.add(300);
		ts.add(200);
		ts.add(100);
		System.out.println(ts);     //sort the values and displays in ordered way
		
		
		
//MAP
//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 3);
		map.put("Banana", 2);
		map.put("Orange", 5);
		System.out.println("HashMap:"+map);    //adding key-value pairs(put)
		System.out.println("Apple count:"+map.get("Apple"));  //getting the value(get)
		map.remove("Orange");
		System.out.println("After removing Orange:"+map);    //to remove the key(remove)
		if (map.containsKey("Banana")) {
			System.out.println("Banana is in the map");      //checking a key exists(containsKey)
		}
		System.out.println("Size of HashMap:"+map.size());   //to check the size
		System.out.println("Iterating using entrySet:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("Iterating using keySet:");
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
//Iterators	
	ArrayList<String> fruits = new ArrayList<>();
	fruits.add("Apple");
	Iterator<String> iterator = fruits.iterator();
	System.out.println("Fruits using iterator");
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}