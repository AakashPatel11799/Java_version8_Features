package in.aakash.stream.practise;

import java.util.Arrays;

public class NumsOfSum {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		/*
		 * for (int i : nums) { sum=sum+i; } System.out.println(sum);
		 */

		// stream().reduce() is used to combine multiple values into single value.
		int reduce = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
		System.out.println(reduce);

	}

}
