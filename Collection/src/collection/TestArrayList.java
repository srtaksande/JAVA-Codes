package collection;

import java.util.ArrayList;

public class TestArrayList {

	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2.0);
		list.add(3.0f);
		list.add("Five");
		System.out.println(list);
		
		list.add(3,4);
		System.out.println(list);
        
		list.remove(0);
		System.out.println(list);
		
		
		list.add(3,5);
		System.out.println(list);
	}

}
