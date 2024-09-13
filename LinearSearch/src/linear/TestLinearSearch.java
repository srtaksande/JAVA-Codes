package linear;

public class TestLinearSearch {

	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		
		int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int x= 12;
		
		int result = ls.linearSearch(array, x);
		
		if ( result == -1)
			System.out.println("Element NOT Found");
		else
			System.out.println("Element found at index No. : " + result);
	}

}
