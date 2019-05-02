package Homework5;

public class Problem3Class {

	public boolean sumEvenOdd (int[] nums) {
/*	 	sumEvenOdd determines if the sum of the single digit odd ints 
		equals the sum of the single digit even ints.
		non compliant int values are ignored
*/
		int sumEven=0,sumOdd=0; 
		for (int i = 0; i<nums.length; i++)
			if (nums[i]>=-9 && nums[i]<=9)
				if (nums[i]%2==0)
					sumEven += nums[i];
				else
					sumOdd += nums[i];

		return sumEven==sumOdd;
	 }
	}
																					