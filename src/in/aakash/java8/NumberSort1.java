package in.aakash.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Approach -1
public class NumberSort1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("Before Sorting : " + al);

		// Collections.sort(al, new NumberComparator());
		// Collections.sort(al, (i, j) -> i.compareTo(j));
		// System.out.println("After Sorting : " + al);

		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);
		System.out.println("After Sorting  : " + al);
	}
}

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j) {
		if (i > j) {
			return -1;
		} else if (i < j) {
			return 1;
		}
		return 0;
	}

}