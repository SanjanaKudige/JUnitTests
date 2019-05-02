package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class prob1;
	@Before
	public void setUp() throws Exception {
		prob1=new Problem1Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem1.csv")
	public void test(int testcasenumber, double total,boolean existingmember, boolean validDisc, boolean validCoupon, double Purchase, boolean discApplied,String comments ) {
		prob1.calcPurchase(total, existingmember, validDisc, validCoupon);
		assertEquals(Purchase, prob1.getPurchaseTotal(), 0.01);
		assertEquals(discApplied, prob1.isDiscountVerified());
	}

}
